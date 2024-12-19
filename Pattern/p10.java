// solid rhombus
public class p10{
    public static void main(String[] args) {
        int a = 6;
        for(int i = a; i>=1;i--){
            System.out.println(" ".repeat(i-1)+"*".repeat(a));
        }
    }
}

/* public class p10 {
    public static void main(String[] args) {
        int a = 6;
        for(int i = 1;i<=a;i++){
            for(int j =1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */