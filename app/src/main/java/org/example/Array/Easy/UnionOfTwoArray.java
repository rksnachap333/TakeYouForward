package org.example.Array.Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class UnionOfTwoArray {

    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || arr1[i] != union.get(union.size() - 1)) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || arr2[j] != union.get(union.size() - 1)) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (union.size() == 0 || arr1[i] != union.get(union.size() - 1)) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (union.size() == 0 || arr2[j] != union.get(union.size() - 1)) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static ArrayList<Integer> union1(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            if (map.get(num) == null) {
                map.put(num, 1);
                union.add(num);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        for (int num : arr2) {
            if (map.get(num) == null) {
                map.put(num, 1);
                union.add(num);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        return map.isEmpty() ? union : new ArrayList<>(map.keySet());

    }
}
