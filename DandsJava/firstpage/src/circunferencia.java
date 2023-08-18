import java.util.Scanner;

public class circunferencia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double C = 2 * 3.14 * raio;

        System.out.println("O valor da área da circunferência é: " + C);

    }
}
