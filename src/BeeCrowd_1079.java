import java.util.Scanner;

public class BeeCrowd_1079 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            double soma = 0.0, media = 0.0;

            for(int i = 0; i < N; i++){
                for(int j = 0; j <3; j++){
                    soma += scan.nextDouble();
                }
                media = soma/3;
                System.out.printf("%.1f\n",media);
                soma = 0.0;
                media = 0.0;
            }

        scan.close();
    }
}
