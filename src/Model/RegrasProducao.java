package Model;

public class RegrasProducao {

	Estado atual;
	
	public RegrasProducao(String caracter) {
		
		Estado q0 = new Estado();
		q0.estadoFinal = false; // Não é um estado final
		
		Estado q1 = new Estado();
		q1.estadoFinal = true; // É um estado final
		q1.CaractersValidos.add("a");
		q1.CaractersValidos.add("b");
		q1.CaractersValidos.add("c");
		q1.CaractersValidos.add("d");
		q1.CaractersValidos.add("e");
		q1.CaractersValidos.add("f");
		q1.CaractersValidos.add("h");
		q1.CaractersValidos.add("i");
		q1.CaractersValidos.add("j");
		q1.CaractersValidos.add("k");
		q1.CaractersValidos.add("l");
		q1.CaractersValidos.add("m");
		q1.CaractersValidos.add("n");
		q1.CaractersValidos.add("o");
		q1.CaractersValidos.add("p");
		q1.CaractersValidos.add("q");
		q1.CaractersValidos.add("r");
		q1.CaractersValidos.add("s");
		q1.CaractersValidos.add("t");
		q1.CaractersValidos.add("u");
		q1.CaractersValidos.add("v");
		q1.CaractersValidos.add("w");
		q1.CaractersValidos.add("x");
		q1.CaractersValidos.add("y");
		q1.CaractersValidos.add("z");
		q1.CaractersValidos.add("A");
		q1.CaractersValidos.add("B");
		q1.CaractersValidos.add("C");
		q1.CaractersValidos.add("D");
		q1.CaractersValidos.add("E");
		q1.CaractersValidos.add("F");
		q1.CaractersValidos.add("H");
		q1.CaractersValidos.add("I");
		q1.CaractersValidos.add("J");
		q1.CaractersValidos.add("K");
		q1.CaractersValidos.add("L");
		q1.CaractersValidos.add("M");
		q1.CaractersValidos.add("N");
		q1.CaractersValidos.add("O");
		q1.CaractersValidos.add("P");
		q1.CaractersValidos.add("Q");
		q1.CaractersValidos.add("R");
		q1.CaractersValidos.add("S");
		q1.CaractersValidos.add("T");
		q1.CaractersValidos.add("U");
		q1.CaractersValidos.add("V");
		q1.CaractersValidos.add("W");
		q1.CaractersValidos.add("X");
		q1.CaractersValidos.add("Y");
		q1.CaractersValidos.add("Z");
		q1.CaractersValidos.add("0");
		q1.CaractersValidos.add("1");
		q1.CaractersValidos.add("2");
		q1.CaractersValidos.add("3");
		q1.CaractersValidos.add("4");
		q1.CaractersValidos.add("5");
		q1.CaractersValidos.add("6");
		q1.CaractersValidos.add("7");
		q1.CaractersValidos.add("8");
		q1.CaractersValidos.add("9");
		
		Estado q2 = new Estado();
		q2.estadoFinal = false; // Não é um estado final
		q2.CaractersValidos.add("(");
		
		Estado q3 = new Estado();
		q3.estadoFinal = false; // Não é um estado final
		q3.CaractersValidos.add("*");
		
		Estado q4 = new Estado();
		q4.estadoFinal = false; // Não é um estado final
		
		Estado q5 = new Estado();
		q5.estadoFinal = false; // Não é um estado final
		q5.CaractersValidos.add("*");
		
		Estado q6 = new Estado();
		q6.estadoFinal = true; // É um estado final
		q6.CaractersValidos.add(")");
		
		Estado q7 = new Estado();
		q7.estadoFinal = true; // É um estado final
		q7.CaractersValidos.add("0");
		q7.CaractersValidos.add("1");
		q7.CaractersValidos.add("2");
		q7.CaractersValidos.add("3");
		q7.CaractersValidos.add("4");
		q7.CaractersValidos.add("5");
		q7.CaractersValidos.add("6");
		q7.CaractersValidos.add("7");
		q7.CaractersValidos.add("8");
		q7.CaractersValidos.add("9");
		
		Estado q8 = new Estado();
		q8.estadoFinal = true; // É um estado final
		q8.CaractersValidos.add(".");
		
		Estado q9 = new Estado();
		q9.estadoFinal = false; // Não é um estado final
		
		Estado q10 = new Estado();
		q10.estadoFinal = true; // É um estado final
		q10.CaractersValidos.add(":");
		
		Estado q11 = new Estado();
		q11.estadoFinal = true; // É um estado final
		q11.CaractersValidos.add("=");
		
		Estado q12 = new Estado();
		q12.estadoFinal = true; // É um estado final
		q12.CaractersValidos.add("<");
		
		Estado q13 = new Estado();
		q13.estadoFinal = true; // É um estado final
		q13.CaractersValidos.add("=");
		
		Estado q14 = new Estado();
		q14.estadoFinal = true; // É um estado final
		q14.CaractersValidos.add(">");
		
		Estado q15 = new Estado();
		q15.estadoFinal = true; // É um estado final
		q15.CaractersValidos.add(">");
		
		Estado q16 = new Estado();
		q16.estadoFinal = true; // É um estado final
		q16.CaractersValidos.add("=");
		
		Estado q17 = new Estado();
		q17.estadoFinal = true; // É um estado final
		q17.CaractersValidos.add("+");
		
		Estado q18 = new Estado();
		q18.estadoFinal = true; // É um estado final
		q18.CaractersValidos.add("-");
		
		Estado q19 = new Estado();
		q19.estadoFinal = true; // É um estado final
		q19.CaractersValidos.add("*");
		
		Estado q20 = new Estado();
		q20.estadoFinal = true; // É um estado final
		q20.CaractersValidos.add("/");
		
		Estado q21 = new Estado();
		q21.estadoFinal = true; // É um estado final
		q21.CaractersValidos.add(",");
		
		Estado q22 = new Estado();
		q22.estadoFinal = true; // É um estado final
		q22.CaractersValidos.add(";");
		
		Estado q23 = new Estado();
		q23.estadoFinal = true; // É um estado final
		q23.CaractersValidos.add("]");
		
		Estado q24 = new Estado();
		q24.estadoFinal = true; // É um estado final
		q24.CaractersValidos.add("[");
		
		Estado q25 = new Estado();
		q25.estadoFinal = true; // É um estado final
		q25.CaractersValidos.add("=");
		
		Estado q26 = new Estado();
		q26.estadoFinal = true; // É um estado final
		q26.CaractersValidos.add("$");
		
		Estado q27 = new Estado();
		q27.estadoFinal = true; // É um estado final
		q27.CaractersValidos.add("program");
		q27.CaractersValidos.add("label");
		q27.CaractersValidos.add("const");
		q27.CaractersValidos.add("var");
		q27.CaractersValidos.add("procedure");
		q27.CaractersValidos.add("begin");
		q27.CaractersValidos.add("end");
		q27.CaractersValidos.add("array");
		q27.CaractersValidos.add("of");
		q27.CaractersValidos.add("call");
		q27.CaractersValidos.add("goto");
		q27.CaractersValidos.add("if");
		q27.CaractersValidos.add("then");
		q27.CaractersValidos.add("else");
		q27.CaractersValidos.add("while");
		q27.CaractersValidos.add("do");
		q27.CaractersValidos.add("repeat");
		q27.CaractersValidos.add("until");
		q27.CaractersValidos.add("readln");
		q27.CaractersValidos.add("writeln");
		q27.CaractersValidos.add("or");
		q27.CaractersValidos.add("and");
		q27.CaractersValidos.add("not");
		q27.CaractersValidos.add("integer");
		q27.CaractersValidos.add("for");
		q27.CaractersValidos.add("to");
		q27.CaractersValidos.add("case");
		
		
		//REGRAS
		
		//Voltar ao estado q0;
		if (caracter.equals(" ")) {
			atual = q0;
		}
		
		//Para identificador
		if (atual != q7 &&
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
			
			atual = q1;
			
		}
		
		//Para Comentário
		if(caracter.equals("(")){ //Idependente de onde estiver, se abrir os parenteses vai para q2 (abrindo comentário)
			atual = q2;
		}
		
		if(atual == q2 && caracter.equals("*")) { //Se o q2 é ( , e ler um *, vai para q3
			atual = q3;
		}
		
		if(atual == q3 && !caracter.equals("*")) //Se o atual é q3 e recebo qualquer caracter diferente de * (para fechar o comentario
			atual = q4;                          //vai para q4
		
		if(atual == q4 && !caracter.equals("*")) //Se o atual é q4 e recebo qualquer caracter diferente de * (para fechar o comentario
			atual = q4;                          //Continua em q4
		
		if(atual == q4 && caracter.equals("*")) { //Inicio de fechamento de comentário
			atual = q5;
		}
		
		if(atual == q5 && !caracter.equals(")")) { //Se está em q4, e recebe um caracter diferente de ")", volta para q4
			atual = q4;                            //pois o comentário ainda n foi fechado
		}
		
		if(atual == q5 && caracter.equals(")")) { //Fechamento de comentário
			atual = q6;
		}
		
		//Para inteiros
		
		if(atual != q1 &&
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
			
			atual = q7;
			
		}
		
		//Ponto
		if(atual != q7 && caracter.equals(".")) { //Se receber um ponto ".", vai para q8
			atual = q8; 
		}
		
		//Números Decimais
		if(atual == q7 && caracter.equals(".")) { //Se receber um ponto depois de um número
			atual = q9;                           //vai para q9
		}
		
		if(atual == q9 &&
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
			
			atual = q9;
			
		}else {
			atual = q0;
		}
		
		//Dois Pontos
		if(caracter.equals(":")) {
			atual = q10;
		}
		
		//Atribuição
		if(atual == q10 && caracter.equals("=")) {
			atual = q11;
		}
		
		//Sinal de Menor
		if(caracter.equals("<")) {
			atual = q12;
		}
		
		//Sinal Menor igual
		if(atual == q12 && caracter.equals("=")) {
			atual = q13;
		}
		
		//Sinal Diferença
		if(atual == q12 && caracter.equals(">")) {
			atual = q14;
		}
		
		//Sinal de Maior
		if(caracter.equals(">")) {
			atual = q15;
		}
		
		//Sinal Maior igual
		if(atual == q15 && caracter.equals("=")) {
			atual = q16;
		}
		
		//Sinal Mais
		if(caracter.equals("+")) {
			atual = q17;
		}
		
		//Sinal Menos
		if(caracter.equals("-")) {
			atual = q18;
		}
		
		//Sinal Multiplicação
		if(atual != q2 && atual != q4 && caracter.equals("*")) {
			atual = q19;
		}
		
		//Sinal Divisão
		if(caracter.equals("/")) {
			atual = q20;
		}
		
		if(caracter.equals(",")) {
			atual = q21;
		}
		
		if(caracter.equals(";")) {
			atual = q22;
		}
		
		if(caracter.equals("]")) {
			atual = q23;
		}
		
		if(caracter.equals("[")) {
			atual = q24;
		}
		
		if(atual != q12 && atual != q15 && caracter.equals("=")) {
			atual = q25;
		}
		
		if(caracter.equals("$")) {
			atual = q26;
		}
		
		if(caracter.equals("$")) {
			atual = q26;
		}
		
//		if (atual == q0 &&
//				(caracter.equals("a") ||
//						caracter.equals("b") ||
//						caracter.equals("c") ||
//						caracter.equals("d") ||
//						caracter.equals("e") ||
//						caracter.equals("f") ||
//						caracter.equals("g") ||
//						caracter.equals("h") ||
//						caracter.equals("i") ||
//						caracter.equals("j") ||
//						caracter.equals("k") ||
//						caracter.equals("l") ||
//						caracter.equals("m") ||
//						caracter.equals("n") ||
//						caracter.equals("o") ||
//						caracter.equals("p") ||
//						caracter.equals("q") ||
//						caracter.equals("r") ||
//						caracter.equals("s") ||
//						caracter.equals("t") ||
//						caracter.equals("u") ||
//						caracter.equals("v") ||
//						caracter.equals("w") ||
//						caracter.equals("x") ||
//						caracter.equals("y") ||
//						caracter.equals("z"))) {
//			
//			for(int i=0; i<q27.CaractersValidos.size();i++) {
//				if(caracter.equals(Character.toString(q27.CaractersValidos.get(i).charAt(0)))) {
//					atual = q27;
//				}
//			}
//		
		 
	}
	
	
	
	
}
