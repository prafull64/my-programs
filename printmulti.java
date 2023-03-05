import java.util.*;
public class printmulti {
    public static void inputOutput(){
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        int product= multi(num1, num2);
        System.out.println(product);
    }
    public static int multi(int x, int y){
        return x * y;
    }
    public static void main(String args[]){
        inputOutput();
    }
}
