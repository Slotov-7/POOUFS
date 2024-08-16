package atividade2_3.entites;

import atividade2_3.util.DesenharFiguras;

import javax.swing.*;
import java.awt.*;

public class Cilindro extends Circulo {
    protected Double altura;

    public Double getAltura() {
        return altura;
    }

    public Cilindro setAltura(Double altura) {
        this.altura = altura;
        return this;
    }
    @Override
    public Double area(){
        return 2 * Math.PI * raio * (raio + altura);
    }
    public Double volume(){
        return Math.PI * Math.pow(raio, 2) * altura;
    }
    public void desenhar() {
        JFrame janela = new JFrame("Desenhar Cilindro");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DesenharFiguras desenho = new DesenharFiguras() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                cilindro(g);
            }
        };
        janela.add(desenho);
        janela.setSize(300, 300);
        janela.setVisible(true);
    }
}
