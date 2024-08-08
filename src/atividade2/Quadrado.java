package atividade2;

public class Quadrado extends Ponto{
    protected Double lado;

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
}
