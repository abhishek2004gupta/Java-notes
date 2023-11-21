// class Mobile{
//     String brand;
//     int price;
//     static String name; //here we make this variable static, now it will belong to class not to any objects
//     // in this case, whatever value will be in "name" will ve same for all the objects and if we change it
//     // then it will be changed for all the objects as it is stored outside the objects space and all objects
//     // point or refer to thgat location for name

//     public void show(){
//         System.out.println(brand + " : " + price + " : " + name);
//     }
// }

// public class staticf {
//     public static void main(String a[]){
//         // Mobile obj1 = new Mobile();
//         // Mobile obj2 = new Mobile();
//         // Mobile obj3 = new Mobile();
        
//         // obj1.brand = "Apple";
//         // obj1.price = 1500;
//         // obj1.name = "Smart phone";

//         // obj2.brand = "Samsung";
//         // obj2.price = 1200;
//         // obj2.name = "Smart phone";

//         // obj1.show();
//         // obj2.show();

//         // obj1.name = "phone" ;
//         // obj1.show();
//         // obj2.show();
        
//         // as static variable belongs to class, hence it is preffered 
//         //to write it with class name, but still it will work with object name

//         Mobile obj1 = new Mobile();
//         Mobile obj2 = new Mobile();
        
//         obj1.brand = "Apple";
//         obj1.price = 1500;
//         Mobile.name = "Smart phone";

//         obj2.brand = "Samsung";
//         obj2.price = 1200;
//         Mobile.name = "Smart phone";

//         obj1.show();
//         obj2.show();

//         Mobile.name = "phone";

//         obj1.show();
//         obj2.show();

//     }
// }

//-------------------------------------------------------------------------------------------//

// output
// Apple : 1500 : Smart phone
// Samsung : 1200 : Smart phone
// Apple : 1500 : phone        
// Samsung : 1200 : phone

//--------------------------------------------------------------------------------------------//

                                // ---Static block(Method)--- // 

class Mobile{
    String brand;
    int price;
    static String name;

    public Mobile(){  // ----it is an constructor----- //
        brand = "IQ";
        price = 1000;
        System.out.println("in constructor");
    }
    static{
        name = "phone";
        System.out.println("in satic block");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class staticf {
    public static void main(String a[]){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smart phone";

        obj1.show();

        Mobile obj2 = new Mobile();

        obj2.show();
    }
} // here static block (method) runs only once or runs whenever class loads in JVM 
  // a class loads whenever its not there in JVM and a object is created -
  // - so, first time to create object class data loads in JVM
  // constructor runs whenever an object will be created 
  // as we created 2 objects, data from constructor being fetched twice -
  // - constructor runs 2 times(shown in output)


//----------------------------------------------------------------------------------------------------//

// output
// in satic block
// in constructor
// Apple : 1500 : Smart phone
// in constructor
// IQ : 1000 : Smart phone

//----------------------------------------------------------------------------------------------------//