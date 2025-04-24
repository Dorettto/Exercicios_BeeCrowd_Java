import java.util.Scanner;

public class BeeCrowd_1070 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = 0;
        X = scan.nextInt();

        for (int i = 0; i < 6; i++){
            if (X%2 != 0){
                System.out.println(X);
            } else {
                i--;
            }
        X += 1;
        }

        scan.close();
    }
}
