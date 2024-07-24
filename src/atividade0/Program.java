package atividade0;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livros[] vetorDeLivros = new Livros[10];

        vetorDeLivros[0] = new Livros("O Nome do Vento", "Patrick Rothfuss", "Arqueiro", 656, "Fantasia", 49.90, 2007);
        vetorDeLivros[1] = new Livros("1984", "George Orwell", "Companhia das Letras", 416, "Distopia", 34.90, 1949);
        vetorDeLivros[2] = new Livros("Orgulho e Preconceito", "Jane Austen", "Penguin Classics", 480, "Romance", 29.90, 1813);
        vetorDeLivros[3] = new Livros("O Senhor dos Anéis", "J.R.R. Tolkien", "HarperCollins", 1216, "Fantasia", 99.90, 1954);
        vetorDeLivros[4] = new Livros("Cem Anos de Solidão", "Gabriel Garcia Marquez", "Record", 432, "Realismo Mágico", 39.90, 1967);
        vetorDeLivros[5] = new Livros("Dom Casmurro", "Machado de Assis", "Garnier", 256, "Clássico", 19.90, 1899);
        vetorDeLivros[6] = new Livros("A Menina que Roubava Livros", "Markus Zusak", "Intrínseca", 480, "Drama", 44.90, 2005);
        vetorDeLivros[7] = new Livros("O Hobbit", "J.R.R. Tolkien", "HarperCollins", 336, "Fantasia", 34.90, 1937);
        vetorDeLivros[8] = new Livros("Memórias Póstumas de Brás Cubas", "Machado de Assis", "Garnier", 208, "Clássico", 24.90, 1881);
        vetorDeLivros[9] = new Livros("O Apanhador no Campo de Centeio", "J.D. Salinger", "Companhia das Letras", 224, "Romance", 28.90, 1951);

        for (Livros livro : vetorDeLivros) {
            livro.imprimirDetalhes();
        }
        for (Livros livro : vetorDeLivros) {
            if (livro.anoLancamento() < 2020) {
                livro.reajustarValor(10);
            } else {
                livro.reajustarValor(8);
            }
        }
        System.out.println("Após o reajuste de valores:");

        for (Livros livro : vetorDeLivros) {
            livro.imprimirDetalhes();
        }
        scanner.close();
    }
}


