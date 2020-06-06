package view;
import java.util.ArrayList;

import Model.AutomatoFinito;
import Model.Estado;
import Model.Linguagem;
import Model.RegrasProducao;
import Model.Token;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

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
		RegrasProducao regras = new RegrasProducao();
		Estado atual = new Estado();
		Estado proximo = new Estado();
		AnalisadorLexico al = new AnalisadorLexico();
		String tk = "";
		
		atual = afd.q0;  //Estado inicial
		
		txtCodigo = TACodigo.getText();
		
		char[] chars = txtCodigo.toCharArray(); //transforma o código em um vetor de chars
		
		for(int i=0; i<chars.length; i++) {
			
			proximo = al.analisador(Character.toString(chars[i]), regras, atual); // Analisa o caracter
			
			//Verifica se o proximo estado é o mesmo do atual, se for, ainda é o mesmo token
			if(proximo == atual) {
				tk += chars[i];
			}
			
			//Se o proximo estado for diferente do atual, um novo token começou
			if(proximo != atual) {
				tokens.add(tk); //add na lista de tokens 
				tk = ""; //zera o token para nova analise
			}

			atual = proximo; //o proximo agora vira o atual
			
		}
		
		for(int i=0; i<tokens.size();i++) {
			for (int j=0; j<linguagem.tabelaDeSimbolos.size(); j++) {
				if(tokens.get(i).equals(linguagem.tabelaDeSimbolos.get(j).getSimbolo())) {
					
					//Cria o Token
					Token token = new Token(linguagem.tabelaDeSimbolos.get(j).getCodigo(),   
											linguagem.tabelaDeSimbolos.get(j).getSimbolo(), 
											linguagem.tabelaDeSimbolos.get(j).getGrupo());
					
					tabelaDeTokens.add(token); //Adiciona no Array de Tokens
				}
			}
			
		}
		
		tableViewTokens();
		iniciaTable();
		
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
	
}
