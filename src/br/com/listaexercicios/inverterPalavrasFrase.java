package br.com.listaexercicios;

import java.util.Arrays;
import java.util.List;

public class inverterPalavrasFrase {

	public static void main(String[] args) {
		String frase = "Dada uma frase, retorne uma nova frase com a ordem das palavras invertida, mantendo cada palavra exatamente como está.";
		
		List<String> arrayFrase = Arrays.asList(frase.split(" "));
		
		for(int contador = arrayFrase.size()-1; contador >= 0 ; contador--) {
			System.out.print(arrayFrase.get(contador)+ " ");
		}
		
		
	
	}

}
