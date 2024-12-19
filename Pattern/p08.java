// floyd's triangle
public class p08 {
    public static void main(String[] args) {
        int a = 5;
        int n = 1;
        for(int i = 1;i<=a;i++){
            for(int j = 1;j<=i;j++,n++){
                System.out.print(n+" ");
            }
        System.out.println();
        }
    }
}
