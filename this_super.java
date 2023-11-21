
// every constructor starts with a by default method "super"; 
//that is not compulsory to mention as it works itself
// super() -- calling the constructor of super class(or parent class)
// we can pass parameters in super method accordingly, one constructor will work(by default -- default constructor)
//----every class in java extends or inheritance with "Object" class untill any another class is specified
// hence class A by default entending to "Object class"
// "this" method executes the default constructor of same class

class A extends Object{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }
}
class B extends A{   // a class can extend to only one class, here B is extending to A only 
    
    public B(){
        super(5);  // this is calling parameterised constructor of parent class
        System.out.println("in B");
    }
    public B(int n){
        super();
        System.out.println("in B int");
    }
}

class C extends B{
    public C(){
        super();
            
        System.out.println("in C");
    }
    public C(int n){
        // super(n);
           // "this" method executes the defult constructor of same class
        System.out.println("in C int");
    }
    public C(String n){
        this();
        System.out.println("in C String");
    }
}

public class this_super {
    public static void main(String a[]){
        C obj = new C("aryan");
    }
}
