public class App2 {
    public static void main(String[] args) {
        char letra = 'a';
        String texto = "DSM";

        byte x = (byte)127;
        Integer w = 3;
        byte b = w.byteValue();
        byte y = (byte) (x+b);
        System.out.println(x);
        System.out.println(y);

        System.out.println(letra);
        System.out.printf("%c\n", (letra+1));
        System.out.println(texto);
    }
}
