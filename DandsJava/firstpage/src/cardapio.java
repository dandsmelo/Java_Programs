import java.util.Scanner;

public class cardapio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do seu produto: ");
        int cod = sc.nextInt();

        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();

        double preco=0;

        if(cod==100){
            preco = 1.20;
        } else if(cod==101){
            preco = 1.30;
        } else if(cod==102){
            preco = 1.50;
        }else if(cod==103){
            preco = 1.20;
        }else if(cod==104){
            preco = 1.30;
        }else if(cod==105){
            preco = 1.00;
        }

        double vf = qtd * preco;
        System.out.print("Valor final: R$" + vf);

    }
    
}
