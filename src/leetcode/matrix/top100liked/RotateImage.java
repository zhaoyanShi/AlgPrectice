package leetcode.matrix.top100liked;

//https://leetcode.cn/problems/rotate-image
public class RotateImage {
    public void rotate(int[][] matrix) {
        int dim = matrix.length;

        //horizontal overturn
        for (int i = 0; i < dim/2; i++) {
            for (int j = 0; j < dim; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[dim-i-1][j];
                matrix[dim-i-1][j] = tmp;
            }
        }

        //leading diagonal overturn
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
