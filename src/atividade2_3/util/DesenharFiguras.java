package atividade2_3.util;

import javax.swing.*;
import java.awt.*;

public class DesenharFiguras extends JPanel {

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
    }

    public void quadrado(Graphics g) {
        g.drawRect(50, 100, 100, 100);
    }
    public void circulo(Graphics g) {
        g.drawOval(50, 100, 100, 100);
    }

    public void cilindro(Graphics g) {
        g.drawOval(80, 50, 100, 30);
        g.drawOval(80, 200, 100, 30);
        g.drawLine(80, 65, 80, 215);
        g.drawLine(180, 65, 180, 215);
    }

    public void paralelepipedo(Graphics g) {
        g.drawRect(15, 10, 200, 100);
        g.drawRect(40, 30, 200, 100);
        g.drawLine(15, 10, 40, 30);
        g.drawLine(215, 10, 240, 30);
        g.drawLine(15, 110, 40, 130);
        g.drawLine(215, 110, 240, 130);
    }

    public void cubo(Graphics g) {
        int x = 50;
        int y = 100;
        int lado = 100;
        int deslocamento = 20;
        g.drawRect(x, y, lado, lado);
        g.drawRect(x + deslocamento, y + deslocamento, lado, lado);
        g.drawLine(x, y, x + deslocamento, y + deslocamento);
        g.drawLine(x + lado, y, x + lado + deslocamento, y + deslocamento);
        g.drawLine(x, y + lado, x + deslocamento, y + lado + deslocamento);
        g.drawLine(x + lado, y + lado, x + lado + deslocamento, y + lado + deslocamento);
    }
}
