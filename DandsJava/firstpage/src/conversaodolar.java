import java.util.Scanner;

public class conversaodolar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double valor = sc.nextDouble();

        System.out.println("Digite o valor da cotação: ");
        double cota = sc.nextDouble();

        double vr = valor * cota;
        System.out.println("R$" + vr);
    }
}
