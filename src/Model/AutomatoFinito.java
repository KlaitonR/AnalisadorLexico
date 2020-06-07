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
	
	public void estados() {
	
		q0.estadoFinal = true; // Não é um estado final
		q0.grupo = "inicial";
		
		q1.estadoFinal = true; // É um estado final
		q1.grupo = "identificador";
		
		q2.estadoFinal = false; // Não é um estado final
		q2.grupo = "comentario";
		
		q3.estadoFinal = false; // Não é um estado final
		q3.grupo = "comentario";
		
		q4.estadoFinal = false; // Não é um estado final
		q4.grupo = "comentario";
		
		q5.estadoFinal = false; // Não é um estado final
		q5.grupo = "comentario";
		
		q6.estadoFinal = true; // É um estado final
		q6.grupo = "comentario";
		
		q7.estadoFinal = true; // É um estado final
		q7.grupo = "inteiro";
		
		q8.estadoFinal = true; // É um estado final
		q8.grupo = "ponto";
		
		q9.estadoFinal = false; // Não é um estado final
		q9.grupo = "numero decimal";
		
		q10.estadoFinal = true; // É um estado final
		q10.grupo = "dois pontos";
		
		q11.estadoFinal = true; // É um estado final
		q11.grupo = "dois pontos";
		
		q12.estadoFinal = true; // É um estado final
		q12.grupo = "menor";
		
		q13.estadoFinal = true; // É um estado final
		q13.grupo = "menor";
		
		q14.estadoFinal = true; // É um estado final
		q14.grupo = "menor";
		
		q15.estadoFinal = true; // É um estado final
		q15.grupo = "maior";
		
		q16.estadoFinal = true; // É um estado final
		q16.grupo = "maior";

		q17.estadoFinal = true; // É um estado final
		q17.grupo = "mais";
		
		q18.estadoFinal = true; // É um estado final
		q18.grupo = "menos";
		
		q19.estadoFinal = true; // É um estado final
		q19.grupo = "multiplicacao";
		
		q20.estadoFinal = true; // É um estado final
		q20.grupo = "divisao";
		
		q21.estadoFinal = true; // É um estado final
		q21.grupo = "virgula";
		
		q22.estadoFinal = true; // É um estado final
		q22.grupo = "ponto e virgula";
		
		q23.estadoFinal = true; // É um estado final
		q23.grupo = "colchetes";
		
		q24.estadoFinal = true; // É um estado final
		q24.grupo = "colchetes";
		
		q25.estadoFinal = true; // É um estado final
		q25.grupo = "igual";
		
		q26.estadoFinal = true; // É um estado final
		q26.grupo = "delimitador";
		
		q27.estadoFinal = true; // É um estado final
		q27.grupo = "palavra reservada";
	
		q28.estadoFinal = false;
		q28.grupo = "literal";
		
		q29.estadoFinal = false;
		q29.grupo = "literal";
		
		q30.estadoFinal = true;
		q30.grupo = "literal";
		
		q31.estadoFinal = false;
		q31.grupo = "caracters especiais";
		
	}

}
