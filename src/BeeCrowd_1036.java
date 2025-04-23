import java.util.Scanner;

public class BeeCrowd_1036 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double delta = Math.pow(b, 2) - (4*a*c);
        double x1 = (-b+Math.sqrt(delta))/(2*a);
        double x2 = (-b-Math.sqrt(delta))/(2*a);
        
        if (a != 0 && delta > 0 ){
           
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
            
        } else {
            System.out.println("Impossivel calcular");
        }
        scan.close();
    }

}