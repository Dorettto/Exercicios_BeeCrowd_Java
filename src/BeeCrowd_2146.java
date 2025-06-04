import java.util.Scanner;

public class BeeCrowd_2146 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNextInt()) {
            int N = scan.nextInt();
            System.out.println(N-1);
        }
            
        scan.close();
    }
}
