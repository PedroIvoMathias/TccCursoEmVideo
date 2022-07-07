package ProjetoVideo;

public abstract class Pessoa {
    private String nome, sexo;
    private int idade;
    private float xp;
    
    public Pessoa (){
        
    }

    public Pessoa(String nome, String sexo, int idade, float xp) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.xp = xp;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    
    
    
    public abstract void ganharXP();

    @Override
    public String toString() {
        return "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", xp=" + xp ;
    }
    
    
    
}
