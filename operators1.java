import java.util.Scanner;

public class operators1 {
    public static void main(String args[]){

        //assignment operators
        Scanner sc= new Scanner(System.in);

        System.out.println("enter num1");
        int num1= sc.nextInt();
        System.out.println("enter num2");
        int num2= sc.nextInt();
        
        System.out.println("no.1 "+ num1);
        System.out.println("num2 "+ num2);

        num2= num1;

        System.out.println("num2 "+num2);

        /* += operator */
        System.out.println("enter no3");
        int num3= sc.nextInt();
        System.out.println("enter num4");
        int num4= sc.nextInt();

        num3 += num4;

        System.out.println("num3 "+ num3);

        num3-=num4;
        System.out.println("num3 -= ="+num3);

        num3*= num4;
        System.out.println("num3 after *= ="+ num3);

        num3/= num4;
        System.out.println("num3 after /="+ num3);

        num3%= num4;
        System.out.println("sum3 after %/ ="+ num3);
        
    }
    
}
