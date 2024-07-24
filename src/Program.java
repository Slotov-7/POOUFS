import entites.Livros;

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

        while (true) {
            System.out.println("Menu:");
            System.out.println("1) Exibir dados de livros cadastrados");
            System.out.println("2) Exibir livros lançados em determinado ano");
            System.out.println("3) Reajustar valor dos livros");
            System.out.println("4) Sair");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (option == 4) {
                break;
            }

            switch (option) {
                case 1:
                    for (Livros livro : vetorDeLivros) {
                        System.out.println(livro);
                    }
                    break;
                case 2:
                    System.out.print("Informe o ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Os livros lançados em " + ano);
                    for (Livros livro : vetorDeLivros){
                        if (livro.anoLancamento() == ano){
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Quer reajustar de algum ano de lançamento especifico?");
                    char simOuNao = scanner.nextLine().toUpperCase().charAt(0);
                    System.out.print("Informe o percentual de reajuste:");
                    double percentual = scanner.nextDouble();
                    scanner.nextLine();
                    if(simOuNao == 'S'){
                        System.out.print("Digite o ano de lançamento: ");
                        int ano1 = scanner.nextInt();
                        scanner.nextLine();
                        for (Livros livros : vetorDeLivros){
                            if (ano1 == livros.anoLancamento()){
                                livros.reajustarValor(percentual);
                            }
                        }
                    }
                    else{
                        for (Livros livros : vetorDeLivros){
                            livros.reajustarValor(percentual);
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }
        scanner.close();
    }
}