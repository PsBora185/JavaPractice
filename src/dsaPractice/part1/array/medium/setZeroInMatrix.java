package dsaPractice.part1.array.medium;

public class setZeroInMatrix {





    public static void setZeroB(int[][] matrix) { // brute  O(n*m) * O(n+m) + O(n*m) --> O((n*m)^2)

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) { // set elements to -1 which will change to 0

                    int r = i, c = j;

                    for (int k = 0; k < col; k++) {
                        if (matrix[r][k] != 0)
                            matrix[r][k] = -1;
                    }

                    for (int k = 0; k < row; k++) {
                        if (matrix[k][c] != 0)
                            matrix[k][c] = -1;
                    }
                }
            }
        }

        // set elements to 0 which are -1
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


    public static void print(int[][] nums) {
        for (int[] num : nums) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 2}, {3, 0, 7, 5}, {9, 4, 0, 0}, {1, 4, 8, 6}};
        print(arr);
        setZeroB(arr);
        print(arr);
    }
}

