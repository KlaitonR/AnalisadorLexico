package view;

import java.util.ArrayList;

import Model.Linguagem;
import Model.RegrasProducao;
import Model.Token;

public class AnalisadorLexico {
	
	Linguagem l = new Linguagem();
	ArrayList<Token> tabelaDeTokens = new ArrayList<>();
	RegrasProducao regras = new RegrasProducao();
	
	public void analisador(String caracter) {
		
		regras.tabelaTransacao(caracter);
		
	}
	

	

		

}
