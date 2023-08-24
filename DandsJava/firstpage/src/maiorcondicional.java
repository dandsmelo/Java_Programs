import java.util.Scanner;

public class maiorcondicional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.print("O maior número é o primeiro:" + num1);
            }else if(num3>num2){
                System.out.print("O maior número é o terceiro: " + num3);
            }
        }else if(num2>num3){
            System.out.print("O maior número é o segundo:" + num2);
        }else if(num3>num1){
            System.out.print("O maior número é o terceiro: " + num3);
        }

    }
}
