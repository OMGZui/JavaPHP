package HelloWorldApp.JavaInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTT {
    public static void main(String[] args) {
        int[] a = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};

        Arrays.sort(a);
        for (int n : a) {
            System.out.printf("%s ", n);
        }

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前排序: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后排序: " + arrayList);
    }
}
