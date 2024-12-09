class Loops{
    public static void main(String args[]){
        for(int i = 1;i<=3;i++){
            System.out.println("Outer:"+i);
            for(int j = 1;j<=3;j++){
                System.out.println("Inner:"+j);
            }
            for(int k =1;k<=3;k++){
                System.out.println("Inner:"+k);
            }
        }
    }
}