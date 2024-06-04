package leetcode.binarysearch.top100liked;

//https://leetcode.cn/problems/search-insert-position/?envType=study-plan-v2&envId=top-100-liked
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = nums.length;
        while(left <= right) {
            int mid = (right - left) / 2 + left;
            if(target <= nums[mid]) {
                position = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return position;
    }
}
