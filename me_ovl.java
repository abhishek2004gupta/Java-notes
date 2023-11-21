//this is the code for method overloading
//(same method names but wo jo inputs ke according usme se ek use hoga and output dega,
// according to number of inputs and thier data types)
import java.util.Scanner;
class sum{
    int a =10;//instance variable
    public int add(int n1,int n2,int n3){//n1,n2,n3 are local variables // add is a method
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
}

public class me_ovl {
    public static void main(String a[]){        // main is the method
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter 3 integer and one double");
        // int a1 = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // double d = sc.nextDouble();
        // sum obj = new sum();
        // int r1 = obj.add(a1,b,c);       //obj is reference variable
        // int r2 = obj.add(a1,b);
        // double r3 = obj.add(d,a1);
        // System.out.println(r1);
        // System.out.println(r2);
        // System.out.println(r3);
        int n =7;
        if(n>=1 && n<=100000){
            int c=0;int b=1; int d=0;
            for(int i=1;i<n;i++){
                d = c+b ;
                c=b;
                b=d;
            }
            System.out.println(b);
    }
}
}
