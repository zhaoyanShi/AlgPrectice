package leetcode.binarysearch.top100liked;


//https://leetcode.cn/problems/search-a-2d-matrix/description/?envType=study-plan-v2&envId=top-100-liked
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = matrix.length;
        int w = matrix[0].length;

        for (int i = l-1; i >= 0; i--) {
            if(matrix[i][0] > target)
                continue;

            for (int j = 0; j < w; j++) {
                if(matrix[i][j] == target)
                    return true;
                if(j == w-1)
                    return false;
            }

        }

        return false;

    }
}
