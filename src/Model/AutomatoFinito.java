package Model;

public class AutomatoFinito {
	
	public Estado q0 = new Estado();
	public Estado q1 = new Estado();
	public Estado q2 = new Estado();
	public Estado q3 = new Estado();
	public Estado q4 = new Estado();
	public Estado q5 = new Estado();
	public Estado q6 = new Estado();
	public Estado q7 = new Estado();
	public Estado q8 = new Estado();
	public Estado q9 = new Estado();
	public Estado q10 = new Estado();
	public Estado q11 = new Estado();
	public Estado q12 = new Estado();
	public Estado q13 = new Estado();
	public Estado q14 = new Estado();
	public Estado q15 = new Estado();
	public Estado q16 = new Estado();
	public Estado q17 = new Estado();
	public Estado q18 = new Estado();
	public Estado q19 = new Estado();
	public Estado q20 = new Estado();
	public Estado q21 = new Estado();
	public Estado q22 = new Estado();
	public Estado q23 = new Estado();
	public Estado q24 = new Estado();
	public Estado q25 = new Estado();
	public Estado q26 = new Estado();
	public Estado q27 = new Estado();
	public Estado q28 = new Estado();
	public Estado q29 = new Estado();
	public Estado q30 = new Estado();
	public Estado q31 = new Estado();
	public Estado q32 = new Estado();
	
	public AutomatoFinito() {
	
		this.q0.estadoFinal = true; // Não é um estado final
		this.q0.grupo = "inicial";
		
		this.q1.estadoFinal = true; // É um estado final
		this.q1.grupo = "identificador";
		
		this.q2.estadoFinal = false; // Não é um estado final
		this.q2.grupo = "comentario";
		
		this.q3.estadoFinal = false; // Não é um estado final
		this.q3.grupo = "comentario";
		
		this.q4.estadoFinal = false; // Não é um estado final
		this.q4.grupo = "comentario";
		
		this.q5.estadoFinal = false; // Não é um estado final
		this.q5.grupo = "comentario";
		
		this.q6.estadoFinal = true; // É um estado final
		this.q6.grupo = "comentario";
		
		this.q7.estadoFinal = true; // É um estado final
		this.q7.grupo = "inteiro";
		
		this.q8.estadoFinal = true; // É um estado final
		this.q8.grupo = "ponto";
		
		this.q9.estadoFinal = false; // Não é um estado final
		this.q9.grupo = "numero decimal";
		
		this.q10.estadoFinal = true; // É um estado final
		this.q10.grupo = "dois pontos";
		
		this.q11.estadoFinal = true; // É um estado final
		this.q11.grupo = "dois pontos";
		
		this.q12.estadoFinal = true; // É um estado final
		this.q12.grupo = "menor";
		
		this.q13.estadoFinal = true; // É um estado final
		this.q13.grupo = "menor";
		
		this.q14.estadoFinal = true; // É um estado final
		this.q14.grupo = "menor";
		
		this.q15.estadoFinal = true; // É um estado final
		this.q15.grupo = "maior";
		
		this.q16.estadoFinal = true; // É um estado final
		this.q16.grupo = "maior";

		this.q17.estadoFinal = true; // É um estado final
		this.q17.grupo = "mais";
		
		this.q18.estadoFinal = true; // É um estado final
		this.q18.grupo = "menos";
		
		this.q19.estadoFinal = true; // É um estado final
		this.q19.grupo = "multiplicacao";
		
		this.q20.estadoFinal = true; // É um estado final
		this.q20.grupo = "divisao";
		
		this.q21.estadoFinal = true; // É um estado final
		this.q21.grupo = "virgula";
		
		this.q22.estadoFinal = true; // É um estado final
		this.q22.grupo = "ponto e virgula";
		
		this.q23.estadoFinal = true; // É um estado final
		this.q23.grupo = "colchetes";
		
		this.q24.estadoFinal = true; // É um estado final
		this.q24.grupo = "colchetes";
		
		this.q25.estadoFinal = true; // É um estado final
		this.q25.grupo = "igual";
		
		this.q26.estadoFinal = true; // É um estado final
		this.q26.grupo = "delimitador";
		
		this.q27.estadoFinal = true; // É um estado final
		this.q27.grupo = "palavra reservada";
	
		this.q28.estadoFinal = false;
		this.q28.grupo = "literal";
		
		this.q29.estadoFinal = false;
		this.q29.grupo = "literal";
		
		this.q30.estadoFinal = true;
		this.q30.grupo = "literal";
		
		this.q31.estadoFinal = false;
		this.q31.grupo = "caracters especiais";
		
		this.q32.estadoFinal = true;
		this.q32.grupo = "ponto";
		
	}

}
