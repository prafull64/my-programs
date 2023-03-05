class B1{
    public static void recurslion1(int var){
        if (var==0){
            return;
        }
        System.out.println("hello");
        recursion1(var-1);
    }
    public static void main(String[] args){
        int a=5;
        recursion1(a);
    }
}