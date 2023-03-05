import java.util.concurrent.CountDownLatch;

class Pt2{
    public static void pt1(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pt2(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt3(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt4(){
        for (int i=5; i>=1; i--){
            for (int j=5; j>=1; j--){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }    

    public static void pt5(){
        for (int i=5; i>=1; i--){
            for (int j=5; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt6(){
        int a=1;
        for (int i=5; i>=1; i--){
            for (int j=5; j>=1; j--){
                if(a<10){
                    System.out.print(a+" ");
                }else{
                    System.out.print(a);
                }
                a++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt7(){
        int a=1;
        for (int i=5; i>=1; i--){
            for (int j=5; j>=1; j--){
                if(a<10){
                    System.out.print(a+" ");
                }else{
                    System.out.print(a);
                }
                a=a+2;;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt8(){
        int a=2;
        for (int i=5; i>=1; i--){
            for (int j=5; j>=1; j--){
                if(a<10){
                    System.out.print(a+" ");
                }else{
                    System.out.print(a);
                }
                a=a+2;;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt9(){
        int a=1;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                if(i*j<10){
                    System.out.print(" ");
                }
                System.out.print(i*j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt10(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=3; j++){
                System.out.print(j+" "+i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt11(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=3; j++){
                System.out.print(i+" "+j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt12(){
        int num=5;
        int a;

        for (int i=1; i<=5; i++){
            a=i;
            for (int j=1; j<=5; j++){
                System.out.print(a+" ");
                a=a+num;
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////
    public static void pt13(){
        int n=5;
        int num1;
        int num2;
        for (int i=1; i<=n; i++) {
            num1=i;
            num2=n-i+1;
            for (int j=1; j<=n;j++) {
                if(j%2==1){
                    System.out.print(num1+"  ");
                }else{
                    System.out.print(num2+"  ");
                }
                num1=num1+n;
                num2=num2+n;
            }
            System.out.println();
        }
    }

    public static void pt14(){
        int n=5;
        int x;
        for (int i=1; i<=5; i++){
            x=n-i+1;
            for (int j=1; j<=5; j++){
                System.out.print(x+" ");
                x=x+n;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt15(){
        int x=5;
        int y=6;
        for (int i=1; i<=5; i++){
          x=5-i+1;
          y=6+i-1;
            for (int j=1; j<=5; j++){
                if(j%2==1){
                    System.out.print(x+" ");
                    x=x+10;
                }else{
                    System.out.print(y+" ");
                    y=y+10;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt16(){
        int x;
        for(int i=1; i<=5; i++){
            x=i;
            for(int j=1; j<=5; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt17(){
        int x=0;
        for(int i=1; i<=9; i=i+2){
            x=i;
            for(int j=1; j<=5; j++){
                System.out.print(x+" ");
                x=x+2;

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt18(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if((i+j)%2==0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt19(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt20(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if((i+j)%2==1 || i%2==0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt21(){
        for(int i=1; i<=5; i++){
            for(int j=0; j<5; j++){
                System.out.print(((i*j)%2)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt22(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(i%2+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt23(){
        for(int i=1; i<=5; i++){
            for(int j=0; j<5; j++){
                System.out.print(i%2+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt24(){
        for(int i=1; i<=5; i++){
            for(int j=0; j<5; j++){
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt25(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt34(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt70(){
        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt95(){
        for(int i=1; i<=5; i++){
            for (int j=5; j>i; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt117(){
        for(int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=5; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt128(){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt133(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=5; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt139(){
        int l=1;
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=l; k++){
                System.out.print("*");
            }
            l=l+2;
            System.out.println();
        }
        System.out.println();
    }

    public static void pt163(){
        int l=9;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=l; k++){
                System.out.print("*");
            }
            l=l-2;
            System.out.println();
        }
        System.out.println();
    }

    public static void pt170(){
        for(int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
               System.out.print("*");
            }
            System.out.println();
        }
        for (int k=1; k<=3; k++){
            for (int l=3; l>=k; l--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

/////////////////////////////////////////////////////////////////////////////////

    public static void pt26(){
        for (char i='A'; i<='E'; i++){
            for (char j='A'; j<='E'; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt27(){
        for (char i='A'; i<='E'; i++){
            for (char j='A'; j<='E'; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt28(){
        for (char i='E'; i>='A'; i--){
            for (char j='A'; j<='E'; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt29(){
        for (char i='A'; i<='E'; i++){
            for (char j='E'; j>='A'; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt30(){
        char k='A';
        for (char i='A'; i<='E'; i++){
            for (char j='A'; j<='E'; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pt31(){
        for (char i=0; i<=5; i++){
            for (char j=0; j<=5; j++){
                System.out.print((char)(i+j+65)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        pt1();
        pt2();
        pt3();
        pt4();
        pt5();
        pt6();
        pt7();
        pt8();
        pt9();
        pt10();
        pt11();
        pt12();
        pt13();
        pt14();
        pt15();
        pt16();
        pt17();
        pt18();
        pt19();
        pt20();
        pt21();
        pt22();
        pt23();
        pt24();
        pt25();
        pt34();
        pt70();
        pt95();
        pt117();
        pt128();
        pt133();
        pt139();
        pt163();
        pt170();
        pt26();
        pt27();
        pt28();
        pt29();
        pt30();
        pt31();

    }
}