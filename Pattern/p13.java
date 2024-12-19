// butterfly pattern
public class p13 {
    public static void main(String[] args) {
        int a =4;
        for(int i = 1; i<=a;i++){
            System.out.println("*".repeat(i)+" ".repeat((a-i)*2)+"*".repeat(i));
        }
        for(int k= a;k>=1;k--){
            System.out.println("*".repeat(k)+" ".repeat((a-k)*2)+ "*".repeat(k));
        }
    }  
}