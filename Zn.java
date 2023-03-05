//largest number
import java.util.Scanner;

class Zn{

    public static void largestNumber(){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter number");
        int n= sc.nextInt();

        int a[];
        a[i] = new int[n];

        System.out.println("enter numbers");

        for (int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        int max = 0;
        for (i=0; i<n; i++){
            if(a[i]>max){
                max=a[i];
            }
            System.out.println("max= "+max);
        }
    }

    public static void main(String[] args){
        largestNumber();
    }
}