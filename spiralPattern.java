public class spiralPattern {
    public static void main(String[] args) {
        // int[][] mat = { { 1, 2, 3, 4 },
        // { 14, 15, 16, 5 },
        // { 13, 20, 17, 6 },
        // { 12, 19, 18, 7 },
        // { 11, 10, 9, 8 } };
        int[][] mat = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
                { 13, 12, 11, 10, 9 } };

        int startRow = 0;
        int endRow = mat.length;
        int startCol = 0;
        int endCol = mat[0].length;

        spiral(startRow, endRow, startCol, endCol, mat);

    }

    public static void spiral(int startRow, int endRow, int startCol, int endCol, int[][] mat) {
        while (startRow < endRow && startCol < endCol) {
            // top to right
            for (int i = startCol; i < endCol; i++)
                System.out.print(mat[startRow][i] + " ");

            startRow += 1;
            // right to down
            for (int i = startRow; i < endRow; i++)
                System.out.print(mat[i][endCol - 1] + " ");

            endCol -= 1;
            // down to left
            for (int i = endCol - 1; i >= startCol; i--)
                System.out.print(mat[endRow - 1][i] + " ");

            endRow -= 1;
            // left to top
            for (int i = endRow - 1; i >= startRow; i--)
                System.out.print(mat[i][startCol] + " ");

            startCol += 1;
        }
    }
}
