import java.util.Scanner;

public class BeeCrowd_1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            double A, B, C;
            A = scan.nextDouble();
            B = scan.nextDouble();
            C = scan.nextDouble();
                if (A>=(B+C)){
                    System.out.println("NAO FORMA TRIANGULO");
                    if (A==B && B==C){
                    System.out.println("TRIANGULO EQUILATERO");
                } else if ((A==B && B!=C) || (A==C && A!=B)){
                    System.out.println("TRIANGULO ISOCELES");
                }
                } else if (Math.pow(A,2)==(Math.pow(B,2)+Math.pow(C,2))) {
                    System.out.println("TRIANGULO RETANGULO");
                    if (A==B && B==C){
                    System.out.println("TRIANGULO EQUILATERO");
                } else if ((A==B && B!=C) || (A==C && A!=B)){
                    System.out.println("TRIANGULO ISOCELES");
                }
                } else if (Math.pow(A,2)>(Math.pow(B,2)+Math.pow(C,2))){
                    System.out.println("TRIANGULO OBTUSANGULO");
                    if (A==B && B==C){
                    System.out.println("TRIANGULO EQUILATERO");
                } else if ((A==B && B!=C) || (A==C && A!=B)){
                    System.out.println("TRIANGULO ISOCELES");
                }
                } else if (Math.pow(A,2)<(Math.pow(B,2)+Math.pow(C,2))){
                    System.out.println("TRIANGULO ACUTANCULO");
                    if (A==B && B==C){
                    System.out.println("TRIANGULO EQUILATERO");
                } else if ((A==B && B!=C) || (A==C && A!=B)){
                    System.out.println("TRIANGULO ISOCELES");
                }
                } 
        scan.close();
    }
}
