public class MainLivro {
    
    public static void main (String[] args) throws Exception {
        Livro livro1 = new Livro("A seleção", "Kiera Cass", 2012);

        System.out.println("Livro 1");
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano de publicacao: " + livro1.getAnoPublicacao());
        
    }
}
