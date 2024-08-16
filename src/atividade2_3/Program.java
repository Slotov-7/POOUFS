package atividade2_3;

import atividade2_3.entites.*;

public class Program {
    public static void main(String[] args) {
        Ponto ponto = new Ponto();
        ponto.setX(5.0).setY(10.0);
        System.out.println("Ponto: (" + ponto.getX() + ", " + ponto.getY() + ")");

        Circulo circulo = new Circulo();
        circulo.setRaio(5.0);
        System.out.println("Área do círculo: " + circulo.area());
        circulo.desenhar();

        Cilindro cilindro = new Cilindro();
        cilindro.setRaio(5.0);
        cilindro.setAltura(10.0);
        System.out.println("Área do cilindro: " + cilindro.area());
        System.out.println("Volume do cilindro: " + cilindro.volume());
        cilindro.desenhar();

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5.0);
        System.out.println("Área do quadrado: " + quadrado.area());
        quadrado.desenhar();

        Paralelpipedo paralelpipedo = new Paralelpipedo();
        paralelpipedo.quadrado.setLado(5.0);
        paralelpipedo.setComprimento(10.0);
        System.out.println("Volume do paralelepípedo: " + paralelpipedo.volume());
        paralelpipedo.desenhar();

        Cubo cubo = new Cubo();
        cubo.setLado(5.0);
        System.out.println("Área do cubo: " + cubo.area());
        System.out.println("Volume do cubo: " + cubo.volume());
        cubo.desenhar();

    }
}
