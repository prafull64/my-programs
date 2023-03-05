public class pattern4 {
    public static void printPattern(){
        for(int i=1; i<=5; i++){
            for(int j=5-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        printPattern();
    }
}
