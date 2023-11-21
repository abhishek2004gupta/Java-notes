//linear seach
package searches;

import java.util.Scanner;
// import java.util.ArrayList; indexOf()
class linse{
    public static void main(String a[]){
        int arr[] = {1,2,3,4,5,2,3,2};
        int c =0;
        System.out.println("element you wanted to find : ");
        Scanner sc = new Scanner(System.in);
        int el = sc.nextInt();
        for(int p : arr){
            if(p == el){
                c+=1;
            }
        }
        if(c >0){
            System.out.println("element is present in list "+c+" times");
        } 
        else{
            System.out.println("element is not present in list");
        }
    }
}