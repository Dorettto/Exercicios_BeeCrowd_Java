import java.util.Scanner;

public class BeeCrowd_1064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contagem=0;
        double valor, media = 0;
        for (int i = 0; i < 6; i++){
            valor = scan.nextDouble();
            if (valor>=0){
                contagem += 1;
                media += valor;
            }
        }
        media = media/contagem;
        System.out.println(contagem+" valores positivos");
        System.out.printf("%.1f\n",media);
        scan.close();
    }
}
