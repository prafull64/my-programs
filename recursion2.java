public class recursion2 {
    public static void rec(int n){
        int m= 3;
        int sum;
        sum= n+ m;
        if(sum>=50){
            System.out.println("stop");
        }else{
            System.out.println(sum);
            rec(sum);
        }
    } 
    public static void main(String args[]){
        rec(2);
    }
}
