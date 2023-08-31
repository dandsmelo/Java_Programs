import java.util.Scanner;

public class ArrayNotas {
    public static void main(String[] args){
        double[] notas1 = new double[5];
        double[] notas2 = new double[5];

        adicionarNotas(notas1, notas2);

        System.out.println("Médias: ");
        for(int i = 0;i<notas1.length;i++){
            double media = (notas1[i] + notas2[i])/2;
            System.out.print("Aluno " + (i + 1) + "\n" + "Média: " + media + "\n" + "--------" + "\n");
        }

    }

    public static void adicionarNotas(double[] notas1, double[] notas2){
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<notas1.length;i++){
            System.out.println("Aluno " + (i + 1));
            System.out.print("Nota da primeira prova: ");
            notas1[i] = sc.nextDouble();

            System.out.print("Nota da segunda prova: ");
            notas2[i] = sc.nextDouble();
        }
        
    }
}
//Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos. Armazenar as notas da primeira e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno.