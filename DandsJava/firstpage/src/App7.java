public class App7 {
    public static void main(String arg[]){
        boolean p[]={true, true, false, false};
        boolean q[]={true, false, true, false};
        for(int i=0;i<p.length;i++){
            System.out.println(p[i]|!q[i]);
        }
    }
}
