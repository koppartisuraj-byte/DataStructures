package Linear_Search;

public class FindMin {
    static void main(String[] args) {
        int[] arr = {23,44,2,17,12,1,25,3};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for(int i =0; i< arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
