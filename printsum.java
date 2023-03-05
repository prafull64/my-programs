import java.util.*;
public class printsum {
    public static void input(){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        output(a, b);
    }
    public static void output(int x, int y){
        int sum= x + y;
        System.out.println(sum);
    }
    public static void main(String args[]){
        input();
    }
}
