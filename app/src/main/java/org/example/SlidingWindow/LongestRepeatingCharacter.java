package org.example.SlidingWindow;

public class LongestRepeatingCharacter {

    public static int longestRepeatingCharacter1(String s, int k) {
        int maxLen = 0;
        for(int i = 0; i< s.length(); i++) {
            int[] hashedMap = new int[26];
            int maxfreq = 0;
            for(int j = i; j< s.length(); j++) {
                hashedMap[s.charAt(j)-'A']++;
                maxfreq = Math.max(hashedMap[s.charAt(j)-'A'], maxfreq);
                if((j-i+1) - maxfreq <= k) {
                    maxLen = Math.max(maxLen, (j-i+1));
                } else{
                    break;
                }
            }
        }

        return maxLen;
    }

    public static int longestRepeatingCharacter2(String s, int k) {
        int maxLen = 0;
        int l = 0, r = 0, maxFreq = 0;
        int[] hashedMap = new int[26];
        while(r < s.length()) {
            hashedMap[s.charAt(r)- 'A']++;
            maxFreq = Math.max(maxFreq, hashedMap[s.charAt(r)-'A']);
            while((r-l+1)- maxFreq > k) {
                hashedMap[s.charAt(l)-'A']--;
                maxFreq = 0;
                for(int i = 0; i< 26;i++){
                    maxFreq = Math.max(maxFreq,hashedMap[i]);
                }
                l++;
            }

            if((r-l+1)- maxFreq <=k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
        }

        return maxLen;
    }

    public static int longestRepeatingCharacter3(String s, int k) {
        int maxLen = 0;
        int l = 0, r = 0, maxFreq = 0;
        int[] hashedMap = new int[26];
        while(r < s.length()) {
            hashedMap[s.charAt(r)- 'A']++;
            maxFreq = Math.max(maxFreq, hashedMap[s.charAt(r)-'A']);
            if((r-l+1)- maxFreq > k) {
                hashedMap[s.charAt(l)-'A']--;
                l++;
            }

            if((r-l+1)- maxFreq <=k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}
