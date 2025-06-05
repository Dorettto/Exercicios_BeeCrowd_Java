import java.util.Scanner;

public class BeeCrowd_2867 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int C = scan.nextInt();
            int N, M, potencia;

            for(int i=0; i<C; i++){
                N = scan.nextInt();
                M = scan.nextInt();
                potencia = (int)(Math.log10(Math.pow(N, M)) + 1);
                System.out.println(potencia);
            }
        scan.close();
    }
}
