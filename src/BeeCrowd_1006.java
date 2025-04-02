import java.util.Scanner;

public class BeeCrowd_1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, C, media;
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        
        media = ((A*2)+(B*3)+(C*5))/10;
        System.out.printf("MEDIA = %.1f\n", media);
        entrada.close();
    }
}
