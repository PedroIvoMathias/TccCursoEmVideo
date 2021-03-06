package ProjetoVideo;

public class Video implements AcoesVideo {
    private String titulo;
    private int views, curtidas, avaliacao;
    private boolean reproduzindo;

    public Video() {
    }

    public Video(String titulo) {
        this.titulo = titulo;
        this.views = 0;
        this.curtidas = 0;
        this.avaliacao = 0;
        this.reproduzindo = false;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova = 0;
        nova = (this.avaliacao + avaliacao)/this.views;
        
        this.avaliacao = nova;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    

    @Override
    public void play() {
        this.setReproduzindo(true);
        this.setViews(this.getViews()+1);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", views=" + views + ", curtidas=" + curtidas + ", avaliacao=" + avaliacao + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
    
}
