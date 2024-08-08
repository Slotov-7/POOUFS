package atividade2;

public class Program {
    public static void main(String[] args) {
        Ponto ponto = new Ponto();
        ponto.setX(5.0).setY(10.0);
        System.out.println("Ponto: (" + ponto.getX() + ", " + ponto.getY() + ")");

        Circulo circulo = new Circulo();
        circulo.setRaio(5.0);
        System.out.println("Área do círculo: " + circulo.area());

        Cilindro cilindro = new Cilindro();
        cilindro.setRaio(5.0);
        cilindro.setAltura(10.0);
        System.out.println("Área do cilindro: " + cilindro.area());
        System.out.println("Volume do cilindro: " + cilindro.volume());

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5.0);
        System.out.println("Área do quadrado: " + quadrado.area());

        Paralelpipedo paralelpipedo = new Paralelpipedo();
        paralelpipedo.quadrado.setLado(5.0);
        paralelpipedo.setComprimento(10.0);
        System.out.println("Volume do paralelepípedo: " + paralelpipedo.volume());

        Cubo cubo = new Cubo();
        cubo.setLado(5.0);
        System.out.println("Área do cubo: " + cubo.area());
        System.out.println("Volume do cubo: " + cubo.volume());

    }
}
