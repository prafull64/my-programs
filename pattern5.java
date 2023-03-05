public class pattern5 {
    public static void printPattern1(){
        for(int i=1; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print(' ');
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int l=4; l>=1; l--){
            for(int m=4; m>=l; m--){
                System.out.print(' ');
            }
            for(int n=1; n<=(l*2)-1; n++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        printPattern1();
    }
    
}
