import java.util.Scanner;

public class BeeCrowd_1075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        N = scan.nextInt();

        for (int i = 1; i < 10001; i++){
            if (i%N == 2){
                System.out.println(i);
            }
        }
        scan.close();
    }
}
