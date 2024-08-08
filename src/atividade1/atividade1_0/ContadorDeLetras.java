package atividade1.atividade1_0;

public class ContadorDeLetras {
    private String texto;

    public ContadorDeLetras() {
    }

    public ContadorDeLetras(String texto) {
        this.texto = texto;
    }

    public String texto() {
        return texto;
    }

    public ContadorDeLetras setTexto(String texto) {
        this.texto = texto;
        return this;
    }
    public int contarVogais(){
        String vogais = "AEIOU";
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (vogais.contains(String.valueOf(texto.toUpperCase().charAt(i)))) {
                cont++;
            }
        }
        return cont;
    }
    public int contarConsoantes(){
        String consoantes = "BCDFGHJKLMNPQRSTVWXYZ";
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (consoantes.contains(String.valueOf(texto.toUpperCase().charAt(i)))) {
                cont++;
            }
        }
        return cont;
    }
    public int contarEspacos(){
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                cont++;
            }
        }
        return cont;
    }
}
