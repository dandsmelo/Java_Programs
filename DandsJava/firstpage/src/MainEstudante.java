public class MainEstudante {
    public static void main(String[] args){
        Estudante est1 = new Estudante("Ana Laura", 15, 8.5);
        Estudante est2 = new Estudante("Roberto", 16, 6.0);

        est1.verificarMedia();
        System.out.println(est1.toString());

        est2.verificarMedia();
        System.out.println(est2.toString());

    }
}
