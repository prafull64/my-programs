class fibonacci{
    public static void main(String[] args){
        int num1=0, num2=1, num3;

        System.out.print(num1+" "+num2+" ");

        for(int count=1; count<=8; count++){
            num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;

        }
    }
}