class A{
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("iN A show()");
    }
}

public class annoobj {
    public static void main(String a[]){
        A obj = new A(); // this is referenced object,which is in the heap memory and has the reference
                         // in the stack memory of obj that is reference variable in stack memory
        new A(); // this is anonymous object, it is just created in the heap memory
                //(no reference variable in stack memory)
                // as many times we will write this statement, new object at different memory will be creacted
        obj.show();     // running show() method using this referenced object
        new A().show(); // running show() method using this anonymous object
        
    }

}
