import java.util.Scanner;

public class BeeCrowd_1060 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contagem=0;
        double valor;
        for (int i = 0; i < 6; i++){
            valor = scan.nextDouble();
            if (valor>=0){
                contagem += 1;
            }
        }
        System.out.println(contagem+" valores positivos");
        scan.close();
    }
}
