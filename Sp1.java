
class Sp1{
    public static void sp1(){
        int a=1;
        int d=3;
        for (int i=0; i<=5; i++){
            System.out.print((a+d*i)+" ");

        }
        System.out.println();
    }
/////////////////////////////////////////////////////
    public static void sp2(){
        int a=5;
        int d=2;
        for (int i=0; i<=5; i++){
            System.out.print((a*d)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
       sp1();
       sp2();
       sp3();
    }
}