package br.com.listaexercicios;


public class cifraCesar {

	public static void main(String[] args) {
		final Character ALFABETO[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		String texto = "xyz";
		
		Integer deslocamento = 3;
		texto.toCharArray();
		for(char indice: texto.toCharArray() ) {
			for(int contador = 0; contador < ALFABETO.length; contador++) {
				if(ALFABETO[contador] == indice) {
					
					Integer newPosition = contador + deslocamento;
					if (newPosition > 25) {
						newPosition = newPosition % 26;
					}
					System.out.print(ALFABETO[newPosition]);
					
				}
			}
		}
		
	}

}
