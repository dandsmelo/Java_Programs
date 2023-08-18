import java.util.Scanner;

public class volume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        double volume = 3.14159 * Math.pow(raio, 2) * altura;

        System.out.println("O volume da lata de óleo é: " + volume);

    }
}
