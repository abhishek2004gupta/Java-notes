import java.util.Scanner;
class calculator{
    int a;
    int f = 1;
    String s ="";
    public int fact(int n){

        for(a=1;a<=n;a++){
            f= f*a;
        }
        return f;
    }
    public void how(int n){
        System.out.println("how the output is coming is");
        System.out.print(n+"="+n);
        for(a=n-1;a>0;a--){
            System.out.print("*"+a);
        }
        System.out.println();
    }
}
public class factorial{
    public static void main(String a[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number whose factorial you want to find");
        int r = sc.nextInt();
        calculator obj1 = new calculator();
        int result1 = obj1.fact(r);
        System.out.println(result1);
        // calculator obj2  = new calculator();
        obj1.how(r);
        // System.out.println(result2);
    }
}