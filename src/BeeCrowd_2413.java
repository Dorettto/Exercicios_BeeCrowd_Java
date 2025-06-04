import java.util.Scanner;

public class BeeCrowd_2413 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int T = scan.nextInt();
            int saida = calculaSaida(T);

            System.out.println(saida);
        scan.close();

    }
    public static int calculaSaida(int T){
        int saida = (T*2)*2;
        return saida;
    }
}
