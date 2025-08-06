package dsaPractice.part1.array.easy;

public class appearOnce {

    public static int find(int[] nums) {

//  O(n^2)
//        for (int n : nums) {
//            int count = 0;
//            for (int nu : nums) {
//                if (n == nu)
//                    count++;
//            }
//            if (count == 1)
//                return n;
//        }
//        return -1;

        int xor = 0;

        for(int n : nums){
            xor ^= n;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 8, 2, 3, 8, 5};

        System.out.println(find(arr));
    }
}
