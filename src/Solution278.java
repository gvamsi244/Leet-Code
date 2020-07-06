/**
 * @author Vamsi Krishna Govada on 7/6/2020.
 * @project LeetCode
 */


// First Bad Version


public class Solution278 {

    // The isBadVersion API is defined in the parent class VersionControl........
    // boolean isBadVersion(int version);
    // Remove this method(isBadVersion) if you need to submit this as a Solution in leetcode
    public boolean isBadVersion(int version) {
        return true;
    }

    public int firstBadVersion(int n) {
        return binarySearch(1, n);
    }

    public int binarySearch(double first, double last) {

        double mid_dummy = Math.floor((first + last) / 2);
        int mid = (int) mid_dummy;
        if (isBadVersion(mid)) {
            if (isBadVersion(mid - 1))
                return binarySearch(first, mid - 1);
            else
                return mid;
        } else
            return binarySearch(mid + 1, last);
    }
}
