package Model;

public class RegrasProducao {
	
	public Estado tabelaTransacao(String caracter, Estado atual, AutomatoFinito afd) {
		
		Estado proximoEstado = new Estado();

		//REGRAS
		
		//Voltar ao estado q0;
		if (caracter.equals(" "))
			proximoEstado = afd.q0;
				
		//Para identificador
		if ((atual != afd.q7) &&
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
					caracter.equals("9")))
			proximoEstado = afd.q1;
						
		//Para Comentário
		if(caracter.equals("(")) //Idependente de onde estiver, se abrir os parenteses vai para q2 (abrindo comentário)
			proximoEstado = afd.q2;
				
		if(atual.grupo.equals(afd.q2.grupo) && caracter.equals("*"))  //Se o q2 é ( , e ler um *, vai para q3
			proximoEstado = afd.q3;
			
		if(atual.grupo.equals(afd.q3.grupo) && !caracter.equals("*")) //Se o atual é q3 e recebo qualquer caracter diferente de * (para fechar o comentario
			proximoEstado = afd.q4;                          					//vai para q4
				
		if(atual.grupo.equals(afd.q4.grupo) && !caracter.equals("*")) //Se o atual é q4 e recebo qualquer caracter diferente de * (para fechar o comentario
			proximoEstado = afd.q4;                          		 //Continua em q4
				
		if(atual.grupo.equals(afd.q4.grupo) && caracter.equals("*"))  //Inicio de fechamento de comentário
			proximoEstado = afd.q5;
		
		if(atual.grupo.equals(afd.q5.grupo) && !caracter.equals(")"))  //Se está em q4, e recebe um caracter diferente de ")", volta para q4
			proximoEstado = afd.q4;                           				 //pois o comentário ainda n foi fechado
			
		if(atual.grupo.equals(afd.q5.grupo) && caracter.equals(")")) //Fechamento de comentário
			proximoEstado = afd.q6;
				
		//Para inteiros
				
		if(!atual.grupo.equals(afd.q1.grupo) &&
			(caracter.equals("0") ||
					caracter.equals("1") ||
					caracter.equals("2") ||
					caracter.equals("3") ||
					caracter.equals("4") ||
					caracter.equals("5") ||
					caracter.equals("6") ||
					caracter.equals("7") ||
					caracter.equals("8") ||
					caracter.equals("9")))
			proximoEstado = afd.q7;
				
		//Ponto
		if(atual.grupo.equals(afd.q7.grupo) && caracter.equals(".")) //Se receber um ponto ".", vai para q8
			proximoEstado = afd.q8; 
		
				
		//Números Decimais
		if(atual.grupo.equals(afd.q7.grupo) && caracter.equals(".")) //Se receber um ponto depois de um número
			proximoEstado = afd.q9;                           					//vai para q9
	
				
		if(atual.grupo.equals(afd.q9.grupo) &&
			(caracter.equals("0") ||
					caracter.equals("1") ||
					caracter.equals("2") ||
					caracter.equals("3") ||
					caracter.equals("4") ||
					caracter.equals("5") ||
					caracter.equals("6") ||
					caracter.equals("7") ||
					caracter.equals("8") ||
					caracter.equals("9"))) {
					
			proximoEstado = afd.q9;
					
		}else {
			proximoEstado = afd.q0;
		}
				
		//Dois Pontos
		if(caracter.equals(":"))
			proximoEstado = afd.q10;
				
		//Atribuição
		if(atual.grupo.equals(afd.q10.grupo) && caracter.equals("="))
			proximoEstado = afd.q11;
			
		//Sinal de Menor
		if(caracter.equals("<")) 
			proximoEstado = afd.q12;
				
		//Sinal Menor igual
		if(atual.grupo.equals(afd.q12.grupo) && caracter.equals("=")) 
			proximoEstado = afd.q13;
				
		//Sinal Diferença
		if(atual.grupo.equals(afd.q12.grupo) && caracter.equals(">")) 
			proximoEstado = afd.q14;
		
		//Sinal de Maior
		if(caracter.equals(">")) 
			proximoEstado = afd.q15;
				
		//Sinal Maior igual
		if(atual.grupo.equals(afd.q15.grupo) && caracter.equals("=")) 
			proximoEstado = afd.q16;
	
		//Sinal Mais
		if(caracter.equals("+"))
			proximoEstado = afd.q17;
				
		//Sinal Menos
		if(caracter.equals("-"))
			proximoEstado = afd.q18;
				
		//Sinal Multiplicação
		if(!atual.grupo.equals(afd.q2.grupo) && !atual.grupo.equals(afd.q4.grupo) && caracter.equals("*"))
			proximoEstado = afd.q19;
	
		//Sinal Divisão
		if(caracter.equals("/")) 
			proximoEstado = afd.q20;
				
		//Virgula
		if(caracter.equals(",")) 
			proximoEstado = afd.q21;
				
		//Ponto e virgula
		if(caracter.equals(";"))
			proximoEstado = afd.q22;
			
		//Fecga colchetes
		if(caracter.equals("]")) 
			proximoEstado = afd.q23;
				
		//Abre colchetes
		if(caracter.equals("[")) 
			proximoEstado = afd.q24;
					
		//Sinal de igual
		if(!atual.grupo.equals(afd.q12.grupo) && !atual.grupo.equals(afd.q15.grupo) && caracter.equals("="))
			proximoEstado = afd.q25;
	
		//Delimitador
		if(caracter.equals("$"))
			proximoEstado = afd.q26;
						
		//Literal
		if(caracter.equals("\"")) //Abre o literal com as aspas
			proximoEstado = afd.q28;
				
		if(atual.grupo.equals(afd.q28.grupo) && caracter.equals("\"")) //Se receber um caracter diferente de uma aspas, vai para q29
			proximoEstado = afd.q29;
				
		if(atual.grupo.equals(afd.q28.grupo) && caracter.equals("\"")) //Se recebe uma aspas, vai para q30
			proximoEstado = afd.q30;

		if(atual.grupo.equals(afd.q29.grupo) && !caracter.equals("\"")) // Se está em 29 e recebe caracters diferentes de uma aspas, continua em q29
			proximoEstado = afd.q29;
			
		if(atual.grupo.equals(afd.q28.grupo) && caracter.equals("\"")) //Se recebe aspas, vai para q30 (Fecha  o literal)
			proximoEstado = afd.q30;
	
		if(caracter.equals("'") ||
				caracter.equals("!") ||
				caracter.equals("@") ||
				caracter.equals("#") ||
				caracter.equals("%") ||
				caracter.equals("¨") ||
				caracter.equals("&") ||
				caracter.equals("_") ||
				caracter.equals("{") ||
				caracter.equals("}") ||
				caracter.equals("?") ||
				caracter.equals("^") ||
				caracter.equals("~") ||
				caracter.equals("|") ||
				caracter.equals("¹") ||
				caracter.equals("²") ||
				caracter.equals("³") ||
				caracter.equals("£") ||
				caracter.equals("¢") ||
				caracter.equals("¬") ||
				caracter.equals("§") ||
				caracter.equals("ª") ||
				caracter.equals("º") ||
				caracter.equals("°"))
			proximoEstado = afd.q31;
		
		if(atual.grupo.equals(afd.q32.grupo) && caracter.equals("."))
			proximoEstado = afd.q32;
			
		return proximoEstado;
				 
	}
	
}
