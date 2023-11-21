class student{
    int roll;
    String name;
    int marks;
}

public class array 
{
    public static void main(String a[])
    {
//         int arr1[]= new int[5];

//         //In arrays if we don't assign any value (at any index) then default valuye will be '0'

//         arr1[0] = 1;
//         arr1[1] = 2;
//         arr1[2] = 3;
//         arr1[3] = 4;
//         arr1[4] = 5;
//         int arr2[] = {1,2,3,4,5};

//         for(int i=0;i<5;i++){
//             System.out.print(arr1[i]+" ");
//         }
//     System.out.println();
//         for(int i=0;i<5;i++){
//             System.out.print(arr2[i]+" ");
//         }
//     System.out.println();
//     System.out.println();
    
//         //multi-dimentional array
//         // 2D array

//         int arr3[][] = new int[3][4]; // it is a multi-dimentional array having 3 arrays which have 4 elements each;
//         //arr3[0][0] = 9; // way of assigning value in a multi-dimentional array one bye one;

//         for(int i=0;i<3;i++){       // way of assigning random value
//             for(int j=0;j<4;j++){
//                 arr3[i][j]= (int)(Math.random()*10);
//             }
//         }

//         for(int i=0;i<3;i++){
//             for(int j=0;j<4;j++){
//                 System.out.print(arr3[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();

//         //special way of printing
//         for(int p[] : arr3){
//             for(int m : p){
//                 System.out.print(m+" ");
//             }
//             System.out.println();
//         }

//         //jagged array

//         int arr[][]= new int [3][];
//         arr[0] = new int [4];
//         arr[1] = new int[3];
//         arr[2] = new int [2];
//         // arr[0][0]=1;
//         // arr[0][1]=2;
//         // arr[0][2]=3;
//         // arr[0][3]=4;
//         // arr[1][0]=5;
//         // arr[1][1]=6;
//         // arr[1][2]=7;
//         // arr[2][0]=8;
//         // arr[2][1]=9;

//         for(int i=0;i<3;i++){
//             for(int j=0;j<arr[i].length ;j++){
//                 arr[i][j] = (int)(Math.random()*10);
//             }
//         }
//         System.out.println();


//         for(int i=0;i<3;i++){
//             for(int j=0;j< arr[i].length ;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();

//         //special method of printing called as enhanced for loop(can also be said for-each loop but not actually)

//         for(int p[] : arr){
//             for(int m : p){
//                 System.out.print(m+" ");
//             }
//             System.out.println();
//         }

//         // 3D array

//         int arr3d[][][] = new int [3][2][4];

//         for(int i=0;i<3;i++){
//             for(int j=0;j<2;j++){
//                 for(int k=0;k<4;k++){
//                     arr3d[i][j][k] = (int)(Math.random()*10);
//                 }
//             }
//         }
//         System.out.println();

//         for(int p[][] : arr3d){
//             for(int m[] : p){
//                 for(int n: m){
//                     System.out.print(n+" ");
//                 }
//                 System.out.print("  ");
//             }
//             System.out.println();
//         }
// System.out.println();
//         for(int i=0;i<3;i++){
//             for(int j=0;j<2;j++){
//                 for(int k=0;k<4;k++){
//                     System.out.print(arr3d[i][j][k]+" ");
//                 }
//                 System.out.print("  ");
//             }
//             System.out.println();
//         }
        
// if the length of the array is not define then we can us the function 
//""""arrayname.length()"""" , this retuns the length of the array, 
// this will help out when we have taken random array size input and hame loop run karana hai.....

        student s1 = new student();
        s1.roll = 1;
        s1.name = "navin";
        s1.marks = 90;

        student s2 = new student();
        s2.roll = 2;
        s2.name = "rohit";
        s2.marks = 95;

        student s3 = new student();
        s3.roll = 1;
        s3.name = "rohan";
        s3.marks = 99;

        //now creating the array of data type classes that is student here, means we will adding objects of a class as elements of a array;
// defining array-- data_type array_name[] = new data_type[number_of_elements]
        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(student stud : students){
            System.out.println(stud.name + ":" + stud.marks);
        }
    }
}
