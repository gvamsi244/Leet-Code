/**
 * @author Vamsi Krishna Govada on 7/5/2020.
 * @project LeetCode
 */


// Merge Sorted Array


public class Solution88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1, j = n - 1, k = (m + n - 1);

        while ((i >= 0) && (j >= 0)) {

            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];

            else if (nums1[i] < nums2[j])
                nums1[k--] = nums2[j--];

            else {
                nums1[k--] = nums2[j--];
                nums1[k--] = nums1[i--];
            }
        }

        if (k >= 0) {
            if ((i < 0) && (j >= 0))
                while (k >= 0)
                    nums1[k--] = nums2[j--];

            else
                while (k >= 0)
                    nums1[k--] = nums1[i--];

        }
    }
}
