
package dsawithjava.recurssion;

import java.util.Arrays;

public class QuickSOrt {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static  void sort(int arr[], int low, int high ){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int pivot=arr[(e+(e-s))/2];

        while(s<=e){
            while (arr[s]<pivot) { 
                s++;
            }
            while (arr[e]>pivot) { 
                e--;
            }
            if (s<=e) {
                int temp=arr[e];
                arr[e]=arr[s];
                arr[s]=temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s, high);

    }
    
}
