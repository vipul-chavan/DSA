class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;

        int Sum = (N*(N+1))/2;

        int s=0;

        for(int i=0;i<N;i++)
        {
            s+=nums[i];

        }

        int missingNo = Sum-s;

        return missingNo;
        
        
    }
}