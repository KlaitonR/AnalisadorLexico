package Model;

public class AutomatoFinito {
	
	Estado q0 = new Estado();
	Estado q1 = new Estado();
	Estado q2 = new Estado();
	Estado q3 = new Estado();
	Estado q4 = new Estado();
	Estado q5 = new Estado();
	Estado q6 = new Estado();
	Estado q7 = new Estado();
	Estado q8 = new Estado();
	Estado q9 = new Estado();
	Estado q10 = new Estado();
	Estado q11 = new Estado();
	Estado q12 = new Estado();
	Estado q13 = new Estado();
	Estado q14 = new Estado();
	Estado q15 = new Estado();
	Estado q16 = new Estado();
	Estado q17 = new Estado();
	Estado q18 = new Estado();
	Estado q19 = new Estado();
	Estado q20 = new Estado();
	Estado q21 = new Estado();
	Estado q22 = new Estado();
	Estado q23 = new Estado();
	Estado q24 = new Estado();
	Estado q25 = new Estado();
	Estado q26 = new Estado();
	Estado q27 = new Estado();
	Estado q28 = new Estado();
	Estado q29 = new Estado();
	Estado q30 = new Estado();
	
	public void estados() {
	
		q0.estadoFinal = false; // Não é um estado final
		
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
		
		q2.estadoFinal = false; // Não é um estado final
		q2.CaractersValidos.add("(");
		
		q3.estadoFinal = false; // Não é um estado final
		q3.CaractersValidos.add("*");
		
		q4.estadoFinal = false; // Não é um estado final
		
		q5.estadoFinal = false; // Não é um estado final
		q5.CaractersValidos.add("*");
		
		q6.estadoFinal = true; // É um estado final
		q6.CaractersValidos.add(")");
		
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
		
		q8.estadoFinal = true; // É um estado final
		q8.CaractersValidos.add(".");
		
		q9.estadoFinal = false; // Não é um estado final
		
		q10.estadoFinal = true; // É um estado final
		q10.CaractersValidos.add(":");
		
		q11.estadoFinal = true; // É um estado final
		q11.CaractersValidos.add("=");
		
		q12.estadoFinal = true; // É um estado final
		q12.CaractersValidos.add("<");
		
		q13.estadoFinal = true; // É um estado final
		q13.CaractersValidos.add("=");
		
		q14.estadoFinal = true; // É um estado final
		q14.CaractersValidos.add(">");
		
		q15.estadoFinal = true; // É um estado final
		q15.CaractersValidos.add(">");
		
		q16.estadoFinal = true; // É um estado final
		q16.CaractersValidos.add("=");
		
		q17.estadoFinal = true; // É um estado final
		q17.CaractersValidos.add("+");
		
		q18.estadoFinal = true; // É um estado final
		q18.CaractersValidos.add("-");
		
		q19.estadoFinal = true; // É um estado final
		q19.CaractersValidos.add("*");
		
		q20.estadoFinal = true; // É um estado final
		q20.CaractersValidos.add("/");
		
		q21.estadoFinal = true; // É um estado final
		q21.CaractersValidos.add(",");
		
		q22.estadoFinal = true; // É um estado final
		q22.CaractersValidos.add(";");
		
		q23.estadoFinal = true; // É um estado final
		q23.CaractersValidos.add("]");
		
		q24.estadoFinal = true; // É um estado final
		q24.CaractersValidos.add("[");
		
		q25.estadoFinal = true; // É um estado final
		q25.CaractersValidos.add("=");
		
		q26.estadoFinal = true; // É um estado final
		q26.CaractersValidos.add("$");
		
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
	
		q28.estadoFinal = false;
		q28.CaractersValidos.add("\"");
		
		q29.estadoFinal = false;
		
		q30.estadoFinal = true;
		q30.CaractersValidos.add("\"");
		
	}

}
