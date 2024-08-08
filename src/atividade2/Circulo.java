package atividade2;

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
}
