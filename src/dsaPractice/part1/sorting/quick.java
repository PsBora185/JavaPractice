package dsaPractice.part1.sorting;

public class quick {

    public static int partition(int[] nums, int l, int h) {
        int idx = l - 1;
        int pEle = nums[h];

        for (int i = l; i < h; i++) { // low to high in every partition
            if (nums[i] < pEle) {
                idx++;  // placing min elements from start
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }
        // now all minimum then pivot element are till index - idx , others are greater

        idx++;
        int temp = nums[idx];
        nums[idx] = pEle; // placing pivot at its right position , after all minimum then it
        nums[h] = temp; // we are taking last element as pivot

        return idx; // index of pivot , using it partition in two parts
    }

    public static void qSort(int[] nums, int l, int h) {
        if (l < h) {
            int pIdx = partition(nums, l, h);

            // moving min and large in partition arrays
            qSort(nums, l, pIdx - 1);
            qSort(nums, pIdx + 1, h);
        } // using pivot place elements in right position
    }

    public static void print(int[] nums) {
        System.out.println();
        for (int n : nums)
            System.out.print(n);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 7, 3, 1};

        print(arr);
        qSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
