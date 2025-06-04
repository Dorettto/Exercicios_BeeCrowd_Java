import java.util.Scanner;

public class BeeCrowd_1178 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            double [] conjunto = new double[101];
            double X = scan.nextDouble();
            conjunto[0] = X;

            for(int i=0; i<100; i++){
                conjunto[i+1] = conjunto[i]/2;
            }

            for(int j=0; j<100; j++){
                System.out.printf("N["+j+"] = %.4f\n", conjunto[j]);
            }
        scan.close();
    }
}
