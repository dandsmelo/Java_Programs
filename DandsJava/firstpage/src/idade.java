import java.util.Scanner;

public class idade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Meses: ");
        int mes = sc.nextInt();

        System.out.println("Dias: ");
        int dias = sc.nextInt();

        int idadedias = idade*365 + mes * 30 + dias;

        System.out.println("Sua idade em dias é: " + idadedias);

    }
}
