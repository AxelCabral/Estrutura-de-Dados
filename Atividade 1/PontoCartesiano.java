public class PontoCartesiano {
    private PontoC p1;
    private PontoC p2;


    public PontoCartesiano(PontoC p1, PontoC p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public PontoC getP1() {
        return this.p1;
    }

    public void setP1(PontoC p1) {
        this.p1 = p1;
    }

    public PontoC getP2() {
        return this.p2;
    }

    public void setP2(PontoC p2) {
        this.p2 = p2;
    }

    public double distanciaEuclidiana(){

        double xPaPb = p2.getX()-p1.getX();
        double yPaPb = p2.getY()-p1.getY();

        double dFinal = Math.sqrt(Math.pow(xPaPb, 2)+Math.pow(yPaPb, 2));
        return dFinal;
    }

}   
