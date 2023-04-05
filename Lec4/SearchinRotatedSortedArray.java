package Lec4;

public class SearchinRotatedSortedArray {
	
public int search(int[] nums, int target) {
        
        int si = 0;
        int ei = nums.length-1;
        while(si <= ei)
        {
            int mid = (si+ei)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] >= nums[si])
            {
                if(target >= nums[si] && target < nums[mid])
                {
                    ei = mid-1;
                }
                else
                {
                    si = mid+1;
                }
            }
            else
            {
                if(target <= nums[ei] && target > nums[mid])
                {
                    si = mid+1;
                }
                else
                {
                    ei = mid-1;
                }
            }
        }
        return -1;
        
    }

}
