import java.util.Scanner;

public class BeeCrowd_1118 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, opcao = 1, media;
        
        while (opcao == 1){
            nota1 = entrada.nextDouble();
                while (nota1 > 10 || nota1 <0){
                    System.out.println("nota invalida");
                    nota1 = entrada.nextDouble();
                }
                
            nota2 = entrada.nextDouble();
                while (nota2 > 10 || nota2 <0){
                    System.out.println("nota invalida");
                    nota2 = entrada.nextDouble();
                }
            media = (nota1+nota2)/2;
            System.out.printf("media = %.2f\n", media);
            System.out.println("novo calculo (1-sim 2-nao)");
            opcao = entrada.nextDouble();
            
                while (opcao!=2 && opcao!=1){
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = entrada.nextDouble();
                }
        }
        entrada.close();
    }
}
