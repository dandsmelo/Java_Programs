import java.util.Scanner;

public class ContaCorrente{
    private int numConta;
    private String nomeCliente;
    private int cpf;
    private double saldoConta;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        String nomeCliente = sc.nextLine();

        System.out.println("Número da Conta: ");
        int numConta = sc.nextInt();


        System.out.println("CPF:");
        int cpf = sc.nextInt();

        System.out.println("Saldo da Conta:");
        double saldoConta = sc.nextDouble();

        sc.nextLine();
        
        System.out.print("Número da Conta: " + numConta + "\n" + "Nome do Cliente: " + nomeCliente + "\n" + "CPF: " + cpf + "\n" + "Saldo da Conta: " + saldoConta);

    }

    void depositarSaldo(double valor){
        saldoConta = saldoConta + valor;
    }

    double consultarSaldo(){
        return saldoConta;
    }
}