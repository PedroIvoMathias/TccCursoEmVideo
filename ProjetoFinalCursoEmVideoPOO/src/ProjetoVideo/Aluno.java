package ProjetoVideo;

public class Aluno extends Pessoa{
    private int totAssist;
    
    
    public Aluno(){}
    
    public Aluno(String nome, String sexo, int idade, float xp, int totAssist){
        super(nome,sexo,idade,xp);
        this.totAssist = totAssist;
    }

    public int getTotAssist() {
        return totAssist;
    }

    public void setTotAssist(int totAssist) {
        this.totAssist = totAssist;
    }
    
    

    
    @Override
    public void ganharXP() {
       super.setXp(super.getXp()+1);
    }

    @Override
    public String toString() {
        return "Aluno{" +super.toString() + "totAssist=" + totAssist + '}';
    }
    
    
    
}
