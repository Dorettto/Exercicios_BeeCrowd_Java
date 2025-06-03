import java.util.Scanner;

public class BeeCrowd_1177 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int T = scan.nextInt();
            int[] N = new int[1000];

            int saida = 0;
            for(int i=0; i<1000; i++){

                if (saida == T){
                    saida = 0;
                }

                N[i] = saida;
                saida = saida + 1;
                
                System.out.println("N["+i+"] = "+N[i]);
            }
        scan.close();
    }
}
