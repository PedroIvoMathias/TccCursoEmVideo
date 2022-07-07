package ProjetoVideo;

public class Visualizacao {
    private Aluno espectador;
    private Video filme;

    public Visualizacao() {
    }

    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssist(this.espectador.getTotAssist()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porcent){
        int tot = 3;
       
        if(porcent<=20){
            tot=3;
        }else{
            if(porcent<=50){
                tot=5;
            }else{
                if(porcent<=90){
                    tot=8;
                }else{
                    tot=10;
                }
            }
        }
        this.filme.setAvaliacao(tot);
    }
    public Aluno getEspectador() {
        return espectador;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Detalhes do vídeo:\n" + this.espectador.toString() + this.filme.toString();
    }
    
}
