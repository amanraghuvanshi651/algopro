import java.util.*;
class jumpsearch{

    public static void main(String[] args){

        int arr[] = {0,1,1,2,3,4,5,6,7,8,9,9,11,12,13,14,15,55,65,87,95};
        int n = arr.length, item;
        int indx;

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the no you want to search : ");
        item = scn.nextInt();

        indx = sort(arr,n,item);

        if(indx == -1){
            System.out.println("Error : Item not found ; ");
        }else{
            System.out.println("Item found at " + (indx + 1) + " position;");
        }



    }


    static int sort(int arr[] , int n , int item){

        int m = (int)Math.sqrt(n);
        int i = 0;

        while(arr[Math.min(m, n) - 1]<= item ){

            i = m;
            m += (int)Math.sqrt(n);

            if(m>n){
                return -1;
            }

        }

        for(int x = i ; x < m ; x++){
            if(arr[x] == item){
                return x;
            }
        }
        return -1 ;

    };
}