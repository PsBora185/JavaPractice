package dsaPractice.part1.array.easy;

public class moveZeros {

    public static void moveToEnd(int[] nums) {

//        int m = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0){
//                if (m == -1)  // first 0
//                    m = i;
//                do {
//                    i++;
//                }while (nums[i] == 0);
//
//                nums[m]=nums[i];
//                m++;
//            } else if (m != -1) {
//                nums[m] = nums[i];
//                m++;
//            }
//        }

        int n = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { // just move non zero
                nums[n] = nums[i];
                n++;
            }
        }
        while (n < nums.length) {
            nums[n] = 0;
            n++;
        }
    }

    public static void print(int nums[]) {
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 4};

        moveToEnd(arr);
        print(arr);

    }
}

