package leetcode.array.top100liked;

//https://leetcode.cn/problems/rotate-array
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int steps = k % len;
        //new index = (orig + steps) % length

        int[] newArray = new int[len];
        for(int i = 0; i < len; i++) {
            newArray[(i+steps)%len] = nums[i];
        }

        for(int i = 0; i < len; i++) {
            nums[i] = newArray[i];
        }
    }
}
