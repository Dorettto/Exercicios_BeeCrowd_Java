import java.util.Scanner;

public class BeeCrowd_1117 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

            double N1 = scan.nextDouble();       
            while (N1<0 || N1>10){
                System.out.println("nota invalida");
                    N1 = scan.nextDouble();
            }

            double N2 = scan.nextDouble();
            while (N2<0 || N2>10){
                System.out.println("nota invalida");
                    N2 = scan.nextDouble();
            }

            double media;
            media = (N1+N2)/2;

            System.out.printf("media = %.2f\n", media);

        scan.close();
    }
}