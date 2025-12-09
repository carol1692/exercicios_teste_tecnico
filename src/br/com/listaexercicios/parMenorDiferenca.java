package br.com.listaexercicios;

public class parMenorDiferenca {

	public static void main(String[] args) {
		int arrayInteiros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		Integer alvo = 4;
		int[] resultados = new int[2];
		int menorDiferenca = Integer.MAX_VALUE;
		for(int indice: arrayInteiros) {
				for(int contador=0; contador < arrayInteiros.length; contador++) {
				int soma =  ( indice + arrayInteiros[contador]);
				int diferenca = Math.abs(indice - arrayInteiros[contador]);
				if(soma == alvo ) {
					if(diferenca < menorDiferenca) {
						menorDiferenca = diferenca;
						resultados[0] = indice;
						resultados[1] = arrayInteiros[contador];
					}
					System.out.println(indice + "," + arrayInteiros[contador]);
					System.out.println(diferenca);
					
				}
			}
		}
		System.out.println("dupla com menor diferenca: "+ resultados[0]+"," + resultados[1]);
	}

}
