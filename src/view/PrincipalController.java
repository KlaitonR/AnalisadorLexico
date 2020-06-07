package view;
import java.util.ArrayList;

import Model.AutomatoFinito;
import Model.Estado;
import Model.Linguagem;
import Model.RegrasProducao;
import Model.Token;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;

public class PrincipalController {

	ArrayList<Token> tabelaDeTokens = new ArrayList<>();	
	ArrayList<String> tokens = new ArrayList<>();
	
	@FXML TextArea TACodigo;
	
	@FXML TableView<Token> tabTokens;
	@FXML TableColumn<Token,  Number> colCodigo;
	@FXML TableColumn<Token, String> colToken;
	@FXML TableColumn<Token, String> colDescricao;
	
	String txtCodigo;
	
	@FXML
	public void Confirmar() {
		
		Linguagem linguagem = new Linguagem();
		AutomatoFinito afd = new AutomatoFinito();
		afd.estados();
		RegrasProducao regras = new RegrasProducao();
		Estado atual = new Estado();
		Estado proximo = new Estado();
		String tk = "";
		int linhas = 0;
		boolean aceitacao = true;
		
		atual = afd.q0;  //Estado inicial
		
		txtCodigo = TACodigo.getText();
		
		char[] chars = txtCodigo.toCharArray(); //transforma o código em um vetor de chars
		
		for(int i=0; i<chars.length; i++) {
			
			proximo = regras.tabelaTransacao(Character.toString(chars[i]), atual, afd); // Analisa o caracter e retorna o estado para qual deve ir
			
			System.out.println("Estimulo " + Character.toString(chars[i]));
			System.out.println("Estado atual " + atual.grupo);
			System.out.println("Próximo estado " + proximo.grupo + "\n");
			
			//Verifica se o proximo estado é o mesmo do atual, se for, ainda é o mesmo token
			if(proximo == atual) {
				tk += chars[i];
			}
			
			//Se o proximo estado for diferente do atual, um novo token começou
			if(!proximo.grupo.equals(atual.grupo)) {
				
				if(!Character.toString(chars[i]).equals("") && !Character.toString(chars[i]).equals(" "))//Evitar tokens nulos
					tokens.add(tk); //add na lista de tokens 
				
				System.out.println("token " + tk + "\n");
				
				tk = ""; //zera o token para nova analise
				tk += Character.toString(chars[i]); //Inicia o novo token
				
				//Verifica se o atual é um estado final, se não for, verifica se o proximo é um estado final e se pertence ao mesmo grupo
				//Se não pertencer, significa que saiu de um estado não final, para um estado final que não é do grupo de
				//portanto, não irá aceitar essa sentença
				if ((atual.estadoFinal == false && 
						proximo.estadoFinal == true && 
						!proximo.grupo.equals(atual.grupo)) || 
						(atual.estadoFinal == false && 
						proximo.estadoFinal == false && 
						!proximo.grupo.equals(atual.grupo))) {
					aceitacao = false;
				}
				
			}

			atual = proximo; //o proximo agora vira o atual
			
		}
		
		//Cria os tokens e separa por grupos
		for(int i=0; i<tokens.size();i++) {
			for (int j=0; j<linguagem.tabelaDeSimbolos.size(); j++) {
				if(tokens.get(i).equals(linguagem.tabelaDeSimbolos.get(j).getSimbolo())) {
					
					//Cria o Token
					Token token = new Token(linguagem.tabelaDeSimbolos.get(j).getCodigo(),   
											linguagem.tabelaDeSimbolos.get(j).getSimbolo(), 
											linguagem.tabelaDeSimbolos.get(j).getGrupo());
					
					tabelaDeTokens.add(token); //Adiciona no Array de Tokens
				}else {
					if(Character.toString(tokens.get(i).charAt(0)).equals("0") ||
							Character.toString(tokens.get(i).charAt(0)).equals("1") ||
							Character.toString(tokens.get(i).charAt(0)).equals("2") ||
							Character.toString(tokens.get(i).charAt(0)).equals("3") ||
							Character.toString(tokens.get(i).charAt(0)).equals("4") ||
							Character.toString(tokens.get(i).charAt(0)).equals("5") ||
							Character.toString(tokens.get(i).charAt(0)).equals("6") ||
							Character.toString(tokens.get(i).charAt(0)).equals("7") ||
							Character.toString(tokens.get(i).charAt(0)).equals("8") ||
							Character.toString(tokens.get(i).charAt(0)).equals("9")) {
						
						Token token = new Token(linguagem.tabelaDeSimbolos.get(25).getCodigo(),tokens.get(i),linguagem.tabelaDeSimbolos.get(25).getGrupo());
						tabelaDeTokens.add(token); //Adiciona no Array de Tokens
						
					}else{
						if(Character.toString(tokens.get(i).charAt(0)).equals("\"") && 
								Character.toString(tokens.get(i).charAt(tokens.get(i).length())).equals("\"")) {
							
							Token token = new Token(linguagem.tabelaDeSimbolos.get(47).getCodigo(),tokens.get(i),linguagem.tabelaDeSimbolos.get(47).getGrupo());
							tabelaDeTokens.add(token); //Adiciona no Array de Tokens
							
						}else {
							Token token = new Token(linguagem.tabelaDeSimbolos.get(24).getCodigo(),tokens.get(i),linguagem.tabelaDeSimbolos.get(24).getGrupo());
							tabelaDeTokens.add(token); //Adiciona no Array de Tokens
						}
					}
				}
			}
		}
		
		for(int i=0;i<tokens.size();i++) {
			System.out.println("Tabela de tokens " + tokens.get(i) + "\n");
		}
		
		tableViewTokens();
		iniciaTable();
		
		if(aceitacao == false) {
			mostraMensagem("ERRO LÉXICO NA LINHA" + linhas, AlertType.ERROR);
		}
		
	}
	
	 @FXML
	 private void tableViewTokens(){
		 
		tabelaDeTokens.clear();
		tabTokens.setItems(FXCollections.observableArrayList(tabelaDeTokens));
				
	 }
	
	 @FXML
		public void iniciaTable() {
		 	colCodigo.setCellValueFactory(cellData -> cellData.getValue().codigoProperty());
			colToken.setCellValueFactory(cellData -> cellData.getValue().tokenProperty());
			colDescricao.setCellValueFactory(cellData -> cellData.getValue().descricaoProperty());
		}
	 
	 private void mostraMensagem (String msg, AlertType tipo) { // recebe uma String por paremetro
			
			Alert a = new Alert (tipo);
		
			a.setHeaderText(null); // modificar mensagem
			a.setContentText(msg);
			a.show();
		}
	
}
