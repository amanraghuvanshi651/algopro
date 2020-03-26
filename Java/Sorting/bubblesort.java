import java.util.*;

public class bubblesort{

    public static void main(String[] args){

        int temp;
        int size;
        Scanner scn = new Scanner(System.in);
        System.out.print("how many digits you want to enter : ");
        size = scn.nextInt();
        int arr[] = new int[size];

        for(int i = 0 ; i < size ; i++){

            arr[i] = scn.nextInt();

        }
        for(int i = 0 ; i < size - 1 ; i++){
            for(int j = 0 ; j < size - i -1 ; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("the sorted array is : ");
        for(int i = 0 ; i < size ; i++){

            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

}