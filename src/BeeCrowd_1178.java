import java.util.Scanner;

public class BeeCrowd_1178 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            double [] conjunto = new double[101];
            int X = scan.nextInt();
            conjunto[0] = X;
            System.out.printf("N[0] = %.4f\n", conjunto[0]);

            for(int i = 1; i<101; i++){
            X = X/2;
            conjunto[i]=X;
            System.out.printf("N["+i+"] = %.4f\n", conjunto[i]);
            }    
        scan.close();
    }
}
