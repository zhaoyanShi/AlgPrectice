package leetcode.matrix.top100liked;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.cn/problems/spiral-matrix/
public record SpiralMatrix() {
    public List<Integer> spiralOrder(int[][] matrix) {
        int boundaryUp = 0, boundaryLeft = -1, boundaryDown = matrix.length, boundaryRight = matrix[0].length;
        int i = 0, j = -1;
        List<Integer> list = new ArrayList<>();
        char direct = '0'; // (r)ight, (d)own, (l)eft, (u)p
        while(true) {
            if(direct == '0') {
                boundaryRight --;
                direct = 'r';
            } else if (direct == 'r') {
                j++;
                if(j <= boundaryRight) {
                    list.add(matrix[i][j]);
                } else {
                    direct = 'd';
                    boundaryDown --;
                    j--;
                }
            } else if (direct == 'd') {
                i++;
                if(i <= boundaryDown) {
                    list.add(matrix[i][j]);
                } else {
                    direct = 'l';
                    boundaryLeft ++;
                    i--;
                }
            } else if (direct == 'l') {
                j --;
                if(j >= boundaryLeft) {
                    list.add(matrix[i][j]);
                } else {
                    direct = 'u';
                    boundaryUp++;
                    j++;
                }
            } else if (direct == 'u') {
                i --;
                if(i >= boundaryUp) {
                    list.add(matrix[i][j]);
                } else {
                    direct = 'r';
                    boundaryRight --;
                    i++;
                }
            }

            if(list.size() == matrix.length * matrix[0].length)
                break;
        }

        return list;
    }
}
