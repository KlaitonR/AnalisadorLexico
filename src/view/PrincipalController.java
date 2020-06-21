package view;
import java.util.ArrayList;
import java.util.Objects;

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
	ArrayList<Token> tabelaDeTokensAux = new ArrayList<>();
	ArrayList<String> erroTokens = new ArrayList<>();
	ArrayList<Number> erroLinha = new ArrayList<>();
	
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
		String tk = "";
		int nlinhas = 0;
		boolean aceitacao = true;
		String anterior = "";
		
		tabelaDeTokens.clear();
		tabelaDeTokensAux.clear();
		tokens.clear();
		erroLinha.clear();
		erroTokens.clear();
		
		atual = afd.q0;  //Estado inicial
		
		txtCodigo = TACodigo.getText();
		txtCodigo += " " ;
		

		char[] chars = txtCodigo.toCharArray(); //transforma o c�digo em um vetor de chars
		
		for(int i=0; i<chars.length; i++) {

				proximo = regras.tabelaTransacao(Character.toString(chars[i]), atual, afd); 
				
				if(proximo.grupo != null) {
			
				if((!atual.grupo.equals("Abre Parenteses") && !proximo.grupo.equals("InicioComentario")) ||
						!atual.grupo.equals("comentario") ||
						!proximo.grupo.equals("comentario") ||
						(!atual.grupo.equals("comentario") && !proximo.grupo.equals("FechaComentario"))){
				
					if(proximo.grupo.equals(atual.grupo)) {
						
						if(!atual.grupo.equals("inicial")) 
							tk += Character.toString(chars[i]);
						
						if(atual.grupo.equals("inicial")) 
							tk = "";
						
					}
					
					if(!proximo.grupo.equals(atual.grupo)) {
						
						if(atual.grupo.equals("inicial")) {
							
							if(anterior.equals(proximo.grupo)) {
								tk = Character.toString(chars[i]);
								anterior = proximo.grupo;
								System.out.println("Token " + tk + "\n");
							}
							
							if(anterior.equals("")) {
								tk = Character.toString(chars[i]);
								System.out.println("Token " + tk + "\n");
								anterior = proximo.grupo;
							}
							
							if(!anterior.equals(proximo.grupo)) {
								
								if(!tk.equals(""))
									tokens.add(tk);
									
								tk = Character.toString(chars[i]);
								System.out.println("Token " + tk + "\n");
								
								anterior = "";
							}
							
						}
						
						if(!atual.grupo.equals("inicial") && proximo.grupo.equals("inicial")) {
							tokens.add(tk); 
							System.out.println("Token " + tk + "\n");
							tk = "";
						}
						
						if(!atual.grupo.equals("inicial") && !proximo.grupo.equals("inicial")) {
							
							if(anterior.equals(proximo.grupo)) {
								tk = Character.toString(chars[i]);
								anterior = proximo.grupo;
								System.out.println("Token " + tk + "\n");
							}
						
							if(anterior.equals("")) {
								tokens.add(tk);
								tk = Character.toString(chars[i]);
								System.out.println("Token " + tk + "\n");
								anterior = proximo.grupo;
							}
							
							if(!anterior.equals(proximo.grupo)) {
								
								if(!tk.equals(""))
									tokens.add(tk);
								
								tk = Character.toString(chars[i]);
								System.out.println("Token " + tk + "\n");
								
								anterior = "";
							}
						
						}
						
					}
					
				}else {
					
						tk = "";
				}
				
				System.out.println("Estimulo " + Character.toString(chars[i]));
				System.out.println("Estado atual " + atual.grupo);
				System.out.println("Pr�ximo estado " + proximo.grupo + "\n");
	
				aceitacao = verificaAceitacao(atual, proximo);
				
				if(aceitacao) {
					aceitacao = true;
					erroLinha.add(nlinhas);
					erroTokens.add(Character.toString(chars[i-1]));
				}
				
				atual = proximo;
				
			}else {
				atual = afd.q0;
				proximo = afd.q0;
				
				if(!tk.equals(""))
					tokens.add(tk);
				
				tk = "";
				nlinhas++;
			}
			
			for(int j=0;j<tokens.size();j++) {
				System.out.println("Tabela de tokens " + tokens.get(j) + "\n");
			}
		}
		
		achaSimbolosIguaisLinguagem(linguagem);
		encontraTokensVariaives(linguagem);
		removeTokensRepetidos();
		tableViewTokens();
		iniciaTable();
		
		if(!erroTokens.isEmpty()) {
			
			String erros = "S�mbolos que n�o pertencem a l�nguagem \n";
			
			for(int i=0;i<erroTokens.size();i++) {
				if(!erroTokens.get(i).equals(" "))
					erros += "Token: " + erroTokens.get(i) + " " + "Linha: " + erroLinha.get(i) + "\n";
			}
			
			mostraMensagem("ERRO L�XICO \n" + erros , AlertType.ERROR);
		}
		
	}
	
	 private boolean verificaAceitacao(Estado atual, Estado proximo) {
		 return ((atual.estadoFinal == false && 
					proximo.estadoFinal == true && 
					!proximo.grupo.equals(atual.grupo)) || 
					(atual.estadoFinal == false && 
					proximo.estadoFinal == false && 
					!proximo.grupo.equals(atual.grupo)) ||
					(atual.grupo.equals("caracters especiais")) &&
					!proximo.grupo.equals("caracters especiais"));
		 }	
	
	private void achaSimbolosIguaisLinguagem(Linguagem linguagem) {
		for (int i = 0; i < tokens.size(); i++) {
			for (int j = 0; j < linguagem.tabelaDeSimbolos.size(); j++) {
				if (tokens.get(i).equals(linguagem.tabelaDeSimbolos.get(j).getSimbolo())) {
					Token token = new Token(linguagem.tabelaDeSimbolos.get(j).getCodigo(),
							linguagem.tabelaDeSimbolos.get(j).getSimbolo(),
							linguagem.tabelaDeSimbolos.get(j).getGrupo());
					tabelaDeTokensAux.add(token);
				}
			}
		}
 }
	
	 private void encontraTokensVariaives(Linguagem linguagem) {
			String varAntiga = "";
			for (int i = 0; i < tokens.size(); i++) {
					if (Objects.nonNull(tokens) && Character.toString(tokens.get(i).charAt(0)).matches("[0-9]*") && !tokens.get(i).equals(varAntiga)) {
						Token token = new Token(linguagem.tabelaDeSimbolos.get(25).getCodigo(), tokens.get(i),
								linguagem.tabelaDeSimbolos.get(25).getGrupo());
						tabelaDeTokens.add(token);
						varAntiga = tokens.get(i);
					} else if (Character.toString(tokens.get(i).charAt(0)).equals("\"")
							&& Character.toString(tokens.get(i).charAt(tokens.get(i).length())).equals("\"") && !tokens.get(i).equals(varAntiga)) {
						Token token = new Token(linguagem.tabelaDeSimbolos.get(47).getCodigo(), tokens.get(i),
								linguagem.tabelaDeSimbolos.get(47).getGrupo());
						tabelaDeTokens.add(token);
						varAntiga = tokens.get(i);
					} else if (!tokens.get(i).equals(varAntiga)) {
						Token token = new Token(linguagem.tabelaDeSimbolos.get(24).getCodigo(), tokens.get(i),
								linguagem.tabelaDeSimbolos.get(24).getGrupo());
						tabelaDeTokens.add(token);
						varAntiga = tokens.get(i);
					}
			}
	 }
	 
	 private void removeTokensRepetidos() {
			for (int i = 0; i < tabelaDeTokensAux.size(); i++) {
				for (int j = 0; j < tabelaDeTokens.size(); j++) {
					if (tabelaDeTokensAux.get(i).getToken().equals(tabelaDeTokens.get(j).getToken())) {
						tabelaDeTokens.remove(j);
						tabelaDeTokens.add(tabelaDeTokensAux.get(i));
					}
				}
			}
	 }
	
	 @FXML
	 private void tableViewTokens(){ 
		 
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
		
			a.setHeaderText(null);
			a.setContentText(msg);
			a.show();
		}
	
}