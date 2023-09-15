import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double desconto;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Funcionario fun = new Funcionario();

        System.out.println("Nome do Fúmcionário: " + fun.nome);
        System.out.println("Salário Bruto: " + fun.salarioBruto);
        System.out.println("Desconto: " + fun.desconto);
        
    }
}
