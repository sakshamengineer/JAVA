// hollow rhombus
/* public class p16{
    public static void main(String[] args) {
        int a = 9;
        for(int i = a; i>=1;i--){
            if (i==1 || i==a) {
                System.out.println(" ".repeat(i-1)+"*".repeat(a));
            }
            else{
                System.out.println(" ".repeat(i-1)+"*" + " ".repeat(a-2) +"*");
            }
        }
    }
} */
public class p16 {
    public static void main(String[] args) {
        int a = 9;
        for(int i = 1;i<=a;i++){
            if (i==1||i==a) {
                for(int j =1;j<=a-i;j++){
                    System.out.print(" ");
                }
                for(int j = 1; j<=a;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j =1;j<=a-i;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int k=1;k<=(a-2);k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}