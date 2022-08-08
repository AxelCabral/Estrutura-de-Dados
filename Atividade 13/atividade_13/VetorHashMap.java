package atividade_13;

public class VetorHashMap {
    private Aluno[] vetor;

    public VetorHashMap() {
        this.vetor = new Aluno[5];
    }

    private int hash(String chave) {
        return Integer.parseInt(chave)%this.vetor.length;
    }

    public Aluno get(String chave) {
        int hash = hash(chave);
        return this.vetor[hash];
    }

    public void put(String chave, Aluno aluno) {
        int sondagem = 0;
        int hash;
        while(sondagem<vetor.length){
            hash = (hash(chave) + sondagem) % vetor.length;
            if(vetor[hash] == null || vetor[hash].getMatricula() == chave) {
                this.vetor[hash] = aluno;
                return;
            }
            sondagem++;
            
        }
    }

    public Aluno remove(String chave) {
        int hash = hash(chave);
        Aluno aluno = this.vetor[hash];
        this.vetor[hash(chave)] = null;
        return aluno;
    }
    
    public void print(){
        for(int i =0; i<vetor.length; i++){
            if(vetor[i] != null){
                System.out.println("Aluno "+i+": "+vetor[i].getNome()+" Matrícula: "+vetor[i].getMatricula());
            }
        }
    }
}