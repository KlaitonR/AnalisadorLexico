package view;
import java.util.ArrayList;
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
		
		char[] chars = txtCodigo.toCharArray(); //transforma o código em um vetor de chars
		
		for(int i=0; i<chars.length; i++) {
			
			al.analisador(Character.toString(chars[i]));
			
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
