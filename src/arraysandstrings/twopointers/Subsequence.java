package src.arraysandstrings.twopointers;

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a sequence of characters that can be obtained by deleting some (or none) of the characters from the original
string, while maintaining the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde" while "aec" is not.
*/
public class Subsequence {

    public boolean checkSubsequence(String s, String t){

        int i = 0;
        int j = 0;

        while(i< s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {

        Subsequence subsequence = new Subsequence();
        String s1 = "ace";
        String t1 = "abcde";

        System.out.println(subsequence.checkSubsequence(s1,t1));

        String s2 = "afe";
        String t2 = "abcde";

        System.out.println(subsequence.checkSubsequence(s2,t2));

    }
}
