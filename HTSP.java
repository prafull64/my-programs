class HTSP{
    public static void main(String[] args){
        int i,j,k;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
                if(i==1||j==1||i==j||i==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}