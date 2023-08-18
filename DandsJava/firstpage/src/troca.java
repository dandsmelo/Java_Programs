import java.util.Scanner;

public class troca {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor de A: ");
        int A = sc.nextInt();

        System.out.println("Digite um valor para B: ");
        int B = sc.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valor de A: " + A + "\n" + "Valor de B: " + B);
    }
}
