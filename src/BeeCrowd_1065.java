import java.util.Scanner;

public class BeeCrowd_1065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int A, B, C, D, E, soma = 0;
            A = scan.nextInt();
            B = scan.nextInt();
            C = scan.nextInt();
            D = scan.nextInt();
            E = scan.nextInt();

            if (A%2 == 0) {
                soma += 1;
            }
            if (B%2 == 0) {
                soma += 1;
            }
            if (C%2 == 0) {
                soma += 1;
            }
            if (D%2 == 0) {
                soma += 1;
            }
            if (E%2 == 0) {
                soma += 1;
            }

            System.out.println(soma+" valores pares");
        scan.close();
    }
}