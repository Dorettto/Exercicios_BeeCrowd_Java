public class BeeCrowd_1156 {
    public static void main(String[] args) {
        double S = 1, divisor=3, dividendo=2;
        while(divisor<=40){
            S = S+(divisor/dividendo);
            divisor = divisor+2;
            dividendo = dividendo*2;
        }
        System.out.printf("%.2f\n",S);
    }
}
