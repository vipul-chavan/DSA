class Solution {
    public int singleNumber(int[] nums) {
        

        // for(int i=0;i<nums.length;i++)
        // {   
        //     int num=nums[i];

        //     int cnt=0;

        //     for(int j=0;j<nums.length;j++)
        //     {
        //         if(nums[j]==num)
        //         {
        //             cnt ++;
        //         }
        //     }

        //     if(cnt==1)
        //     {
        //         return num;

        //     }
        // }

        // return -1 ;

        //optimal apporch 

        int n =0;

        for(int i=0;i<nums.length;i++)
        {
            n^=nums[i];
        }

        return n;

        
    }
}