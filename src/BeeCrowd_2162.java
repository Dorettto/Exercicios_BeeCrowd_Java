import java.util.Scanner;

public class BeeCrowd_2162 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int H [] = new int[N];
            int padrao = 0;

            for(int i=0; i<N; i++){
                H[i] = scan.nextInt();
            }
            if(N>2){
                for (int i=2; i<N; i++){
                    if ((H[i-2] > H[i-1] && H[i-1] < H[i]) || (H[i-2] < H[i-1] && H[i-1] > H[i])) {
	    			padrao = 1;
	    		} else {
	    			padrao = 0;
	    		}
                }
            } else { 
    		if (H[0] != H[1]) padrao = 1;
    	}
        System.out.println(padrao);
        scan.close();
    }
}
