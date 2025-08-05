package dsaPractice.part1.array.easy;

import java.util.ArrayList;
import java.util.List;

// use arraylist for easier union then move to array same size as list
// in direct storing in array , always space n+m , moight waste little bit space
public class unionOfArray {

    public static int[] uArray(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;

        int[] uNums = new int[n];

        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (k == 0 || uNums[k - 1] != nums1[i]) {
                    uNums[k] = nums1[i];
                }
                i++;

            } else if (nums2[j] < nums1[i]) {
                if (k == 0 || uNums[k - 1] != nums2[j]) {
                    uNums[k] = nums2[j];
                }
                j++;
            } else {
                if (k == 0 || uNums[k-1] != nums2[j]){
                    uNums[k] =  nums2[j];
                }
                i++;
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            if (k == 0 || uNums[k - 1] != nums1[i]) {
                uNums[k] = nums1[i];
            }
            i++;
            k++;
        }
        while (j < nums2.length) {
            if (k == 0 || uNums[k - 1] != nums2[j]) {
                uNums[k] = nums2[j];
            }
            j++;
            k++;
        }
        return uNums;
    }

    public static void print(int nums[]) {
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6};
        int[] arr2 = {3, 4, 5, 6, 7, 9};

        int[] union = uArray(arr1, arr2);
        print(union);
    }
}
