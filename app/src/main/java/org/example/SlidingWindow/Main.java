package org.example.SlidingWindow;

public class Main {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeating longestSubstring = new LongestSubstringWithoutRepeating();
        String testString = "abcabcbb";
        int result = longestSubstring.longestSubStrWithoutRepeating1(testString);
        System.out.println("Longest substring without repeating characters: " + result);
        System.out.println("-------------------------------");

        int result1 = longestSubstring.longestSubStrWithoutRepeating2(testString);
        System.out.println("Longest substring without repeating characters: " + result1);

        System.out.println("---------------------------------------------");

        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int maxOnes1 = MaxConsecutiveOnes.findMaxConsecutiveOnesReplacingKZero1(nums, 3);
        System.out.println("Max Consecutive ones method 1 ===="+maxOnes1);
        System.out.println("-------------------------------------------");

        int maxOnes2 = MaxConsecutiveOnes.findMaxConsecutiveOnesReplacingKZero2(nums, 3);
        System.out.println("Max Consecutive ones method 2===="+maxOnes2);

    }

}
