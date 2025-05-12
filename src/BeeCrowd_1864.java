import java.util.Scanner;

public class BeeCrowd_1864 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int N = entrada.nextInt();
        char[] linha = {'L','I','F','E',' ','I','S',' ','N','O','T',' ','A',' ','P','R','O','B','L','E','M',' ','T','O',' ','B','E',' ','S','O','L','V','E','D'};
        for (int i = 0; i < N; i++){
            System.out.print(linha[i]);
        }
        System.out.println("");
        entrada.close();
    }
}
