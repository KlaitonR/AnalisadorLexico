package view;
import java.util.ArrayList;
import Model.Simbolo;
import Model.Token;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class PrincipalController {
	

	ArrayList<Token> tabelaDeTokens = new ArrayList<>();
	ArrayList<String> delimitadores = new ArrayList<>();
	
	ArrayList<String> tokens = new ArrayList<>();
	ArrayList<String> caracter = new ArrayList<>();
	
	@FXML TextArea TACodigo;
	
	@FXML TableView<Token> tabTokens;
	@FXML TableColumn<Token,  Number> colCodigo;
	@FXML TableColumn<Token, String> colToken;
	@FXML TableColumn<Token, String> colDescricao;
	
	String txtCodigo;
	
	@FXML
	public void Confirmar() {
		
		AnalisadorLexico al = new AnalisadorLexico();
		
		txtCodigo = TACodigo.getText();
		
		//System.out.println(txtCodigo); //ok
		
		//linguagem(); //Carrega a linguagem (A tabela de simbolos)
		
		char[] chars = txtCodigo.toCharArray(); //transforma o código em um vetor de chars
		
		for(int i=0; i<chars.length; i++) {
			
			al.analisador(Character.toString(chars[i]));
			
		}
		
		//System.out.println(chars); //ok
		
//		String tk = ""; //Criar os tokens para analise
//		String delimitador = "";
//		String delimitadorComposto = "";
//		int nLinhas = 0;
//		
//		int contErros = 0;
//		
//		for(int i=0; i<chars.length; i++) { //enquanto não acabar os chars no vetor
//			
//			if(!Character.toString(chars[i]).equals(" ")
//				&& !Character.toString(chars[i]).equals("+")
//				&& !Character.toString(chars[i]).equals("-")
//				&& !Character.toString(chars[i]).equals("*")
//				&& !Character.toString(chars[i]).equals("/")
//				&& !Character.toString(chars[i]).equals("[")
//				&& !Character.toString(chars[i]).equals("]")
//				&& !Character.toString(chars[i]).equals("(")
//				&& !Character.toString(chars[i]).equals(")")
//				&& (i+1<chars.length && !Character.toString(chars[i]).equals(":") && !Character.toString(chars[i+1]).equals("="))
//				&& !Character.toString(chars[i]).equals(":")
//				&& !Character.toString(chars[i]).equals("=")
//				&& !Character.toString(chars[i]).equals(">")
//				&& (i+1<chars.length && !Character.toString(chars[i]).equals(">") && !Character.toString(chars[i+1]).equals("=")) 
//				&& !Character.toString(chars[i]).equals("<")
//				&& (i+1<chars.length && !Character.toString(chars[i]).equals("<") && !Character.toString(chars[i+1]).equals("="))
//				&& !Character.toString(chars[i]).equals(",")
//				&& !Character.toString(chars[i]).equals(";")
//				&& !Character.toString(chars[i]).equals(".")
//				&& (i+1<chars.length && !Character.toString(chars[i]).equals(".") && !Character.toString(chars[i+1]).equals("."))
//				&& !Character.toString(chars[i]).equals("$")
//				//Deixa passar comentários
//				|| (i+1<chars.length && Character.toString(chars[i]).equals("(") && Character.toString(chars[i+1]).equals("*"))
//				|| (i+1<chars.length && Character.toString(chars[i]).equals("*") && Character.toString(chars[i-1]).equals("("))
//				|| (i+1<chars.length && Character.toString(chars[i]).equals("*") && Character.toString(chars[i+1]).equals(")"))
//				|| (i+1<chars.length && Character.toString(chars[i]).equals(")") && Character.toString(chars[i-1]).equals("*"))){ //se o char for diferente de um espaço branco ou de operadores e delimitadores, significa q iniciou um novo token
//				
//				tk += Character.toString(chars[i]); //monta o token
//				System.out.println(tk);
//				
//			}else { //se o espaço for branco, o token acabou e será analisado
//				
//				if(!Character.toString(chars[i]).equals(" ")) {
//				System.out.println(tk);
//				
//				delimitador = Character.toString(chars[i]);
//				
//				if(i+1<chars.length)
//					delimitadorComposto = Character.toString(chars[i+1]);
//						
//					if(delimitador.equals("+")) {
//						Token token = new Token(30, tk, tabelaDeSimbolos.get(30).getGrupo());
//						tabelaDeTokens.add(token);
//					}else {
//						if(delimitador.equals("-")) {
//							Token token = new Token(31, tk, tabelaDeSimbolos.get(31).getGrupo());
//							tabelaDeTokens.add(token);
//						}else {
//							if(delimitador.equals("*")) {
//								Token token = new Token(32, tk, tabelaDeSimbolos.get(32).getGrupo());
//								tabelaDeTokens.add(token);
//							}else {
//								if(delimitador.equals("/")) {
//									Token token = new Token(33, tk, tabelaDeSimbolos.get(33).getGrupo());
//									tabelaDeTokens.add(token);
//								}else {
//									if(delimitador.equals("[")) {
//										Token token = new Token(34, tk, tabelaDeSimbolos.get(34).getGrupo());
//										tabelaDeTokens.add(token);
//									}else {
//										if(delimitador.equals("]")) {
//											Token token = new Token(35, tk, tabelaDeSimbolos.get(35).getGrupo());
//											tabelaDeTokens.add(token);
//										}else {
//											if(delimitador.equals("(")) {
//												Token token = new Token(36, tk, tabelaDeSimbolos.get(36).getGrupo());
//												tabelaDeTokens.add(token);
//											}else {
//												if(delimitador.equals(")")) {
//													Token token = new Token(37, tk, tabelaDeSimbolos.get(37).getGrupo());
//													tabelaDeTokens.add(token);
//												}else {
//													if(delimitador.equals(":") && (delimitadorComposto.equals("="))) {
//														Token token = new Token(38, tk, tabelaDeSimbolos.get(38).getGrupo());
//														tabelaDeTokens.add(token);
//													}else {
//														if(delimitador.equals(":")) {
//															Token token = new Token(39, tk, tabelaDeSimbolos.get(39).getGrupo());
//															tabelaDeTokens.add(token);
//														}else {
//															if(delimitador.equals("=")) {
//																Token token = new Token(40, tk, tabelaDeSimbolos.get(40).getGrupo());
//																tabelaDeTokens.add(token);
//															}else {
//																if(delimitador.equals(">")) {
//																	Token token = new Token(41, tk, tabelaDeSimbolos.get(41).getGrupo());
//																	tabelaDeTokens.add(token);
//																}else {
//																	if(delimitador.equals(">") && (delimitadorComposto.equals("="))) {
//																		Token token = new Token(42, tk, tabelaDeSimbolos.get(42).getGrupo());
//																		tabelaDeTokens.add(token);
//																	}else {
//																		if(delimitador.equals("<")) {
//																			Token token = new Token(43, tk, tabelaDeSimbolos.get(43).getGrupo());
//																			tabelaDeTokens.add(token);
//																		}else {
//																			if(delimitador.equals("<") && (delimitadorComposto.equals("="))) {
//																				Token token = new Token(44, tk, tabelaDeSimbolos.get(44).getGrupo());
//																				tabelaDeTokens.add(token);
//																			}else {
//																				if(delimitador.equals("<") && (delimitadorComposto.equals(">"))) {
//																					Token token = new Token(45, tk, tabelaDeSimbolos.get(45).getGrupo());
//																					tabelaDeTokens.add(token);
//																				}else {
//																					if(delimitador.equals(",")) {
//																						Token token = new Token(46, tk, tabelaDeSimbolos.get(46).getGrupo());
//																						tabelaDeTokens.add(token);
//																					}else {
//																						if(delimitador.equals(";")) {
//																							Token token = new Token(47, tk, tabelaDeSimbolos.get(47).getGrupo());
//																							tabelaDeTokens.add(token);
//																							System.out.println(tk);
//																						}else {
//																							if(delimitador.equals(".")) {
//																								Token token = new Token(49, tk, tabelaDeSimbolos.get(49).getGrupo());
//																								tabelaDeTokens.add(token);
//																							}else {
//																								if(delimitador.equals("..")) {
//																									Token token = new Token(50, tk, tabelaDeSimbolos.get(50).getGrupo());
//																									tabelaDeTokens.add(token);
//																								}else {
//																									if(delimitador.equals("$")) {
//																										Token token = new Token(51, tk, tabelaDeSimbolos.get(51).getGrupo());
//																										tabelaDeTokens.add(token);
//																									}
//																								}
//																							}
//																						}
//																					}
//																				}
//																			}
//																		}
//																	}
//																}
//															}
//														}
//													}
//												}
//											}
//										}
//									}
//								}
//							}
//						}
//					}	
//			}
//				
//				if(!tk.equals("") && !Character.toString(chars[i]).equals(" ") ) {
//					for(int j=0; j<tabelaDeSimbolos.size();j++) {
//					
//						int tmTk = tk.length();
//						
//						String tk0 = "";
//						String tk1 = "";
//						String tkx = "";
//						String tky = "";
//						
//						if(tmTk > 1) {
//							tk0 = Character.toString(tk.charAt(0));
//							tk1 = Character.toString(tk.charAt(1));
//							tkx = Character.toString(tk.charAt(tmTk));
//							tky = Character.toString(tk.charAt(tmTk-1));
//						}
//					
//						if(!tk0.equals("(") && !tk1.equals("*") && !tkx.equals("*") && !tky.equals(")")) { // verifica se não é comentário
//						
//							if(!tk0.equals("\"") && !tkx.equals("\"")) { //verifica se é um literal
//							
//								if(tk.equals(tabelaDeSimbolos.get(j).getSimbolo())) {
//									Token token = new Token(tabelaDeSimbolos.get(j).getCodigo(), tk, tabelaDeSimbolos.get(j).getGrupo());
//									tabelaDeTokens.add(token);
//									
//									System.out.println(tk);
//									
//								}
//					
//							}else { //caso seja um literal
//								Token token = new Token(48, tk, tabelaDeSimbolos.get(48).getGrupo());
//								tabelaDeTokens.add(token);
//							}
//						}
//					}
//				}	
//			 
//			tk = "";
//			}
//		}
//		
//		for(int i=0; i<chars.length; i++) {
//			
//			//System.out.println(chars[i]);
//
//				//System.out.println("ENTROU");
//				if(!Character.toString(chars[i]).equals(" ")) {
//					for(int j=0; j<delimitadores.size(); j++) {
//							//Se for um delimitador composto ex: >=
//							if(delimitadores.get(j).equals(Character.toString(chars[i]))){
//								for(int k=0; k < delimitadores.size(); k++) {
//									if(i+1<chars.length) {
//										if(delimitadores.get(k).equals(Character.toString(chars[i+1]))) {
//											tk = Character.toString(chars[i]) + Character.toString(chars[i + 1]);
//											tokens.add(tk);
//											tk = "";
//										}
//									}else { 	//Se for um delimitador simples ex: ;
//										tk = Character.toString(chars[i]);
//										tokens.add(tk);
//										tokens.add(Character.toString(chars[i]));
//										tk = "";
//									}
//								}
//
//						}else {
//							tk += Character.toString(chars[i]);
//						}
//					}
//				}else {
//					tokens.add(tk);
//					tk = " ";
//					System.out.println("ESPAÇOVAZIO"+ tk + "ESPAÇOVAZIO");
//					tk="";
//				}
//				
//			
//			
//		}
//		
//		//System.out.println(nLinhas);
//		
//		for(int x=0;x<tokens.size();x++) {
//			System.out.println(tokens.get(x));
//		}
		
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
