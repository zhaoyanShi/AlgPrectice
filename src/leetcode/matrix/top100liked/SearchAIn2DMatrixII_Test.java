package leetcode.matrix.top100liked;

public class SearchAIn2DMatrixII_Test {
    public static void main(String[] args) {
        SearchAIn2DMatrixII object = new SearchAIn2DMatrixII();

        boolean found = object.searchMatrix_z(new int[][]{{-1, 3}}, 3);
        System.out.println(found + " expect [true]");
    }
}
