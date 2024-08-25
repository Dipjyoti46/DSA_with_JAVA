package dsawithjava.recurssion;

public class isSorted {
    public static void main(String[] args) {
        
        int arr[]={1,2,2,3,5,8};
        System.out.println("Checking....");
        int i=0;
        System.out.println(check(arr,i));
    }
    static int check(int arr[],int arr1){
        if((arr1+1)<arr.length){
            if(arr[arr1]<=arr[arr1+1]){
                return check(arr, arr1+1);
            }
            else{
                return 0;
            }
        }
         return  1;
    }

}
