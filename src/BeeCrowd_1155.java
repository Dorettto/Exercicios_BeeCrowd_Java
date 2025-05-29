public class BeeCrowd_1155 {
    public static void main(String[] args) {
        double S = 1, i = 2;
        while(i<=100){
            S = S+(1/i);
            i+=1;
        }
        System.out.printf("%.2f\n",S);
    }
}
