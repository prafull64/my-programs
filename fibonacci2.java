
class Fibonacci2{
    static int num1=0, num2=1, num3;
    void fibonacci(int count){
        if(count>0){
            num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;
            fibonacci(count-1);
        }
       
    }
    public static void main(String[] args){
        int count=10;
        System.out.print(num1+" "+num2+" ");
        fibonacci(count-2);
    }
}