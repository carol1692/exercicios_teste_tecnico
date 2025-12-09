package br.com.listaexercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegundoMaiorNumero {

	public static void main(String[] args) {
		Integer[] numeros = {3, 8, 15, 1, 22, 7, 9, 14, 30, 5};
		
		List<Integer> copyArray = new ArrayList<>(Arrays.asList(numeros));
		copyArray.sort(null);
		System.out.println(copyArray);
		System.out.println(copyArray.get(copyArray.size()-2));
		

	}

}
