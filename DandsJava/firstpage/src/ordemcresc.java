import java.util.Scanner;

public class ordemcresc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if (num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
            if (num2>num3){
                temp = num2;
                num2 = num3;
                num3 = temp;
                if(num1 > num2){
                    temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
            }
        } else if(num2 > num3){
            int temp = num2;
            num2 = num3;
            num3 = temp;
            if(num1 > num2){
                temp = num1;
                num1 = num2;
                num2 = temp;
        }
        }else if(num1 > num3){
            int temp = num1;
            num1 = num3;
            num3 = temp;
            if(num1 > num2){
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }
        System.out.print(num1 + " " + num2 + " "+ num3);
    }
}
