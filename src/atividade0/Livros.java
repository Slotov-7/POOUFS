package atividade0;

public class Livros {
    private String nomeLivro;
    private String autor;
    private String editora;
    private Integer numPaginas;
    private String estilo;
    private Double valor;
    private Integer anoLancamento;

    public Livros() {
    }

    public Livros(String nomeLivro, String autor, String ditora, Integer numPaginas, String estilo, Double valor, Integer anoLancamento) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.editora = ditora;
        this.numPaginas = numPaginas;
        this.estilo = estilo;
        this.valor = valor;
        this.anoLancamento = anoLancamento;
    }

    public String nomeLivro() {
        return nomeLivro;
    }

    public Livros setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
        return this;
    }

    public String autor() {
        return autor;
    }

    public Livros setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public String editora() {
        return editora;
    }

    public Livros setEditora(String ditora) {
        this.editora = ditora;
        return this;
    }

    public Integer numPaginas() {
        return numPaginas;
    }

    public Livros setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
        return this;
    }

    public String estilo() {
        return estilo;
    }

    public Livros setEstilo(String estilo) {
        this.estilo = estilo;
        return this;
    }

    public Double valor() {
        return valor;
    }

    public Livros setValor(Double valor) {
        this.valor = valor;
        return this;
    }

    public Integer anoLancamento() {
        return anoLancamento;
    }

    public Livros setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
        return this;
    }
    public void imprimirDetalhes() {
        System.out.println("Detalhes do Livro:");
        System.out.println("Nome do Livro: '" + (nomeLivro != null ? nomeLivro : "N/A") + "'");
        System.out.println("Autor: '" + (autor != null ? autor : "N/A") + "'");
        System.out.println("Editora: '" + (editora != null ? editora : "N/A") + "'");
        System.out.println("Número de Páginas: " + numPaginas);
        System.out.println("Estilo: '" + (estilo != null ? estilo : "N/A") + "'");
        System.out.println("Valor: " + String.format("%.2f", valor));
    }
    public void reajustarValor(double percentual){
        valor += valor * (percentual/100);
    }
}
