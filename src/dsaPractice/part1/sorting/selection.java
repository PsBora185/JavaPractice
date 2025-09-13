package dsaPractice.part1.sorting;

public class selection {

    public static void sSort(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[min] > nums[j])
                    min = j;
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }

    public static void print(int[] nums){
        System.out.println();
        for (int n : nums)
            System.out.print(n);
    }
    public static void main(String[] args) {
        int[] arr = {4,5,2,7,3,1};

        print(arr);
        sSort(arr);
        print(arr);
    }
}
