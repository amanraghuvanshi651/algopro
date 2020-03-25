import java.util.Arrays;

class selectionsort {

    public static void main(String[] args){

        int[] arr = {6,5,4,3,2,1};
        System.out.println("Provided Array : " + Arrays.toString(arr));
        sort(arr);

        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    public static void sort(int[] arr){

        int n = arr.length;

        for(int i = 0 ; i < n-1 ; i++){
            int min_idx = i ;
            for(int j = i + 1 ; j < n  ; j++){
                if(arr[min_idx] > arr[j]){
                    min_idx = j;
                }
            } 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }

    } 

}