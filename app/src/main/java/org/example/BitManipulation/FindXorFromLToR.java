package org.example.BitManipulation;

public class FindXorFromLToR {
    public static int findXor(int l, int r) {
        int ans = 0;

        for (int i = l; i <= r; i++) {
            ans ^= i;
        }
        return ans;
    }
}
