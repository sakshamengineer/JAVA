// inverted half pyramid
/* public class p04 {
    public static void main(String[] args) {
        int a = 5;                                          //using function
        for(int i=a;i>=1;i--){
            System.out.println("*".repeat(i));
        }
    }
} */
public class p04 {
    public static void main(String[] args) {
        int a = 5;                                          //using nested loop
        for(int i=a;i>=1;i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}