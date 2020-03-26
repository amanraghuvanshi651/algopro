import java.util.Arrays;
import java.util.Scanner;

class binarysearch{

    public static void main(String[] args){
        int size;
        Scanner scn = new Scanner(System.in);
        int l,h;

        System.out.print("How many no you want to enter : ");
        size = scn.nextInt();

        l = 0;
        h = size-1;

        int arr[] = new int[size];

        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter the no you want to search : ");
        int n = scn.nextInt();

        int temp;

        int indx = search(arr,l,h,n);

        if(indx == -1){
            System.out.println("Error : Entered Number not found ; ");
        }else{
            System.out.println("The no you entered found at " + (indx + 1) + "th position");
        }
        System.out.println("Sorted Array : "+ Arrays.toString(arr));

    }

    static int search(int arr[],int l , int h,int n){

        int mid = (l+h)/2;

        if(arr[mid] == n){
            return mid;
        }else if(arr[mid] < n){
            return search(arr, mid + 1, h, n);
        }else if(arr[mid] > n){
            return search(arr, l, mid - 1, n);
        }else{
            return -1;
        }
    }

}