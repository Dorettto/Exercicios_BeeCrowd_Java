import java.util.Scanner;

public class BeeCrowd_1115 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int X = 1, Y = 1;
        
        while(X!=0 || Y!=0){
            X = entrada.nextInt();
            Y = entrada.nextInt();
                if (X>0 && Y>0){
                    System.out.println("primeiro");
                } else if (X>0 && Y<0){
                    System.out.println("quarto");
                } else if (X<0 && Y<0){
                    System.out.println("terceiro");
                } else if (X<0 && Y>0){
                    System.out.println("segundo");
                }
        }
        entrada.close();
    }
}
