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

        System.out.println("-----------------------------------------");

        int maxOnes3 = MaxConsecutiveOnes.findMaxConsecutiveOnesReplacingKZero3(nums, 3);
        System.out.println("Max Consecutive ones method 3===="+maxOnes3);

        System.out.println("---------------------------------------");
        System.out.println("----------Maximum Fruit Problem--------------");

        int[] fruits = {1, 2, 3, 2, 2};
        int totalFruit1 = FruitIntoBasket.totalFruitsIntoBasket1(fruits);
        System.out.println("Total Fruit Count 111===="+totalFruit1);

        System.out.println("---------------------------------------------");
        System.out.println("------------Longest Repeating Character Replacement-------------");
//        String s = "ABAB";
        String s = "AABABBA";
        int longestRepeatingChar1 = LongestRepeatingCharacter.longestRepeatingCharacter1(s, 1);
        System.out.println("Longest Repeating character ===="+longestRepeatingChar1);
        System.out.println("---------------------------------------------");

        System.out.println("----------Find sub array with sum equals goal----------------");
        int [] array = new int[]{1, 0, 1, 0, 0,1};
        int goal = 2;
        int count1 = BinarySubarrayWithSum.binarySubarrayWithSum(array, goal);
        int count2 = BinarySubarrayWithSum.binarySubarrayWithSum(array, goal-1);

        System.out.println("Desired no of subarray ===="+(count1 - count2));
    }

}
