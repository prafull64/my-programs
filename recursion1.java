public class recursion1 {
    public static void rec(int n){
        if(n==5){
            System.out.println("stop");
        }else{
            System.out.println("hi");
            n--;
            rec(n);
        }
    }
    public static void main(String args[]){
        rec(10);
    }
}
