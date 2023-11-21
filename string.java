//abhishek // String

// public class string {
//     public static void main(String a[]){
        //String in java is basically a n=class not a predefined datatype but it also work as datatype
        // String name = new String("abhishek"); //creating a oject of class called String 

        // String name = "Abhishek"; // in this case the object will be created by itself
        // name = name + " Gupta"; // in this case string in name is changing and will be saved in
        // //a different location in heap memory, but the above Abhishek is not getting changed
        // System.out.println(name);
        // System.out.println(name.hashCode()); // it is to print the hash code of the object
        // System.out.println(name.charAt(2)); //it prints character at index 2
        // System.out.println(name.concat(" gupta")); //it concatinate or add given string to string in name


//     }
// }


                        //StringBuffer  // This is used to create mutable string, which can be changed,
                //it stored extra 16 character spaced ,after assignment, to add more data and to edit the string

public class string {
    public static void main(String a[]){

        StringBuffer sb = new StringBuffer("Abhishek");
        System.out.println(sb.capacity()); // in StringBuffer, we have to create object 
        // output of above line is 24 -- means 8 space of my name and extra 16 free space
        System.out.println(sb.length());
        
        //we can append, insert, delete, etc things from string
        sb.append(" Gupta");
        System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);
        sb.deleteCharAt(2);//deleting character at index 2
        System.out.println(sb);
        sb.insert(2, 'h');
        System.out.println(sb);
        sb.insert(0,"Java ");
        System.out.println(sb);

        sb.setLength(30); // it will set the lenght of the string as 30
        sb.ensureCapacity(100); // it will set the minimun length of the string as 100;

        String name = sb.toString(); // toString will convert sb as string and the whole will be stored inside the name
        System.out.println(name + " string"); 


    }
}

// output 
// 24
// 8
// Abhishek Gupta     
// Abishek Gupta      
// Abhishek Gupta     
// Java Abhishek Gupta
// Java Abhishek Gupta string