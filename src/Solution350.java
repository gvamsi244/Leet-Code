/**
 * @author Vamsi Krishna Govada on 5/18/2020.
 * @project LeetCode
 */

// Intersection of Two Arrays II

import java.util.*;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> arrayList = new ArrayList<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i1 = 0, i2 = 0, i3 = 0;

        while ((i1 != len1) && (i2 != len2)) {
            if (nums1[i1] < nums2[i2])
                i1++;
            else if (nums1[i1] > nums2[i2])
                i2++;
            else {
                arrayList.add(nums1[i1]);
                i1++;
                i2++;
            }
        }

        int[] output = new int[arrayList.size()];
        System.out.println(arrayList);
        for (int i = 0; i < output.length; i++) {
            output[i] = arrayList.get(i).intValue();
        }
        return output;
    }
}
