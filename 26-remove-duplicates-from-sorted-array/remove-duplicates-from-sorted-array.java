class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int previous =nums[0];
        int temp=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==previous)
            continue;
            nums[temp+1]=nums[i];
            previous = nums[i];
            temp++;
        }
        return temp+1;

        
    }
}