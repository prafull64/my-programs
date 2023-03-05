import java.util.Scanner;
class Up{

    public static void Up1(){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter number");
        int num= sc.nextInt();
       
        if(num%2==0){
            System.out.print("even");
        }else{
            System.out.print("odd");
        }
    }

    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n= sc.nextInt();
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.print(fact);
    }
    public static void main(String[] args){
        Up1();
        factorial();
       
    }
}