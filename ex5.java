import java.util.Scanner;

class Ex5{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("1st num");
        int num1= input.nextInt();

        System.out.println("2nd num");
        int num2= input.nextInt();

        int product= num1*num2;
        System.out.println("product="+product);
    }
}