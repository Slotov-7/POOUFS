package atividade2_3.entites;

import atividade2_3.util.DesenharFiguras;

import javax.swing.*;
import java.awt.*;

public class Circulo extends Ponto{
    protected Double raio;

    public Double getRaio() {
        return raio;
    }

    public Circulo setRaio(Double raio) {
        this.raio = raio;
        return this;
    }
    public Double area(){
        return Math.PI * Math.pow(raio, 2);
    }
    public void desenhar() {
        JFrame janela = new JFrame("Desenhar Circuulo");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DesenharFiguras desenho = new DesenharFiguras() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                circulo(g);
            }
        };
        janela.add(desenho);
        janela.setSize(300, 300);
        janela.setVisible(true);
    }
}
