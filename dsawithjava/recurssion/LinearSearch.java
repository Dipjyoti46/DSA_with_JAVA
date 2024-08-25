package dsawithjava.recurssion;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,12,111};
        System.out.println("Seraching.....");
        int target=112;
        int i=0;
        System.out.println(search(arr,target,i));
    }
    static boolean search(int arr[],int target,int  index){
        if(index>arr.length-1){
            return false;
        }
        else if(arr[index]==target){
            return true;
        }
        else{
            return search(arr, target, index+1);
        }
    }

}
