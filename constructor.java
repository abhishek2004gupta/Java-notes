class Human{
    private int age;
    private String name;

    // constructor is similar to methods, #no return type #its name is same as the class in which it is defined
    // a default constructor is already being generated even if we do not generate any constructor
    // it is being "called" whenever object is created, depending upon the parameters given accordingly contructor runs or called
    

    public Human() {   //default constructor
        age = 20;
        name  = "Gupta";
        System.out.println("inside default constructor");
    }

    public Human(int age, String name) { // parameterised constructor
        this.age = age;
        this.name = name;
        System.out.println("inside parametarised constructor age and name");
    }

    

    public Human(String name) {
        this.name = name;
        this.age = 20;
        System.out.println("inside parametarised constructor name");
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class constructor {
    public static void main(String a[]){
        Human obj = new Human();
        Human obj1 = new Human(18,"Gupta");
        Human obj2 = new Human("Abhishek");
        obj.setAge(19);
        obj.setName("Abhishek");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
}
