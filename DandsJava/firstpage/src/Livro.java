public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    void setTitulo(String titulo){
        this.titulo = titulo;
    }

    String getTitulo(){
        return titulo;
    }
    
    void setAutor(String autor){
        this.autor = autor;
    }

    String getAutor(){
        return autor;
    }

    void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    int getAnoPublicacao(){
        return anoPublicacao;
    }
}

