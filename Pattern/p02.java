//hollow rectangle 
/* public class p02 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        for(int i = 1;i<=a;i++){
            if (i==1 || i==a){
                System.out.println("*".repeat(b));          \\ using function
            }
            else{
                System.out.println("*"+" ".repeat(b-2)+"*");
            }
        } 
    }
}
 */
public class p02 {
    public static void main(String[] args) {
        int a = 9;
        int b = 9;
        for(int i = 1;i<=a;i++){
            for(int j = 1;j<=b;j++){
                if (i==1|| j==1 || i==a || j==b){
                    System.out.print("*");              // using nested loop
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
}