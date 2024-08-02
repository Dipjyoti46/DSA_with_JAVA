package dsawithjava.searching;

public class peak_index {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,2,1};
        findPeak(arr);
    }
    static void findPeak(int[] arr){
        int start=0;
        int end=arr.length;
        // int peak=start;
        while (start<end) {
            int mid=(start+end)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                end=mid;
            }
        }
        if (arr[start]>arr[end]) {
            System.out.println("The Position number is "+start);
        }
        else{
            System.out.println("The Position number is "+end);
        }
    }
}
