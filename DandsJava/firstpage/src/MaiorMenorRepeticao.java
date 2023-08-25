import java.util.Scanner;

public class MaiorMenorRepeticao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int maiorNum = Integer.MIN_VALUE;
        int menorNum = Integer.MAX_VALUE;

        for(int i=0;i<5;i++){
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if(num > maiorNum){
                maiorNum = num;
            }

            if(num < menorNum){
                menorNum = num;
            }

        }
        System.out.print("O maior número é: " + maiorNum + "\n");
        System.out.print("O menor número é: " + menorNum);
        
    }
}
