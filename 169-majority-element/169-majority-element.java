class Solution {
    public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
//         for(int i = 0 ; i<nums.length ; i++)
//         {
//             if(hs.containsKey(nums[i]))
//             {
//                 hs.put(nums[i] , hs.get(nums[i])+1);
//             }
//             else
//             {
//                 hs.put(nums[i] ,1);
//             }
//         }
        
//         int n = nums.length/2 ;
//         int ans = 0 ;
        
//         for(Map.Entry<Integer,Integer> mp : hs.entrySet())
//         {
//             if(mp.getValue()>n)
//             {
//                 ans = mp.getKey();
//                 break;
//             }
//         }
//         return ans ;
// //         int count = 0 ; 
// //         int res = 0 ;
        
// //         for(int i=0 ; i<nums.length ; i++)
// //         {
// //             if(count ==0)
// //             {
// //                 res = nums[i];
// //             }
// //             if(res == nums[i])
// //             {
// //                 count++;
// //             }
// //             else
// //             {
// //                 count--;
// //             }
// //         }
        
        
//         // For this problem we can have total 3 approch 
//         //     1) Sorting and then return mid elem
//         //     2) Hash Map -->> O(n) , O(n)
//         //     3) Morre Algorithm --> )(n)
            
        int n = nums.length ;
        int count = 0 ;
        int candidate = 0 ;
        
        for(int i=0 ; i<n ; i++)
        {
            if(count==0)
            {
                candidate = nums[i];
            }
            if(candidate == nums[i]) {count ++;}
            else count --;
        }
        
        return candidate ;
    
        
    }
}