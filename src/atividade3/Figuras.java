package atividade3;

import javax.swing.*;
import java.awt.*;

public class Figuras extends JPanel {

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        desenharRetangulo(g);
        desenharCirculo(g);
        desenharTriangulo(g);
        desenharQuadrado(g);
        desenharLosango(g);
        desenharOval(g);
        desenharCubo(g);
    }
    private void desenharRetangulo(Graphics g) {
        g.drawRect(10, 10, 200, 100);
    }
    private void desenharQuadrado(Graphics g) {
        g.drawRect(50, 130, 100, 100);
    }
    private void desenharCirculo(Graphics g) {
        g.drawOval(50, 245, 100, 100);
    }
    private void desenharTriangulo(Graphics g) {
        int baseX = 55;
        int baseY = 420;
        int altura = (int) (Math.sqrt(3) * 80 / 2);

        int[] x = {baseX, baseX + 80, baseX + 40};
        int[] y = {baseY, baseY, baseY - altura};
        g.drawPolygon(x, y , 3);
    }
    private void desenharLosango(Graphics g) {
        int centroX = 95;
        int centroY = 470;
        int largura = 100;
        int altura = 60;
        int[] x = {centroX, centroX + largura / 2, centroX, centroX - largura / 2};
        int[] y = {centroY - altura / 2, centroY, centroY + altura / 2, centroY};
        g.drawPolygon(x, y, 4);
    }
    private void desenharOval(Graphics g) {
        g.drawOval(45, 520, 100, 70);
    }
    private void desenharCubo(Graphics g) {
        int x = 50;
        int y = 600;
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
