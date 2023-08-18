import java.util.Scanner;

public class prestacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da sua compra: ");
        double preco = sc.nextDouble();

        System.out.println("Digite o valor da taxa: ");
        double taxa = sc.nextDouble();

        System.out.println("Digite em dias o tempo de atraso da prestação: ");
        int temp = sc.nextInt();

        double prestacao = preco + preco*(taxa/100) * temp;

        System.out.println("O valor da sua prestação em atraso é de: " + prestacao);
    }
}
