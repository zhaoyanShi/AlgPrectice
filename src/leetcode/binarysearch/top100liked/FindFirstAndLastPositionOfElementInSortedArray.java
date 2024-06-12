package leetcode.binarysearch.top100liked;

//https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/?envType=study-plan-v2&envId=top-100-liked
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int position = binarySearch(nums, target);

        if(position == -1) return new int[]{-1, -1};

        int first = 0, last = 0;
        for (int i = position; i >= 0 ; i--) {
            if(nums[i] == target) first = i;
        }

        for (int i = position; i < nums.length ; i++) {
            if(nums[i] == target) last = i;
        }

        return new int[]{first,last};
    }


    // int[] nums: sorted array
    // return position. If not found, return -1
    int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) /2 + left;
            if(nums[mid] == target )
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
