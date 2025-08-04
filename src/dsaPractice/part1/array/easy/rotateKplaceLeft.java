package dsaPractice.part1.array.easy;

public class rotateKplaceLeft {

    // brute force
    public static void rotateK(int nums[], int k) {  // O(n+k)

        int[] temp = new int[k];  // extra space O(k)
        for (int i = 0; i < k; i++) { // O(k)
            temp[i] = nums[i];
        }

        int i;
        for (i = 0; i < nums.length - k; i++) { // O(n-k)
            nums[i] = nums[i + k];
        }

        while (i < nums.length) {   //  o(k)
            nums[i] = temp[i + k - nums.length];
            i++;
        }
    }

    public static void print(int nums[]) {
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    public static void rotate(int nums[], int k) {   // eg : a,b,c,d,e  ; k=3

        reverse(nums, 0, k - 1); // reverse front part that will move in back : k elements : gives - c,b,a|d,e

        reverse(nums, k, nums.length - 1); // reverse remaining part that will come in front n-k length : gives - c,b,a|e,d

        reverse(nums, 0, nums.length - 1); // reverse the whole array  : gives - d,e,a,b,c
    }

    public static void reverse(int[] nums, int st, int end) { // end = length of reversing part

        int temp;

        while (st < end) {
            temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }

//        for (int i = st; i < end / 2; i++) {  //
//            temp = nums[i];
//            nums[i] = nums[end - i -1];
//            nums[end - i -1] = temp;
//        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;

        print(arr);
        rotate(arr, k); // O(2n) : O(k)
//        rotateK(arr, k);   O(n+k) : O(1)
        print(arr);

    }
}
