import java.util.*;

class interpolationsearch{

    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int item;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no you want to search : ");
        item = scn.nextInt();
        int indx ;
        int n = arr.length;
        int l = 0 ;
        int h = n - 1;

        indx = search(arr,l,h,item);

        if (indx == -1){
            System.out.println("Error : Item not found ");
        }else{
            System.out.println("The Item found at " + (indx) + "th position");
        }
    }

    static int search(int arr[] ,int l, int h, int item){
        

        // int mid = l + ((h - l) / (arr[h] - arr[l])) * (item - arr[l]);
        int mid = (h + l)/2;

        if(mid == item){
            return mid;
        }else if(mid < item){
            return search(arr, mid + 1 , h , item);
        }else if(mid > item){
            return search(arr , l ,mid - 1 , item);
        }else{
            return -1;
        }
    }

}