package atividade2;
import atividade2.Quadrado;
public class Paralelpipedo extends Ponto{
    Quadrado quadrado = new Quadrado();
    protected Double comprimento;

    public Double getComprimento() {
        return comprimento;
    }

    public Paralelpipedo setComprimento(Double comprimento) {
        this.comprimento = comprimento;
        return this;
    }

    public Double volume(){
        return quadrado.area() * comprimento;
    }
}
