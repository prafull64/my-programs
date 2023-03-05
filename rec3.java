public class rec3 {//incomplete
    public static void rec(int i, int j){
        int k=1;
        if(k==1){
             System.out.println(i);
        }
        if(k==10){
            System.out.println("stop");
        }else{
            System.out.println(j);
            k++;
            int sum=i+j;
            rec(j, sum);
        }
    }
    public static void main(String args[]){
        rec(1,2);
    }
}
