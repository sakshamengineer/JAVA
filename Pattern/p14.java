// Diamond pattern
/* public class p14 {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        for(int i = 1;i<=a;i++){
            System.out.println(" ".repeat(a-i)+"*".repeat(b));
            b+=2;
        }
        for(int j= a; j>=1;j--){
            b-=2;
            System.out.println(" ".repeat(a-j)+"*".repeat(b));
            
        }
    }
} */
public class p14 {
    public static void main(String[] args) {
        int a = 60;
        for(int i=1;i<=a;i++){
            for(int j= 1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int k= 1;k<=(2*i)-1;k+=1){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=a;i>=1;i--){
            for(int j= 1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int k= 1;k<=(2*i)-1;k+=1){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}