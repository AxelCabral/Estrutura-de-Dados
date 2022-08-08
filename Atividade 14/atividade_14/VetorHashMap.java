package atividade_14;

public class VetorHashMap {
    private Aluno[] vetor;
    private int nElementos = 0;

    public VetorHashMap() {
        this.vetor = new Aluno[5];
    }

    private int hash(String chave) {
        int chaveS = Integer.parseInt(chave);
        return (int) (((chaveS * 0.63274838) % 1) * vetor.length);
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
                this.nElementos++;
                rehash();
                return;
            }
            sondagem++;
        }
        rehash();
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
                System.out.println("Aluno "+i+": "+vetor[i].getNome()+" / Matrícula: "+vetor[i].getMatricula());
            }
        }
    }

    public void resize() {
        Aluno aux[] = vetor;
        Aluno novo[] = new Aluno[vetor.length*2];
        this.vetor = novo;
        this.nElementos = 0;
        for(Aluno Aluno : aux) {
            put(Aluno.getMatricula(), Aluno);
        }
    }

    public int tamanho(){
        return this.vetor.length;
    }

    private void rehash() {
        if (nElementos/vetor.length > 0.80) {
            resize();
        }
    }
}