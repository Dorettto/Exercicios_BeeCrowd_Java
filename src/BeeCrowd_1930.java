import java.util.Scanner;

public class BeeCrowd_1930 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int [] tomadas = new int[4];
            int disponiveis = 0;
            for(int i = 0; i<4; i++){
                tomadas[i] = scan.nextInt();
                disponiveis += tomadas[i];
            }
            System.out.println(disponiveis-3);

        scan.close();
    }
}
