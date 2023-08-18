import java.util.Scanner;

public class quadradonum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        double quadradonum = Math.pow(num,2);

        System.out.println(quadradonum);
    }
}
