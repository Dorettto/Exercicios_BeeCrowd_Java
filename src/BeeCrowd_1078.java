import java.util.Scanner;

public class BeeCrowd_1078 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        numero = entrada.nextInt();
        
        System.out.println("1 x "+numero+" = "+numero);
        System.out.println("2 x "+numero+" = "+numero*2);
        System.out.println("3 x "+numero+" = "+numero*3);
        System.out.println("4 x "+numero+" = "+numero*4);
        System.out.println("5 x "+numero+" = "+numero*5);
        System.out.println("6 x "+numero+" = "+numero*6);
        System.out.println("7 x "+numero+" = "+numero*7);
        System.out.println("8 x "+numero+" = "+numero*8);
        System.out.println("9 x "+numero+" = "+numero*9);
        System.out.println("10 x "+numero+" = "+numero*10);
        entrada.close();
    }
}
