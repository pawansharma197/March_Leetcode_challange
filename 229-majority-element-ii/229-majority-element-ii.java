class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int nums1 = -1;
        int nums2 = -1 ;
        
        int c1 = 0 ;
        int c2 = 0 ;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]==nums1)c1++;
            else if(nums[i]==nums2) c2++;
            else if(c1==0){
                nums1 = nums[i];
                c1 = 1 ;
            }
            else if(c2==0)
            {
                nums2 = nums[i];
                c2=1 ;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        
        List<Integer> ar = new ArrayList<Integer>();
        int count1 = 0 ;
        int count2 = 0 ;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] == nums1)
            {
                count1++;
            }
            else if(nums[i] == nums2)
            {
                count2++;
            }
        }
        
        if(count1 > nums.length/3)
        {
            ar.add(nums1);
        }
        if(count2 > nums.length/3)
        {
            ar.add(nums2);
        }
        
        return ar ;
        
    }
}