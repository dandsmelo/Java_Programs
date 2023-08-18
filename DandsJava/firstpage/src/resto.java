import java.util.Scanner;

public class resto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        int resto = num % 6;

        System.out.println(resto);
    }
}
