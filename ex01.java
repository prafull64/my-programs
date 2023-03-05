import java.util.Scanner;
class Ex01{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter your 1st name");
        String fname = input.next();
        System.out.println("Enter your last name");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello\n"+fname+" "+lname);
    }
}