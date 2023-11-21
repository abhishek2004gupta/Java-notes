//bubble sort
package sorting;

public class buso {
    static void bubblesort(int arr[]){
        int n = arr.length;
        int temp =0;
        for(int i=0; i<n; i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1] ){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] =temp;
                }
            }
        }
    }
    public static void main(String a[]){
        int arr[]= {12,5,56,34,99,6,2,12,5,3,12};
        // int arr[] = {1,2,43,4,5,2,4,5,6,8,9};
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        // sort st = new sort();
        bubblesort(arr);
        
        System.out.println("after sorting");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
