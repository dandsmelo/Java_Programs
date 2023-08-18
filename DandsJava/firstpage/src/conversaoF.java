import java.util.Scanner;

public class conversaoF {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        int tempF = sc.nextInt();

        int tempC = (tempF - 32) * 5/9;

        System.out.println("O resultado da conversão de Fahrenheit para Celsius é: " + tempC + "°C");
    }
}
