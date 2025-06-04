import java.util.Scanner;

public class BeeCrowd_1099 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int soma = 0;
            int [] numeros = new int[2];

            for (int j=0; j<N; j++){
                for(int i=0; i<numeros.length; i++){
                    soma=0;
                    numeros[i] = scan.nextInt();
                    }

                    if(numeros[0]>numeros[1]){
                        for(int k=numeros[1]+1; k<numeros[0]; k++){
                            if (k%2!=0){
                                soma += k;
                            }
                        }
                        System.out.println(soma);
                    }else{
                        for(int k=numeros[0]+1; k<numeros[1]; k++){
                            if (k%2!=0){
                                soma += k;
                            }
                        }
                        System.out.println(soma);
                    }
            }
            scan.close();
            }
    }
