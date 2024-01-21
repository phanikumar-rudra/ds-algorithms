package src.arraysandstrings.twopointers;

import java.util.ArrayList;
import java.util.List;

/*
Example 3: Given two sorted integer arrays arr1 and arr2, return a new array that combines both of them and is also sorted.

For example, given myarray1 = [6, 8, 9] and myarray2 = [5, 7, 10] .
*/
public class CombineTwoArrays {

    public List<Integer> combineTwoArraysInSortingOrder(int[] myarray1, int[] myarray2) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < myarray1.length && j < myarray2.length) {

            if (myarray1[i] < myarray2[j]) {
                res.add(myarray1[i]);
                i++;
            } else {
                res.add(myarray2[j]);
                j++;
            }
        }

        while (i < myarray1.length) {
            res.add(myarray1[i]);
            i++;
        }
        while (j < myarray2.length) {
            res.add(myarray2[j]);
            j++;
        }


        return res;
    }


    public static void main(String[] args) {

        CombineTwoArrays twoSumIsTarget = new CombineTwoArrays();
        int[] myarray1 = {6, 8, 9};
        int[] myarray2 = {5, 7, 10, 11};
        System.out.println(twoSumIsTarget.combineTwoArraysInSortingOrder(myarray1, myarray2));


    }
}
