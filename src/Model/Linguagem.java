package Model;

import java.util.ArrayList;

public class Linguagem {

	ArrayList<Simbolo> tabelaDeSimbolos = new ArrayList<>();
	
	public Linguagem() {
			
//			delimitadores.add("+");
//			delimitadores.add("-");
//			delimitadores.add("*");
//			delimitadores.add("/");
//			delimitadores.add("[");
//			delimitadores.add("]");
//			delimitadores.add("(");
//			delimitadores.add(")");
//			delimitadores.add(":");
//			delimitadores.add("=");
//			delimitadores.add(">");
//			delimitadores.add("<");
//			delimitadores.add(",");
//			delimitadores.add(";");
//			delimitadores.add(".");
			
			Simbolo s1 = new Simbolo(1,"Program","Palavra reservada");
			Simbolo s2 = new Simbolo(2,"Label","Palavra reservada");
			Simbolo s3 = new Simbolo(3,"Const","Palavra reservada");
			Simbolo s4 = new Simbolo(4,"Var","Palavra reservada");
			Simbolo s5 = new Simbolo(5,"Procedure","Palavra reservada");
			Simbolo s6 = new Simbolo(6,"Begin","Palavra reservada");
			Simbolo s7 = new Simbolo(7,"End","Palavra reservada");
			Simbolo s8 = new Simbolo(8,"Integer","Palavra reservada");
			Simbolo s9 = new Simbolo(9,"Array","Palavra reservada");
			Simbolo s10 = new Simbolo(10,"Of","Palavra reservada");
			Simbolo s11 = new Simbolo(11,"Call","Palavra reservada");
			Simbolo s12 = new Simbolo(12,"Goto","Palavra reservada");
			Simbolo s13 = new Simbolo(13,"if","Palavra reservada");
			Simbolo s14 = new Simbolo(14,"Then","Palavra reservada");
			Simbolo s15 = new Simbolo(15,"Else","Palavra reservada");
			Simbolo s16 = new Simbolo(16,"While","Palavra reservada");
			Simbolo s17 = new Simbolo(17,"Do","Palavra reservada");
			Simbolo s18 = new Simbolo(18,"Repeat","Palavra reservada");
			Simbolo s19= new Simbolo(19,"Until","Palavra reservada");
			Simbolo s20= new Simbolo(20,"Readln","Palavra reservada");
			Simbolo s21 = new Simbolo(21,"Writeln","Palavra reservada");
			Simbolo s22 = new Simbolo(22,"Or","Palavra reservada");
			Simbolo s23 = new Simbolo(23,"And","Palavra reservada");
			Simbolo s24 = new Simbolo(24,"Not","Palavra reservada");
			Simbolo s25 = new Simbolo(25,"Identificador","Variavel");
			Simbolo s26 = new Simbolo(26,"Inteiro","Número inteiro");
			Simbolo s27 = new Simbolo(27,"For","Palavra reservada");
			Simbolo s28 = new Simbolo(28,"To","Palavra reservada");
			Simbolo s29 = new Simbolo(29,"Case","Palavra reservada");
			Simbolo s30 = new Simbolo(30,"+","Operador");
			Simbolo s31 = new Simbolo(31,"-","Operador");
			Simbolo s32 = new Simbolo(32,"*","Operador");
			Simbolo s33 = new Simbolo(33,"/","Operador");
			Simbolo s34 = new Simbolo(34,"[","Símbolo Especial");
			Simbolo s35 = new Simbolo(35,"]","Símbolo Especial");
			Simbolo s36 = new Simbolo(36,"(","Símbolo Especial");
			Simbolo s37 = new Simbolo(37,")","Símbolo Especial");
			Simbolo s38 = new Simbolo(38,":=","Operador");
			Simbolo s39 = new Simbolo(39,":","Símbolo Especial");
			Simbolo s40 = new Simbolo(40,"=","Operador");
			Simbolo s41 = new Simbolo(41,">","Operador");
			Simbolo s42 = new Simbolo(42,">=","Operador");
			Simbolo s43 = new Simbolo(43,"<","Operador");
			Simbolo s44 = new Simbolo(44,"<=","Operador");
			Simbolo s45 = new Simbolo(45,"<>","Operador");
			Simbolo s46 = new Simbolo(46,",","Símbolo Especial");
			Simbolo s47 = new Simbolo(47,";","Símbolo Especial");
			Simbolo s48 = new Simbolo(48,"Literal","Literal");
			Simbolo s49 = new Simbolo(49,".","Símbolo Especial");
			Simbolo s50 = new Simbolo(50,"..","Símbolo Especial");
			Simbolo s51 = new Simbolo(51,"$","Delimitador");
			
			
			tabelaDeSimbolos.add(s1);
			tabelaDeSimbolos.add(s2);
			tabelaDeSimbolos.add(s3);
			tabelaDeSimbolos.add(s4);
			tabelaDeSimbolos.add(s5);
			tabelaDeSimbolos.add(s6);
			tabelaDeSimbolos.add(s7);
			tabelaDeSimbolos.add(s8);
			tabelaDeSimbolos.add(s9);
			tabelaDeSimbolos.add(s10);
			tabelaDeSimbolos.add(s11);
			tabelaDeSimbolos.add(s12);
			tabelaDeSimbolos.add(s13);
			tabelaDeSimbolos.add(s14);
			tabelaDeSimbolos.add(s15);
			tabelaDeSimbolos.add(s16);
			tabelaDeSimbolos.add(s17);
			tabelaDeSimbolos.add(s18);
			tabelaDeSimbolos.add(s19);
			tabelaDeSimbolos.add(s20);
			tabelaDeSimbolos.add(s21);
			tabelaDeSimbolos.add(s22);
			tabelaDeSimbolos.add(s23);
			tabelaDeSimbolos.add(s24);
			tabelaDeSimbolos.add(s25);
			tabelaDeSimbolos.add(s26);
			tabelaDeSimbolos.add(s27);
			tabelaDeSimbolos.add(s28);
			tabelaDeSimbolos.add(s29);
			tabelaDeSimbolos.add(s30);
			tabelaDeSimbolos.add(s31);
			tabelaDeSimbolos.add(s32);
			tabelaDeSimbolos.add(s33);
			tabelaDeSimbolos.add(s34);
			tabelaDeSimbolos.add(s35);
			tabelaDeSimbolos.add(s36);
			tabelaDeSimbolos.add(s37);
			tabelaDeSimbolos.add(s38);
			tabelaDeSimbolos.add(s39);
			tabelaDeSimbolos.add(s40);
			tabelaDeSimbolos.add(s41);
			tabelaDeSimbolos.add(s42);
			tabelaDeSimbolos.add(s43);
			tabelaDeSimbolos.add(s44);
			tabelaDeSimbolos.add(s45);
			tabelaDeSimbolos.add(s46);
			tabelaDeSimbolos.add(s47);
			tabelaDeSimbolos.add(s48);
			tabelaDeSimbolos.add(s49);
			tabelaDeSimbolos.add(s50);
			tabelaDeSimbolos.add(s51);
			
		}
		
	
}
