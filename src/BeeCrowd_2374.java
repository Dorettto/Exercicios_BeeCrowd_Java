import java.util.Scanner;

public class BeeCrowd_2374 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
            int N = scan.nextInt();
            int M = scan.nextInt();
            int saida = calculaSaida(N,M);
            System.out.println(saida);

        scan.close();
    }
    public static int calculaSaida(int N, int M){
        int saida = N-M;
        return saida;
    }
}
