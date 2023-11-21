package searches;
//binary search

import java.util.Scanner;
public class binse {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements of list");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.print("enter the elements of list in ascending order");
        for(int i=0;i<num;i++){
            int b = sc.nextInt();
            arr[i] = b;
        }
        System.out.print("enter the key you want to find: ");
        int key = sc.nextInt();
        int first =0; int last = num-1;
        int mid = (first+last)/2;

        while(first <= last){
            if(arr[mid] == key){
                System.out.println("element is fount at "+(mid+1) +" position");
                break;
            }
            else if(arr[mid]>key){
                last= mid-1;
            }
            else if(arr[mid]<key){
                first = mid+1;
            }
            mid = (first+last)/2;
        }
        if(first > last){
            System.out.println("element is not found in list");
        }

    }
}
