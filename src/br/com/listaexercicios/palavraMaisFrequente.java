package br.com.listaexercicios;

import java.util.Arrays;
import java.util.List;

public class palavraMaisFrequente {

	public static void main(String[] args) {
		String frase = "Ela caminhava, caminhava pela rua silenciosa, repetindo repetindo pensamentos que não queria lembrar";
		int numeroRepeticao = 0;
		String contaPalavra = "";
		
	
		List<String> arrayFrase = Arrays.asList(frase.toLowerCase().replace(",","").split(" "));
		arrayFrase.sort(null);
				
		
		for(int contador=0; contador < arrayFrase.size(); contador++) {
			int count = 0;
			for(int contadorInterno=0; contadorInterno < arrayFrase.size(); contadorInterno++) {
				if(arrayFrase.get(contadorInterno).equals(arrayFrase.get(contador))) {
					count++;
					if(count > numeroRepeticao) {
						contaPalavra = arrayFrase.get(contador);
						numeroRepeticao = count;
					}
					
				}

			}
		}
		System.out.println("Palavra mais repetida: " + contaPalavra + ","+ numeroRepeticao);
	}

}
