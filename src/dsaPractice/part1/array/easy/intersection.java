package dsaPractice.part1.array.easy;

public class intersection {

    public static int[] intersect(int[] nums1, int[] nums2) {

        int n = Math.min(nums1.length, nums2.length);
        int[] uNums = new int[n];

        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
// compare and then smaller one will move to next element, cuz larger one can be found and match
                if (nums1[i] > nums2[j]) {
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else {  // when equal add if not in array
                    if (k == 0 || uNums[k - 1] != nums1[i]) {
                        uNums[k] = nums1[i];
                    }
                    i++;
                    j++;
                    k++;
                }
        }
        return uNums;
    }

    public static void print(int nums[]) {
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6};
        int[] arr2 = {3, 4, 5, 6, 7, 9};

        int[] iArray = intersect(arr1,arr2);
        print(iArray);
    }
}
