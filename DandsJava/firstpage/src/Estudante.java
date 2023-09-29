public class Estudante {
    private String nome;
    private int idade;
    private double media;

    Estudante(String nome, int idade, double media){
        this.nome = nome;
        this.idade = idade;
        this.media = media;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    int getIdade() {
        return idade;
    }

    void setMedia(double media) {
        this.media = media;
    }

    double getMedia() {
        return media;
    }
    public void verificarMedia(){
        if(media >= 7){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
    }

    public String toString(){
        return ("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Media: " + media);
    }
}
