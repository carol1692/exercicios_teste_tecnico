package br.com.listaexercicios;

import java.util.Arrays;


public class anagramas {

	public static void main(String[] args) {
		String palavra1 = "amor";
		String palavra2 = "casa";
		char[] copyPalavra1 = palavra1.toCharArray();
		char[] copyPalavra2 = palavra2.toCharArray();
		Arrays.sort(copyPalavra1);
		Arrays.sort(copyPalavra2);
		
		System.out.println(Arrays.equals(copyPalavra2, copyPalavra1));

		}

	}


