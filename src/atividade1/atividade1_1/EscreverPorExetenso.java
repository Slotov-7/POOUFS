package atividade1.atividade1_1;

public class EscreverPorExetenso {
    private Integer numero;
    private static final String[] UNIDADES = {
            "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
            "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    private static final String[] DEZENAS = {
            "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
    };

    private static final String CENTO = "cem";

    public EscreverPorExetenso() {
    }

    public EscreverPorExetenso(Integer numero) {
        this.numero = numero;
    }

    public Integer numero() {
        return numero;
    }

    public EscreverPorExetenso setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    private String converteNumeroPorExtenso(int numero) {
        if (numero < 20) {
            return UNIDADES[numero];
        } else if (numero < 100) {
            return DEZENAS[numero / 10] + (numero % 10 != 0 ? " e " + UNIDADES[numero % 10] : " ");
        } else {
            return CENTO;
        }
    }

    public String converte(int numero) {
        if (numero == 0) {
            return "zero";
        } else if (numero == 100) {
            return CENTO;
        } else {
            return converteNumeroPorExtenso(numero).trim();
        }
    }
}
