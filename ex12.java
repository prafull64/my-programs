import java.util.Scanner;

class Ex12{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("enter number 1:");
        int num1= input.nextInt();

        System.out.println("enter number 2:");
        int num2= input.nextInt();

        System.out.println("enter number 3:");
        int num3= input.nextInt();

        int average= (num1+num2+num3)/3;

        System.out.println("average is: "+average);
    }
}