package atividade2;

public class Cubo extends Quadrado{
    @Override
    public Double area(){
        return 6 * Math.pow(lado, 2);
    }
    public Double volume(){
        return Math.pow(lado, 3);
    }
}
