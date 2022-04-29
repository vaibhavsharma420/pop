class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int element =0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
                element=nums[i];
            if(element==nums[i])
            {
                count=count+1;
            }
            else count=count-1;
        }
        return element;
        
    }
}