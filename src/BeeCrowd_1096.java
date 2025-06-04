public class BeeCrowd_1096 {
    public static void main(String[] args) {
        int I=1, J=7;
        System.out.print("I="+I+" J="+J+"\n");
        
        for(int i=0; i<14; i++){
            if(J==5){
                I = I+2;
                J = 7;
                System.out.print("I="+I+" J="+J+"\n");
            } else{
                J -= 1;
                System.out.print("I="+I+" J="+J+"\n");
            }
        }
    }
}
