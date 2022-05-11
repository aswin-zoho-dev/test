public class snakeMatrix {
    public static void main(String[] args) {
        // int[][] mat = { { 1, 2, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
        int[][] mat = { { 1, 6, 7 }, { 2, 5, 8 }, { 3, 4, 9 } };
        snakePatternRightToLeft(mat);
        System.out.println();
        System.out.println("-------------");
        snakePatternUpToDown(mat);
    };

    public static void snakePatternRightToLeft(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(mat[i][j]);
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j]);
                }
            }
        }
    };

    public static void snakePatternUpToDown(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[j][i]);
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(mat[j][i]);
                }
            }
        }
    };
}
