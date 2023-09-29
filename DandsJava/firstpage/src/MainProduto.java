public class MainProduto {
    public static void main(String[] args){
        Produto prod = new Produto("Leite",6.00, 10);
        Produto prod2 = new Produto("Farinha",5.00, 15);

        System.out.println("Valor total do estoque: " + prod.cacularTotal());
        prod.adicionarUnidades(10);
        prod2.removerUnidades(5);
    }
}
