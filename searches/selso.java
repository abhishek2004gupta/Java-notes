//selso sort
package searches;

public class selso {
    static void selsosort(int arr[]){
        int n = arr.length;
        int small=arr[0];int index=0;
        for(int j=0;j<n-1;j++){
            int p=0;
            small = arr[j];
            for(int i=j+1;i<n;i++){
                if(arr[i]<small){
                    small = arr[i];
                    index=i;
                    p+=1;
                }
            }

            System.out.println(index + " " + small+ " "+j);
            if(p>0){
                arr[index]=arr[j];
                arr[j] = small;
            }
        }
    }
    public static void main(String a[]){
        // int arr[]= {12,5,56,34,99,6,2,12,5,3,12};
        // int arr[] = {1,2,43,4,5,2,4,5,6,8,9};
        int[] arr = {9,14,3,2,43,11,58,22};  
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        // sort st = new sort();
        selsosort(arr);
        
        System.out.println("after sorting");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


//               --method 2---
//  public static void selectionSort(int[] arr){  
//         for (int i = 0; i < arr.length - 1; i++)  
//         {  
//             int index = i;  
//             for (int j = i + 1; j < arr.length; j++){  
//                 if (arr[j] < arr[index]){  
//                     index = j;//searching for lowest index  
//                 }  
//             }  
//             int smallerNumber = arr[index];   
//             arr[index] = arr[i];  
//             arr[i] = smallerNumber;  
//         }  