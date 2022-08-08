package atividade_16;

public class Noh
{
    int valor;
    Noh esq;
    Noh dir;
    Noh pai;

    public Noh(int v){
        this.valor = v;
        esq = null;
        dir = null;
        pai = null;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Noh getEsq() {
        return this.esq;
    }

    public void setEsq(Noh esq) {
        this.esq = esq;
    }

    public Noh getDir() {
        return this.dir;
    }

    public void setDir(Noh dir) {
        this.dir = dir;
    }

    public Noh getPai() {
        return this.pai;
    }

    public void setPai(Noh pai) {
        this.pai = pai;
    }

}