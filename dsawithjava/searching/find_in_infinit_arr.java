package dsawithjava.searching;
import java.util.Scanner;
public class find_in_infinit_arr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target;
        int[] arr={0,1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the target element for blind search :");
        target=sc.nextInt();
        findRng(arr, target);
        

    }
    static void findRng(int[] arr, int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
            int temp=start;
            if (target>arr[end]) {
                temp=end+1;
                end=end+(end-start+1)*2;
            }
            else{
                System.out.println("Item not exist!!!");
            }
            start=temp;
        }
        binSrch(arr, target, start, end);

    }
    static void binSrch(int[] arr,int target, int start1 , int end1){
        int start=start1;
        int end=end1;
        int mid;
        while(start<=end){
             mid=(start+end)/2;
         if (target<arr[mid]) {
             end=mid-1;
         }
         else if (target>arr[mid]) {
             start=mid+1;
         }
         else if (target==arr[mid]) {
             System.out.println("Found at "+(mid+1)+" position");
             break;
             
         }
         else{
             System.out.println("Item not found!!!");
         }
     }
     }
}
