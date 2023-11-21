class Human{
    // private int age = 19;       //Private variable can only be accessecible in same declaration class
    // if tried to be accessed directly;      //it can be accessible indirectly with the helpof methods
    // private String name= "Abhishek";
    private int age;
    private String name;

    //creating a method
    // public int getAge(){     //this is the method called "getter", we can generate them by - 
    //                          //right click-soucre action-generate getters and setters-select variables
    //     return age; //here these private variable "age" can be accessilbe as this statement is in same class
    // }

    // public void setAge(int a){    //this is the method called "setter"
    //     age = a;
    // }

    // public String getName(){
    //     return name; //here we can access "name", this same statement and name private variable declaration
    //     // is in same class
    // }

    // public void setName(String n){
    //     name = n;
    // }

                            //-----this keyword-----//

    public int getAge(){     //this is the method called "getter", we can generate them by - 
                             //right click-soucre action-generate getters and setters-select variables
        return age; //here these private variable "age" can be accessilbe as this statement is in same class
    }

    public void setAge(int age){    //this is the method called "setter"
        this.age = age;             // "this" keyword represents the current object or we can say the 
                                    //object which is call out this method, that is in this case "obj"
    }

    public String getName(){
        return name; //here we can access "name", this same statement and name private variable declaration
        // is in same class
    }

    public void setName(String name){
        this.name = name;           //if we don't use "this" keyeord means(name = name), then both "names" variable 
                                    //will be local "name" variable and local variable will be storing the value in itself 
                                    //if names are same for instance and local variable,
                                    // then preference is given to local variable while assigning.
                                    //but in this case "this.name" is instance variable fo class Human
    }

}

public class Encapsulation {
    public static void main(String a[]){
        Human obj = new Human();
        obj.setAge(19);
        obj.setName("Abhishek");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}