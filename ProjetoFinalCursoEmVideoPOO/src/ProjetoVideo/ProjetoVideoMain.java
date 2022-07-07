package ProjetoVideo;

public class ProjetoVideoMain {

    public static void main(String[] args) {
        Video v[] = new Video[4];
        v[0] = new Video("Em busca de um sonho");
        v[1] = new Video("A batalha de Ridick");
        v[2] = new Video("Ursinho Poo");
        v[3] = new Video("Final Fantasy XIII");
        
        Aluno a[] = new Aluno[4];
        a[0] = new Aluno("Lucas","M",18,0.0f,0);
        a[1] = new Aluno("Carla","F",20,0.0f,0);
        
        

        
       
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(v[3].toString());
        
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
        
        
        Visualizacao vis[] = new Visualizacao [4];
        vis[0]=new Visualizacao(a[0],v[3]);
        
        System.out.println(vis[0].toString());
        vis[0]=new Visualizacao(a[0],v[2]);
        v[3].like();
        v[2].like();
        vis[0].avaliar();
        System.out.println(vis[0].toString());
    }
    
}
