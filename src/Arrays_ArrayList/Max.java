package Arrays_ArrayList;

public class Max {
    public static void main(String[] args) {
        int[] arr ={1,33,2,44,123,222,332};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2, 0 ));
    }

    //Imagine the arr is not empty
    static int max(int[] arr){
        int maxval = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

    // Max value in Range
    static int maxRange(int[] arr, int start, int end){
        if(end> start){
            return -1;
        }
        int maxval = arr[start];
        for(int i = start; i<=end; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }


}
