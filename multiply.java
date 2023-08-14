import java.util.Scanner;

public class multiply {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the first number ");
        double n1 = sc.nextDouble();

        System.out.println("Write the second number ");
        double n2 = sc.nextDouble();

        System.out.println(n1*n2);
    }
}
