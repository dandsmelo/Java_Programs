import java.util.Scanner;

public class ArrayABFatorial {
    public static void main(String[] args){
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<vetorA.length;i++){
            System.out.print("Digite um número: ");
            vetorA[i] = sc.nextInt();
        }

        for(int i = 0;i<vetorA.length;i++){
            vetorB[i] = calcularFatorial(vetorA[i]);
        }

        System.out.print("Vetor A: ");
        for(int i = 0; i<vetorA.length;i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for(int i = 0; i<vetorB.length;i++){
            System.out.print(vetorB[i] + " ");
        }

    }

    public static int calcularFatorial(int n){
        int fat = 1;
        for(int i = 2; i<=n;i++){
            fat *= i;
        }
        return fat;
    }
}
//Criar um vetor A do tipo inteiro de 5 elementos–	Solicitar os valores para o usuário e inserir no vetor A–	Criar um vetor B do tipo inteiro  –	Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B–	Após de todos os elementos do vetor A, mostrar os dois vetores