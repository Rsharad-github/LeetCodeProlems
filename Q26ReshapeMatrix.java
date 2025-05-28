
class Q26ReshapeMatrix{
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // Check if reshaping is possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] mr = new int[r][c];
        int a = 0, b = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mr[a][b] = mat[i][j];
                b++;
                if (b == c) {
                    b = 0;
                    a++;
                }
            }
        }

        return mr;
    }
}