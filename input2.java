import java.util.Scanner;

public class input2 {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("enter 1st no.");
        int a= sc.nextInt();

        System.out.println("enter no. 2");
        int b= sc.nextInt();

        int multi=a*b;
        System.out.println("multiplication is "+multi);
    }    
}
