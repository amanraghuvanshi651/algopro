import java.util.*;

public class selectionsort{

    public static void main(String[] args){

        int size;
        Scanner scn = new Scanner(System.in);
        System.out.print("entee how many no you want to enter : ");
        size = scn.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < size ; i++ ){

            System.out.print("Enter "+ (i+1) +" element : " );
            arr[i] = scn.nextInt();

        }

        int temp;

        for(int i = 1 ; i < size ; i++ ){

            int j = i - 1;
            int key = arr[i];
            while(j >= 0 && arr[j] > key){
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                j = j - 1;
            }     
        }

        for(int i = 0 ; i < size ; i++){

            System.out.print(arr[i]+" ");

        }
        System.out.println();   
    }

}