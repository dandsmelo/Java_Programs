import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/4;

        if(media>=7){
            System.out.print("Você foi aprovado com média " + media);
        } else{
            System.out.print("Você foi reprovado com média " + media);
        }
    }
}
