package br.com.listaexercicios;

import java.util.List;

public class somaPrecosStream {
	 // Classe Produto dentro da mesma classe principal
    static class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }
    }


	public static void main(String[] args) {
		  // Lista de produtos
        List<Produto> produtos = List.of(
            new Produto("Arroz", 25.00),
            new Produto("Azeite", 15.50),
            new Produto("Ameixa", 7.20),
            new Produto("Feijão", 8.90),
            new Produto("Macarrão", 4.50),
            new Produto("Água Mineral", 2.00),
            new Produto("Abacaxi", 6.75),
            new Produto("Biscoito", 3.40),
            new Produto("Alface", 2.50),
            new Produto("Chocolate", 9.90)
        );

        // Usando Stream para resolver o exercício
        double soma = produtos.stream()
                .filter(p -> p.getNome().startsWith("A"))
                .mapToDouble(Produto::getPreco)
                .sum();

        System.out.println("Soma dos produtos que começam com 'A': " + soma);
    }

	}


