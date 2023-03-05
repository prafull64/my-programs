import java.util.Scanner;

class C1{
    public static void printFebonacci(int num, int num1, int num2){
        if (num==0){
            return;
        }
        
        int num3;
        num3= num1+num2;

        System.out.print(" "+num3);
        
        num1=num2;
        num2=num3;

        printFebonacci(num-1, num2, num3);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter no.");
        int num=sc.nextInt();

        int num1=0;
        int num2=1;

        System.out.print("0 1 ");
        printFebonacci(num-2, num1, num2);
    }
}