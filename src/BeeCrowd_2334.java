import java.util.Scanner;

public class BeeCrowd_2334 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int P = scan.nextInt();
            while(P>=0){
                if (P == 0){
                    System.out.println(P);
                    P = scan.nextInt();
                }else{
                System.out.println(P-1);
                P = scan.nextInt();
                }
            }
        scan.close();
    }
}
