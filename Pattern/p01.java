//solid rectangle
/*public class p01{
    public static void main(String[] args) {
        int a = 5;
        int b = 4;                                      //using functions
        for(int i = 1;i<=a;i++){
            System.out.println("*".repeat(b));
        }
    }
}*/

public class p01{
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        for(int i = 1;i<=a;i++){
            for(int j = 1;j<=b;j++){                    // using nested loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}