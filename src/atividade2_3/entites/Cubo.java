package atividade2_3.entites;

import atividade2_3.util.DesenharFiguras;

import javax.swing.*;
import java.awt.*;

public class Cubo extends Quadrado{
    @Override
    public Double area(){
        return 6 * Math.pow(lado, 2);
    }
    public Double volume(){
        return Math.pow(lado, 3);
    }
    public void desenhar() {
        JFrame janela = new JFrame("Desenhar Cubo");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DesenharFiguras desenho = new DesenharFiguras() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                cubo(g);
            }
        };
        janela.add(desenho);
        janela.setSize(300, 300);
        janela.setVisible(true);
    }
}
