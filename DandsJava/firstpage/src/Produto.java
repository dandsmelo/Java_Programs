public class Produto {
    private String nome;
    private double preco;
    private int qtd;

    Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return nome;
    }

    void setPreco(double preco) {
        this.preco = preco;
    }

    double getPreco() {
        return preco;
    }

    void setQtd(int qtd) {
        this.qtd = qtd;
    }

    int getQtd() {
        return qtd;
    }

    public double cacularTotal(){
        double valorTotal = preco * qtd;
        return valorTotal;
    }

    public void adicionarUnidades(int qtd1){
        if(qtd1 > 0){
            qtd += qtd1;
            System.out.println("Quantidade em estoque: " + qtd);
            System.out.println("Produto adicionado!");
        }
    }

    public void removerUnidades(int qtd1){
        if(qtd1 > 0){
            qtd -= qtd1;
            System.out.println("Quantidade em estoque: " + qtd);
            System.out.println("Produto removido!");
        }
    }

}
