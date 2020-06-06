package Model;

public class RegrasProducao {

	AutomatoFinito afd = new AutomatoFinito();
	Estado atual;
	
	public Estado tabelaTransacao(String caracter, Estado atual) {
		
		//REGRAS
		
				//Voltar ao estado q0;
				if (caracter.equals(" ")) {
					atual = afd.q0;
				}
				
				//Para identificador
				if (atual != afd.q7 &&
					(caracter.equals("a") ||
							caracter.equals("b") ||
							caracter.equals("c") ||
							caracter.equals("d") ||
							caracter.equals("e") ||
							caracter.equals("f") ||
							caracter.equals("g") ||
							caracter.equals("h") ||
							caracter.equals("i") ||
							caracter.equals("j") ||
							caracter.equals("k") ||
							caracter.equals("l") ||
							caracter.equals("m") ||
							caracter.equals("n") ||
							caracter.equals("o") ||
							caracter.equals("p") ||
							caracter.equals("q") ||
							caracter.equals("r") ||
							caracter.equals("s") ||
							caracter.equals("t") ||
							caracter.equals("u") ||
							caracter.equals("v") ||
							caracter.equals("w") ||
							caracter.equals("x") ||
							caracter.equals("y") ||
							caracter.equals("z") ||
							caracter.equals("A") ||
							caracter.equals("B") ||
							caracter.equals("C") ||
							caracter.equals("D") ||
							caracter.equals("E") ||
							caracter.equals("F") ||
							caracter.equals("G") ||
							caracter.equals("H") ||
							caracter.equals("I") ||
							caracter.equals("J") ||
							caracter.equals("K") ||
							caracter.equals("L") ||
							caracter.equals("M") ||
							caracter.equals("N") ||
							caracter.equals("O") ||
							caracter.equals("P") ||
							caracter.equals("Q") ||
							caracter.equals("R") ||
							caracter.equals("S") ||
							caracter.equals("T") ||
							caracter.equals("U") ||
							caracter.equals("V") ||
							caracter.equals("W") ||
							caracter.equals("X") ||
							caracter.equals("Y") ||
							caracter.equals("Z") ||
							caracter.equals("0") ||
							caracter.equals("1") ||
							caracter.equals("2") ||
							caracter.equals("3") ||
							caracter.equals("4") ||
							caracter.equals("5") ||
							caracter.equals("6") ||
							caracter.equals("7") ||
							caracter.equals("8") ||
							caracter.equals("9") 
					)) {
					
					atual = afd.q1;
					
				}
				
				//Para Comentário
				if(caracter.equals("(")){ //Idependente de onde estiver, se abrir os parenteses vai para q2 (abrindo comentário)
					atual = afd.q2;
				}
				
				if(atual == afd.q2 && caracter.equals("*")) { //Se o q2 é ( , e ler um *, vai para q3
					atual = afd.q3;
				}
				
				if(atual == afd.q3 && !caracter.equals("*")) //Se o atual é q3 e recebo qualquer caracter diferente de * (para fechar o comentario
					atual = afd.q4;                          //vai para q4
				
				if(atual == afd.q4 && !caracter.equals("*")) //Se o atual é q4 e recebo qualquer caracter diferente de * (para fechar o comentario
					atual = afd.q4;                          //Continua em q4
				
				if(atual == afd.q4 && caracter.equals("*")) { //Inicio de fechamento de comentário
					atual = afd.q5;
				}
				
				if(atual == afd.q5 && !caracter.equals(")")) { //Se está em q4, e recebe um caracter diferente de ")", volta para q4
					atual = afd.q4;                            //pois o comentário ainda n foi fechado
				}
				
				if(atual == afd.q5 && caracter.equals(")")) { //Fechamento de comentário
					atual = afd.q6;
				}
				
				//Para inteiros
				
				if(atual != afd.q1 &&
					(caracter.equals("0") ||
							caracter.equals("1") ||
							caracter.equals("2") ||
							caracter.equals("3") ||
							caracter.equals("4") ||
							caracter.equals("5") ||
							caracter.equals("6") ||
							caracter.equals("7") ||
							caracter.equals("8") ||
							caracter.equals("9") 
					 )) {
					
					atual = afd.q7;
					
				}
				
				//Ponto
				if(atual != afd.q7 && caracter.equals(".")) { //Se receber um ponto ".", vai para q8
					atual = afd.q8; 
				}
				
				//Números Decimais
				if(atual == afd.q7 && caracter.equals(".")) { //Se receber um ponto depois de um número
					atual = afd.q9;                           //vai para q9
				}
				
				if(atual == afd.q9 &&
					(caracter.equals("0") ||
							caracter.equals("1") ||
							caracter.equals("2") ||
							caracter.equals("3") ||
							caracter.equals("4") ||
							caracter.equals("5") ||
							caracter.equals("6") ||
							caracter.equals("7") ||
							caracter.equals("8") ||
							caracter.equals("9") 
					 )) {
					
					atual = afd.q9;
					
				}else {
					atual = afd.q0;
				}
				
				//Dois Pontos
				if(caracter.equals(":")) {
					atual = afd.q10;
				}
				
				//Atribuição
				if(atual == afd.q10 && caracter.equals("=")) {
					atual = afd.q11;
				}
				
				//Sinal de Menor
				if(caracter.equals("<")) {
					atual = afd.q12;
				}
				
				//Sinal Menor igual
				if(atual == afd.q12 && caracter.equals("=")) {
					atual = afd.q13;
				}
				
				//Sinal Diferença
				if(atual == afd.q12 && caracter.equals(">")) {
					atual = afd.q14;
				}
				
				//Sinal de Maior
				if(caracter.equals(">")) {
					atual = afd.q15;
				}
				
				//Sinal Maior igual
				if(atual == afd.q15 && caracter.equals("=")) {
					atual = afd.q16;
				}
				
				//Sinal Mais
				if(caracter.equals("+")) {
					atual = afd.q17;
				}
				
				//Sinal Menos
				if(caracter.equals("-")) {
					atual = afd.q18;
				}
				
				//Sinal Multiplicação
				if(atual != afd.q2 && atual != afd.q4 && caracter.equals("*")) {
					atual = afd.q19;
				}
				
				//Sinal Divisão
				if(caracter.equals("/")) {
					atual = afd.q20;
				}
				
				//Virgula
				if(caracter.equals(",")) {
					atual = afd.q21;
				}
				
				//Ponto e virgula
				if(caracter.equals(";")) {
					atual = afd.q22;
				}
				
				//Fecga colchetes
				if(caracter.equals("]")) {
					atual = afd.q23;
				}
				
				//Abre colchetes
				if(caracter.equals("[")) {
					atual = afd.q24;
				}
				
				//Sinal de igual
				if(atual != afd.q12 && atual != afd.q15 && caracter.equals("=")) {
					atual = afd.q25;
				}
				
				//Delimitador
				if(caracter.equals("$")) {
					atual = afd.q26;
				}
				
				//Literal
				if(caracter.equals("\"")) { //Abre o literal com as aspas
					atual = afd.q28;
				}
				
				if(atual == afd.q28 && caracter != "\"") { //Se receber um caracter diferente de uma aspas, vai para q29
					atual = afd.q29;
				}
				
				if(atual == afd.q28 && caracter == "\"") { //Se recebe uma aspas, vai para q30
					atual = afd.q30;
				}
				
				if(atual == afd.q29 && caracter != "\"" ) { // Se está em 29 e recebe caracters diferentes de uma aspas, continua em q29
					atual = afd.q29;
				}
				
				if(atual == afd.q29 && caracter == "\"") { //Se recebe aspas, vai para q30 (Fecha  o literal)
					atual = afd.q30;
				}
				
				return atual;
				
//				if (atual == q0 &&
//						(caracter.equals("a") ||
//								caracter.equals("b") ||
//								caracter.equals("c") ||
//								caracter.equals("d") ||
//								caracter.equals("e") ||
//								caracter.equals("f") ||
//								caracter.equals("g") ||
//								caracter.equals("h") ||
//								caracter.equals("i") ||
//								caracter.equals("j") ||
//								caracter.equals("k") ||
//								caracter.equals("l") ||
//								caracter.equals("m") ||
//								caracter.equals("n") ||
//								caracter.equals("o") ||
//								caracter.equals("p") ||
//								caracter.equals("q") ||
//								caracter.equals("r") ||
//								caracter.equals("s") ||
//								caracter.equals("t") ||
//								caracter.equals("u") ||
//								caracter.equals("v") ||
//								caracter.equals("w") ||
//								caracter.equals("x") ||
//								caracter.equals("y") ||
//								caracter.equals("z"))) {
//					
//					for(int i=0; i<q27.CaractersValidos.size();i++) {
//						if(caracter.equals(Character.toString(q27.CaractersValidos.get(i).charAt(0)))) {
//							atual = q27;
//						}
//					}
//				
				 
	}
	
}
