package atividade2_3.entites;

public class  Ponto {
    protected Double x;
    protected Double y;

    public void setPonto(Double x, Double y){
        this.x = x;
        this.y = y;
    }
    public Double getX() {
        return x;
    }

    public Ponto setX(Double x) {
        this.x = x;
        return this;
    }

    public Double getY() {
        return y;
    }

    public Ponto setY(Double y) {
        this.y = y;
        return this;
    }
}
