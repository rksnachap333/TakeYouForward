package org.example.BinarySearch.Lec2;

public class SquareRootOfANumber {

    public static void runner() {

        int n = 36;
        System.out.println("(Brute Force) Square root of " + n + " is ===" + findSquareRoot(n));
        System.out.println("(BinarySearch) Square root of " + n + " is ===" + findSquareRootUsingBinarySearch(n));
    }

    // A mathematics algo says square root of number always lies between 1 to n/2;
    // Brute force complexity = 0(n/2)
    //Using binary search

    private static int findSquareRoot(int n) {
        int ans = 1;
        for (int i = 1; i <= n / 2; i++) {
            if (i * i <= n) {
                ans = i;
            } else {
                break;
            }
        }

        return ans;
    }

    private static int findSquareRootUsingBinarySearch(int n) {
        int lo = 1;
        int hi = n / 2;
        int ans = 1;
        while (lo <= hi) {
            int mid = (lo + hi) >> 1;
            if (mid * mid <= n) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }

        }

        return ans;
    }
}
