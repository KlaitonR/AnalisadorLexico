package Model;

public class Simbolo {

	private int codigo;
	private String simbolo;
	private String grupo;
	
	public Simbolo(int codigo, String simbolo, String grupo){
		
		this.codigo = codigo;
		this.simbolo = simbolo;
		this.grupo = grupo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
}
