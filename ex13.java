import java.util.Scanner;

class Ex13{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter length: ");
        int length= sc.nextInt();

        System.out.println("enter breadth");
        int breadth= sc.nextInt();

        System.out.println("perimeter is: "+2*(length+breadth));
        System.out.println("area is: "+length*breadth);
    }
}