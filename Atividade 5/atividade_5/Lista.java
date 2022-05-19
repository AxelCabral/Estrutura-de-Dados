package atividade_5;

public interface Lista {
    public void insereInicio(Object info);
    public void insereFim(int info);
    public boolean estaVazia();
    public boolean remove(int info);
    public int tamanho();
}