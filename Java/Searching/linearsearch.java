import java.util.*;

class linearsearch{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n,num_search;

        System.out.print("how many no you want to enter in the array : ");
        n = scn.nextInt();
        System.out.println();

        int arr[] = new int[n];

        System.out.print("Enter the array : ");
        for(int i = 0 ; i < n ; i++){

            arr[i] = scn.nextInt();

        }
        System.out.println();

        System.out.print("Enter the no you want to search in array : ");
        num_search = scn.nextInt();

        int indx = search(num_search,arr);

        if(indx == -1){
            System.out.println("Error : Number Not Found ; ");
        }else{
            System.out.println("The no found at " + (indx+1) + "th position");
        }

    }

    public static int search(int s, int[] arr){

        int size = arr.length;
        for(int i = 0 ; i < size ; i++){
            if(arr[i] == s){
                return i;
            }
        }
        return -1;

    }

}