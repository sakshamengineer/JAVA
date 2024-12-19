//palindrome triangle
public class p12 {
    public static void main(String[] args) {
        int a = 5;
        for(int i = 1;i<=a;i++){
            for(int j =1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
