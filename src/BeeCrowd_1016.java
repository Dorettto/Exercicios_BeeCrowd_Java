import java.util.Scanner;

public class BeeCrowd_1016 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int velocidade, tempo;
        velocidade = entrada.nextInt();
        
        tempo = velocidade*2;
        System.out.printf("%d minutos\n", tempo);
        
        entrada.close();
    }
}
