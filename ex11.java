import java.util.Scanner;
class Ex11{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("enter radius");
        double radius= input.nextInt();

        System.out.println("perimeter is: "+(2*3.14*radius));
        System.out.println("area is: "+(3.14*radius*radius));
    }
}