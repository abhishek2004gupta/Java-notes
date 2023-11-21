// inheritance can be achieved by using extends class_name after new class declaration
// inheritance means accessing the methods(or different things, etc) of the parent(super) class
//----imp.note : Ambiguity problem(in java, muliple inheritance does not work,means a child class [sub class] can never have two different parent class [super class])----//
class calc{
    public int sum(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
class Advcalc extends calc{         // single-level inheritance, 
                                    // here calc is parent class and Advcalc is child class
    public int mult(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}
class VeryAdvcalc extends Advcalc{  //multi-level inheritance
    public double power(int a, int b){
        return Math.pow(a,b);
    }
}

public class inheritance {
    public static void main(String a[]){
        VeryAdvcalc obj = new VeryAdvcalc();

        int r1 = obj.sum(5,4);
        int r2 = obj.sub(7,3);
        int r3 = obj.mult(3,4);
        int r4 = obj.div(9,4);
        double r5 = obj.power(2,2);
        System.out.println(r1 +" "+ r2+ " " + r3 + " " + r4 + " " + r5);
    }
}
