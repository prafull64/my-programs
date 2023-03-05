import java.util.Scanner;

class Pn{

    public static void pn1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no");
        int num= sc.nextInt();

        for(int i=1; i<=num/2; i++){
            if(num%i!=0){
                System.out.println("number is prime");
            }else{
                System.out.println("number is not prime");
                break;
            }
        }
    }
    public static void main(String[] args){
        pn1();
    }
}