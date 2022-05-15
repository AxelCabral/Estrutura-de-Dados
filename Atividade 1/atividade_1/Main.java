package atividade_1;

public class Main {
    public static void main(String args[]){
        
        PontoC pPonto = new PontoC(15, 15);
        PontoC sPonto = new PontoC(30, 30);

        PontoCartesiano pontos = new PontoCartesiano(pPonto, sPonto);
        double DE = pontos.distanciaEuclidiana();
        System.out.println(DE);
    }
}
