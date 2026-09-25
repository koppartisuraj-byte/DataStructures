package Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

       /* list.add(1);
        list.add(133);
        list.add(13);
        list.add(1);
        list.add(133);
        list.add(13);
        list.add(1);
        list.add(133);
        list.add(13);
        list.add(1);
        list.add(133);
        list.add(13);
        list.add(1);
        list.add(133);
        list.add(13);*/

        for(int i =0; i<5; i++){
            list.add(in.nextInt());
        }

        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }

    /*    System.out.println(list);

        list.set(0,17);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);*/

    }
}
