public class pattern13 {
    public static void main(String[] args) {
        int n=5;
        int a=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                a=a+1;
                System.out.print(a);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
