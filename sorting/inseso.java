package sorting;
//insesosort

public class inseso {
    static void insesosort(int arr[]){
        int n = arr.length;
        
        for(int j=1 ; j<n; j++){
            int i = j-1;
            int temp =arr[j];
            while((i>-1)&&(arr[i]>temp)){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1]= temp;
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
        insesosort(arr);
        
        System.out.println("after sorting");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
