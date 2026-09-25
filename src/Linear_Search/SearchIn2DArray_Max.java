package Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray_Max {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        int ans = max(arr);
        System.out.println(ans);
    }

    static int max (int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row< arr.length; row++){
            for(int col = 0; col <arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    //enhanced for loop
    static int maxv1(int[][] arr) {
        int max1 = Integer.MIN_VALUE;
        for (int[] ints : arr) { // every single array is going to be integer array itself
            for (int element : ints) { // and in that every single integer array its going to have particular element
                if (element > max1) {
                    max1 = element;
                }
            }
        }
        return max1;
    }
}
