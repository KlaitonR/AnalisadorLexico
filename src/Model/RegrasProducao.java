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
			(caracter.matches("[0-9]*") || caracter.matches("[a-z]*") || caracter.matches("[A-Z]*")))
			proximoEstado = afd.q1;
						
		//Para Comentário
				
		if(atual.grupo.equals(afd.q33.grupo) && caracter.equals("*"))  //Se o q2 é ( , e ler um *, vai para q3
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
				
		if(!atual.grupo.equals(afd.q1.grupo) && caracter.matches("[0-9]*"))
			proximoEstado = afd.q7;
				
		//Ponto
		if(!atual.grupo.equals(afd.q7.grupo) && caracter.equals(".")) //Se receber um ponto ".", vai para q8
			proximoEstado = afd.q8; 
		
				
		//Números Decimais
		if(atual.grupo.equals(afd.q7.grupo) && caracter.equals(".")) //Se receber um ponto depois de um número
			proximoEstado = afd.q9;                           					//vai para q9
	
				
		if(atual.grupo.equals(afd.q9.grupo) && caracter.matches("[0-9]*")) {
			proximoEstado = afd.q9;
					
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
		if(!atual.grupo.equals(afd.q2.grupo) && !atual.grupo.equals(afd.q4.grupo) && !atual.grupo.equals(afd.q33.grupo) && caracter.equals("*"))
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
		if(!atual.grupo.equals(afd.q12.grupo) && !atual.grupo.equals(afd.q15.grupo) && !atual.grupo.equals(afd.q10.grupo) && caracter.equals("="))
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
		
		if(caracter.equals("("))
			proximoEstado = afd.q33;
		
		if(caracter.equals(")"))
			proximoEstado = afd.q34;
			
		return proximoEstado;
				 
	}
	
}
