import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        int[] arr={5,4,-1,-34,0};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static  void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int maxInd=getMaxInd(arr, 0, last);
            swap(arr,maxInd, last);
        }
    }
    static  int getMaxInd(int[] arr, int start, int last){
        int max=0;
        for (int i = 0; i <= last; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int start, int last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;

    }
}
