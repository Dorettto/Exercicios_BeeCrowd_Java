import java.util.Scanner;

public class BeeCrowd_1066 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int A, B, C, D, E, somaPar = 0, somaImpar = 0, negativos = 0, positivos = 0;
            A = scan.nextInt();
            B = scan.nextInt();
            C = scan.nextInt();
            D = scan.nextInt();
            E = scan.nextInt();

            if (A%2 == 0) {
                somaPar += 1;
            } else {
                somaImpar += 1;
            }
            if (B%2 == 0) {
                somaPar += 1;
            } else {
                somaImpar += 1;
            }
            if (C%2 == 0) {
                somaPar += 1;
            } else {
                somaImpar += 1;
            }
            if (D%2 == 0) {
                somaPar += 1;
            } else {
                somaImpar += 1;
            }
            if (E%2 == 0) {
                somaPar += 1;
            } else {
                somaImpar += 1;
            }

        //--------------------------------------------------

            if (A>0){
                positivos += 1;
            } else if (A<0){
                negativos += 1;
            }
            if (B>0){
                positivos += 1;
            } else if (B<0){
                negativos += 1;
            }
            if (C>0){
                positivos += 1;
            } else if (C<0){
                negativos += 1;
            }
            if (D>0){
                positivos += 1;
            } else if (D<0){
                negativos += 1;
            }
            if (E>0){
                positivos += 1;
            } else if (E<0){
                negativos += 1;
            }

            System.out.println(somaPar+" valor(es) par(es)");
            System.out.println(somaImpar+" valor(es) impar(es)");
            System.out.println(positivos+" valor(es) positivo(s)");
            System.out.println(negativos+" valor(es) negativo(s)");
        scan.close();
    }
}
