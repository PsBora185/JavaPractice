package dsaPractice.part1.sorting;

public class bubble {

    public static void bSort(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int bbl = 0;
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[bbl] > nums[j]){
                    int temp = nums[bbl];
                    nums[bbl] = nums[j];
                    nums[j] = temp;
                }
                bbl=j;
            }
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
        bSort(arr);
        print(arr);
    }
}
