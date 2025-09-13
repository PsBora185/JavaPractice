package dsaPractice.part1.sorting;

public class insertion {

    public static void iSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int e = nums[i], j;
            for (j = i-1; j >= 0; j--) {
                if (nums[j] > e)
                    nums[j+1]=nums[j];
                else
                    break;
            }
            nums[j+1]=e;
        }
    }

    public static void print(int[] nums){
        System.out.println();
        for (int n : nums)
            System.out.print(n);
    }
    public static void main(String[] args) {
        int[] arr = {4,5,2,6,3,1};

        print(arr);
        iSort(arr);
        print(arr);
    }
}
