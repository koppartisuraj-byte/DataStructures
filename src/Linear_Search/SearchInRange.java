package Linear_Search;

public class SearchInRange {

    public static void main(String[] args) {
        int[] nums = {23,44,2,17,12,1,25,3};
        int target = 23;
        int start = 1;
        int end = 5;
        linearSearch(nums,target,1,6);
        System.out.println(linearSearch(nums,target,start,end));
    }

    //search in the array : return the index if item found
    //otherwise if item not found return -1

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0) {
            return -1;
        }

        //run a for loop
        for(int index=start;index<=end;index++){
            //check for elemenet at every index if it is = target
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}
