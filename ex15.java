import java.util.Scanner;

class Ex15{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter no 1: ");
        int num1= sc.nextInt();

        System.out.println("enter no.2: ");
        int num2= sc.nextInt();

        int num3= num1;
        num1= num2;
        num2= num3;

        System.out.println("num1= "+num1+"\nnum2= "+num2);
    }


}