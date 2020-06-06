package view;

import java.util.ArrayList;

import Model.Estado;
import Model.Linguagem;
import Model.RegrasProducao;
import Model.Token;

public class AnalisadorLexico {
	
	Linguagem l = new Linguagem();
	ArrayList<Token> tabelaDeTokens = new ArrayList<>();
	RegrasProducao regras = new RegrasProducao();
	
	public Estado analisador(String caracter, RegrasProducao regras, Estado atual) {
		
		return regras.tabelaTransacao(caracter, atual);
		
	}
	

	

		

}
