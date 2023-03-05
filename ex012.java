import java.util.Scanner;

class Ex012{
    public static void main(String[] args){
         Scanner input= new Scanner(System.in);

         double sum=0;
         double avg;
         System.out.println("enter no of elements");
         double numberOfElements= input.nextInt();

         for(int loop=1; loop<=numberOfElements; loop++){
            System.out.println("enter number: ");
            sum += input.nextInt();
         }

         avg= sum/numberOfElements;
         System.out.println("average is: "+avg);
    }
}