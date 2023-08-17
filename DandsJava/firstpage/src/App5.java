import java.util.Scanner;

public class App5 {
    public static void main(String args[]){
        int idades[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<=4;i++){
            System.out.print("Digite a "+(i+1)+"ª Idade ");
            idades[i] = sc.nextInt();

        }
        System.out.print("Valores digitados ");
        for (int i=0; i<=4;i++){
                System.out.print(idades[i]+ "\t");
            }
    }
}