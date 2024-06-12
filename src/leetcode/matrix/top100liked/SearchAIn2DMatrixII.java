package leetcode.matrix.top100liked;

//https://leetcode.cn/problems/search-a-2d-matrix-ii
public class SearchAIn2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (binarySearch(matrix[i], target) == -1)
                continue;
            return true;
        }

        return false;
    }

    int binarySearch(int[] matrix, int target) {
        int l = 0, h = matrix.length - 1;

        while (l <= h) {
            int mid = (h - l) / 2 + l;
            if (matrix[mid] == target)
                return mid;
            else if (matrix[mid] > target)
                h = mid - 1;
            else if (matrix[mid] < target)
                l = mid + 1;
        }
        return -1;
    }

    public boolean searchMatrix_z(int[][] matrix, int target) {
        int l = matrix.length, w = matrix[0].length;
        int x = 0, y = w - 1;
        while(x < l && y >= 0) {
            if(matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] > target) {
                y --;
            } else if (matrix[x][y] < target) {
                x ++;
            }
        }
        return false;
    }
}
