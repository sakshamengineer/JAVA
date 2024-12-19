import java.util.*;
public class java1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.\t");
        int a = sc.nextInt();
        int b = 0;
        if (a <=1) {
            System.err.println(a+" is neither prime nor composite");
        }
        else{
            for(int i = 2;i<a;i++){
                if (a%i == 0){
                    b+= 1;
                }
            }
        }
        if (b>0){
            System.out.println("");
        }
    }
}