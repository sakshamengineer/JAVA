// inverted half pyramid  with no.
public class p07{
    public static void main(String[] args) {
        int a = 7;
        for(int i = a; i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}