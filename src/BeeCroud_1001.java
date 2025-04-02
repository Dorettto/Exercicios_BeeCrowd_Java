import java.util.Scanner;

public class BeeCroud_1001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, X;
        
        A = entrada.nextInt();
        B = entrada.nextInt();
        X = A+B;
        
        System.out.println("X = "+X);
        entrada.close();
    }
}
