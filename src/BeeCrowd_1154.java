import java.util.Scanner;

public class BeeCrowd_1154 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            double N = scan.nextDouble();
            double soma = 0, vezes = 0, total;
            while (N>0) {
                soma += N;
                vezes += 1;
                N = scan.nextDouble();
            }
            total = soma/vezes;
        System.out.printf("%.2f\n", total);

        scan.close();
    }
}
