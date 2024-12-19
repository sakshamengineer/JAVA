// hollow butterfly
/* public class p15{
    public static void main(String[] args) {
        int a = 4;
        for(int i = 1;i<=a;i++){
            for(int j=1;j<=i;j++){
                if (j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k = 1; k<=(a-i)*2;k++){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
                if (m==1 || m==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
        for(int i = a;i>=1;i--){
            for(int j=1;j<=i;j++){
                if (j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k = 1; k<=(a-i)*2;k++){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
                if (m==1 || m==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }  
} */
public class p15 {
    public static void main(String[] args) {
        int a =10;
        for(int i = 1; i<=a;i++){
            if (i==1){
                System.out.println("*"+" ".repeat((a-i)*2)+"*");
            }
            else{
                System.out.println("*"+" ".repeat(i-2)+"*"+" ".repeat((a-i)*2)+"*"+" ".repeat(i-2)+"*");
            }
        }
        for(int k= a;k>=1;k--){
            if (k==1) {
                System.out.println("*"+" ".repeat((a-k)*2)+"*");
            }
            else{
                System.out.println("*"+" ".repeat(k-2)+"*"+" ".repeat((a-k)*2)+"*"+" ".repeat(k-2)+"*");
            }
        }
    }  
}