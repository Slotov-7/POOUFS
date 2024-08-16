package atividade2_3.entites;

import atividade2_3.util.DesenharFiguras;

import javax.swing.*;
import java.awt.*;

public class Paralelpipedo extends Ponto{
    public Quadrado quadrado = new Quadrado();
    protected Double comprimento;

    public Double getComprimento() {
        return comprimento;
    }

    public Paralelpipedo setComprimento(Double comprimento) {
        this.comprimento = comprimento;
        return this;
    }

    public Double volume(){
        return quadrado.area() * comprimento;
    }
    public void desenhar() {
        JFrame janela = new JFrame("Desenhar Paralelepipedo ");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DesenharFiguras desenho = new DesenharFiguras() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                paralelepipedo(g);
            }
        };
        janela.add(desenho);
        janela.setSize(300, 300);
        janela.setVisible(true);
    }
}

