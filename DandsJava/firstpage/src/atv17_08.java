import java.util.Scanner;

public class atv17_08 {
    public static void main(String args[]){
        String nome[] = new String[5];
        int idade[] = new int[5];
        double estatura[] = new double[5];
        double peso[] = new double[5];
        double imc[] = new double[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<=4;i++){
            System.out.println("Digite o seu nome: ");
            nome[i] = sc.nextLine();
            System.out.println("Digite a sua idade: ");
            idade[i]=sc.nextInt();
            System.out.println("Digite sua estatura:");
            estatura[i]=sc.nextDouble();
            System.out.println("Digite seu peso: ");
            peso[i]=sc.nextDouble();

            imc[i] = peso[i]/(estatura[i] * estatura[i]);
            
            sc.nextLine();
        }

        for(int i=0;i<=4;i++){
            System.out.print("Nome: " + nome[i] +"\t" + "Idade: " + idade[i] + "\t" + "Estatura: " + estatura[i] + "\t" + "Peso" + peso[i] + "\n" + "Imc: " + imc[i] + "\n" );
        }
    }
}
