import java.util.*;
public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i==0){
        System.out.println("\n1. ADDITION"+"\n2. SUBSTRACTION"+"\n3. MULTIPICATION"+"\n4. DIVISION\n"+"5. EXIT");
        System.out.print("enter your choice\t");
        int a = sc.nextInt();
        float b,c;
        if (a==5){
            c = 0;
            b = 0;
        }
        else{
        System.out.print("enter first no\t");
        b = sc.nextFloat();
        System.out.print("enter second no\t");
        c = sc.nextFloat();
        }
        switch(a){
            case 1: float sum = b+c;
            System.out.println('\n'+sum);
            break;
            case 2: float sub = b-c;
            System.out.println("\n"+sub);
            break;
            case 3: float mul = b*c;
            System.out.println("\n"+mul);
            break;
            case 4: float div = b/c;
            System.out.println("\n"+div);
            break;
            case 5: i = 3;
            break;
            default : System.out.println("\n"+"invalid input ");
        }
        }
    }
}