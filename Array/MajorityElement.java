package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = { 4, 3, 4, 1, 31, 5, 7, 0, 10, 30, 1, 4, 2 };
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        // for (Map.Entry<Integer, Integer> i : map.entrySet()) {
        // if (i.getValue() > arr.length / 2) {
        // return i.getKey();
        // }
        // }

        // return 0;

        int count = 1;
        int ele = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ele) {
                count--;
                if (count == 0) {
                    ele = arr[i];
                }
            } else {
                count++;
            }
        }

        return ele;
    }
}
