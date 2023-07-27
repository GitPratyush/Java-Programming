//https://leetcode.com/problems/sqrtx/

public class SqRoot {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long val = (mid * mid);
            if (val <= (long) (x)) {
                start = (int) (mid + 1);
            } else {
                end = (int) (mid - 1);
            }
        }
        return end;
    }
}
