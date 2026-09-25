package Arrays_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array_input {

    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 232;
        arr[2] = 243;
        arr[3] = 3;
        arr[4] = 93;

        //input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int num: arr) {
            System.out.println(num +  " ");
        }

        System.out.println(Arrays.toString(arr));
    }
}