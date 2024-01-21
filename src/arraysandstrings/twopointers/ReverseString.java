package src.arraysandstrings.twopointers;

import java.util.Arrays;

/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/
public class ReverseString {

    public void reverseGivenString(char[]  s){
        int left =0;
        int right=s.length-1;

        while ( left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
        System.out.println(s);

    }

    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        char[] s1 ={'e', 'v', 'o', 'l', '4'};


        reverseString.reverseGivenString(s1);

        char[] s2 = {'a', 'b', 'c', 'd', '0'};

        reverseString.reverseGivenString(s2);

    }
}
