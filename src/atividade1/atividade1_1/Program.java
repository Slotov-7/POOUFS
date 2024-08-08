package atividade1.atividade1_1;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        EscreverPorExetenso escreverPorExetenso = new EscreverPorExetenso(Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")));
        JOptionPane.showMessageDialog(null, escreverPorExetenso.converte(escreverPorExetenso.numero()));
    }
}
