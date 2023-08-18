import java.util.Scanner;

public class temperatura {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");

        int temp = sc.nextInt();

        int tempF = (9 * temp + 160)/5;

        System.out.println("A temperatura em graus Fahrenheit é: " + tempF + "°F");

    }
}
