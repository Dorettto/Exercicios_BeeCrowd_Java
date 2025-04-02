import java.util.Scanner;

public class BeeCrowd_1038 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo, quantidade;
        double total;
        codigo = entrada.nextInt();
        quantidade = entrada.nextInt();
        
        switch(codigo){
            case 1 -> {
                total = quantidade*4.00;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            case 2 -> {
                total = quantidade*4.50;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            case 3 -> {
                total = quantidade*5.00;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            case 4 -> {
                total = quantidade*2.00;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            case 5 -> {
                total = quantidade*1.50;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            
        }
        
        entrada.close();
    }
}
