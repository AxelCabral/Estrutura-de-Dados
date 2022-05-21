package atividade_5;

public interface Lista {
    public void insereInicio(Object info);
    public void insereFim(Object info);
    public boolean estaVazia();
    public boolean remove(Object info);
    public int tamanho();
    public void imprime();
}