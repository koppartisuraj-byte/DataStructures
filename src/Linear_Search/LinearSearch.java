package Linear_Search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {23,44,2,17,12,1,25,3};
        int target = 174;
        System.out.println(linearSearch(nums,target));

    }

    //search in the array : return the index if item found
    //otherwise if item not found return -1

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0) {
            return -1;
        }

        //run a for loop
        for(int index=0;index<arr.length;index++){
            //check for elemenet at every index if it is = target
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return Integer.MAX_VALUE; // -1 can be an element in an array
    }
}
