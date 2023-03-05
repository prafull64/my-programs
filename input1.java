import java.util.Scanner;
public class input1 {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("enter no.1");
        int a= sc.nextInt();

        System.out.println("enter 2nd no.");
        int b= sc.nextInt();

        int sum= a+b;
        System.out.println("sum is:"+ sum);
    }
    
}
