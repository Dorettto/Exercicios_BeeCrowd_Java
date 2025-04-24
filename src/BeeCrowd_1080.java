import java.util.Scanner;

public class BeeCrowd_1080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, auxiliar = 0;
        int posicao = 0;
        
        for (int i=1; i<101; i++){
            N = scan.nextInt();
            if (N>auxiliar){
                    auxiliar = N;
                    posicao = i;
            }
        }
        System.out.println(auxiliar);
        System.out.println(posicao);
        
        scan.close();
    }
}
