package atividade2;

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
}
