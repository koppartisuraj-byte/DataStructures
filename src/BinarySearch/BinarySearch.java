package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
    int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45};
    int target = 22;
    int ans = binarySearch(arr,target);
    System.out.println(ans);
    }
    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            //find the middle element
            // int mid = (start + end)/2 => might be possible that start+end exceeds int value which java provides by default
            //Better way to find mid
            int mid = start + (end-start)/2; // (2start + (end-start))/2 => start+end/2
            if(target< arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
