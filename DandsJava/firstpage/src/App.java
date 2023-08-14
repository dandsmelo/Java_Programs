import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
            System.out.print("Digite um nome ");
        String nome = sc.nextLine();
        System.out.print("Hello " + nome + "!");

    }
}
