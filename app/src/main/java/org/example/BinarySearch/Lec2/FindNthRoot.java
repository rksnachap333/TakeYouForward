package org.example.BinarySearch.Lec2;

public class FindNthRoot {

    public static void runner() {
        int base = 3, expo = 5;
        int nthRoot = NthRoot(3, 27);
        System.out.println("(Brute Force) 3rd root of 27 == " + nthRoot);
        int nthRootBinary = NthRootUsingBinary(3, 27);
        System.out.println("(Binary Search) 3rd root of 27 == " + nthRootBinary);
    }

    // Brute force complexity = o(log2base n)

    public static int NthRoot(int n, int m) {
        //Use linear search on the answer space:
        for (int i = 1; i <= m; i++) {
            long val = nthPower(i, n);
            if (val == (long)m) return i;
            else if (val > (long)m) break;
        }
        return -1;
    }

    private static long nthPower(int b, int exp) {
        long base = b;
        long ans = 1;

        while (exp > 0) {
            if (exp % 2 != 0) {
                exp--;
                ans = ans * base;
            } else {
                exp /= 2;
                base = base * base;
            }
        }

        return ans;
    }

    private static int NthRootUsingBinary(int n, int m) {
        int lo = 1;
        int hi = m;

        while (lo <= hi) {
            int mid = (lo + hi) >> 1;
            long power = nthPower(mid,n);
            if( power == (long)m) return mid;
            else if(power < (long) m) lo = mid + 1;
            else
                hi = mid -1;
        }
        return -1;
    }
}
