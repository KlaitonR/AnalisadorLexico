package Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Token {
	
	private IntegerProperty codigo = new SimpleIntegerProperty(0);;
	private StringProperty token = new SimpleStringProperty("");;
	private StringProperty descricao = new SimpleStringProperty("");;
	
	public Token(int codigo, String token, String descricao) {
		
		IntegerProperty cod = new SimpleIntegerProperty(codigo);
		StringProperty tk = new SimpleStringProperty(token);
		StringProperty desc = new SimpleStringProperty(descricao);
		
		this.codigo = cod;
		this.token = tk;
		this.descricao = desc;
		
	}

	public final IntegerProperty codigoProperty() {
		return this.codigo;
	}
	

	public final int getCodigo() {
		return this.codigoProperty().get();
	}
	

	public final void setCodigo(final int codigo) {
		this.codigoProperty().set(codigo);
	}
	

	public final StringProperty tokenProperty() {
		return this.token;
	}
	

	public final String getToken() {
		return this.tokenProperty().get();
	}
	

	public final void setToken(final String token) {
		this.tokenProperty().set(token);
	}
	

	public final StringProperty descricaoProperty() {
		return this.descricao;
	}
	

	public final String getDescricao() {
		return this.descricaoProperty().get();
	}
	

	public final void setDescricao(final String descricao) {
		this.descricaoProperty().set(descricao);
	}

}
