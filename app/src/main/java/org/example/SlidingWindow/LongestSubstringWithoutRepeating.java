package org.example.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public int longestSubStrWithoutRepeating1(String str) {
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            Set<Character> charSet = new HashSet<>();
            int j = i;
            while (j < str.length() && !charSet.contains(str.charAt(j))) {
                charSet.add(str.charAt(j));
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            }
        }

        return maxLength;
    }

    public int longestSubStrWithoutRepeating2(String str) {
        HashMap< Character, Integer > mpp = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = str.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(str.charAt(right))) left = Math.max(mpp.get(str.charAt(right)) + 1, left);

            mpp.put(str.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }

}
