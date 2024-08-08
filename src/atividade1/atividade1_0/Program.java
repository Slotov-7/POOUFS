package atividade1.atividade1_0;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        ContadorDeLetras texto = new ContadorDeLetras(JOptionPane.showInputDialog("Digite um texto:"));

        JOptionPane.showMessageDialog(null, "O texto digitado tem " + texto.contarVogais() + " vogais" + "\n" +
                "O texto digitado tem " + texto.contarConsoantes() + " consoantes" + "\n" +
                "O texto digitado tem " + texto.contarEspacos() + " espaços");
    }
}
