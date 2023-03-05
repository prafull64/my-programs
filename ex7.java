import java.util.Scanner;

class Ex7{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("enter number");
        int number= input.nextInt();

        for(int loop=1;loop<=10;loop++){
            System.out.println(number+"*"+loop+"="+number*loop);
        }
    }
}