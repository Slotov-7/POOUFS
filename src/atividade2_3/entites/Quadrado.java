package atividade2_3.entites;

import atividade2_3.util.DesenharFiguras;

import javax.swing.*;
import java.awt.*;

public class Quadrado extends Ponto{
    protected Double lado;
    DesenharFiguras desenho = new DesenharFiguras();


    public Double getLado() {
        return lado;
    }

    public Quadrado setLado(Double lado) {
        this.lado = lado;
        return this;
    }
    public Double area(){
        return Math.pow(lado, 2);
    }
    public Double perimetro(){
        return 4 * lado;
    }

    public void desenhar() {
        JFrame janela = new JFrame("Desenhar Quadrado");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DesenharFiguras desenho = new DesenharFiguras() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                quadrado(g);
            }
        };
        janela.add(desenho);
        janela.setSize(300, 300);
        janela.setVisible(true);
    }
}
