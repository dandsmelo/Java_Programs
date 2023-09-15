import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double desconto;

    public Funcionario(String nome, double salarioBruto, double desconto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.desconto = desconto;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Fúmcionário: ");
        String nome = sc.nextLine();

        System.out.println("Salário Bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.println("Desconto: ");
        double desconto = sc.nextDouble();
        
        Funcionario f = new Funcionario(nome, salarioBruto, desconto);

        f.mostrarDados();

        System.out.print("\nDigite a porcentagem de aumento do salário: ");
        double percentualAumento = sc.nextDouble();

        f.aumentarSalario(percentualAumento);

        System.out.println("\nDados do funcionário com aumento:");
        f.mostrarDados();

    }
    private double calcularSalarioLiquido() {
        return salarioBruto - desconto;
    }
    private void aumentarSalario(double percentualAumento) {
        salarioBruto *= (1 + percentualAumento / 100);
    }
    public void mostrarDados() {
        double salarioLiquido = calcularSalarioLiquido();
        System.out.println("Dados do funcionário:");
        System.out.println("Nome: " + nome);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }

}
