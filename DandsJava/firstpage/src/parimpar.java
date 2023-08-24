import java.util.Scanner;

public class parimpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.print("É um número par");
        }else{
            System.out.print("É um número ímpar");
        }
    }
}
