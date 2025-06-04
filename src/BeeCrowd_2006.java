import java.util.Scanner;

public class BeeCrowd_2006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int T = scan.nextInt();
            int [] chute = new int[5];
            int acertos = 0;

            for (int i = 0; i<chute.length; i++){
                chute[i] = scan.nextInt();
                if (chute[i] == T){
                    acertos += 1;
                }
            }
            System.out.println(acertos);
            
        scan.close();
    }
}
