package br.com.listaexercicios;



public class palindromo {

	public static void main(String[] args) {
		Integer numero = Math.abs(-1234);
		
		String invertidoStr = new StringBuilder(String.valueOf(numero))
                .reverse()
                .toString();
		
		int numeroReverso = Integer.parseInt(invertidoStr);
		if(numero.equals(numeroReverso)) {
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
		

	}

}
