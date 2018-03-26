/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

//Accepted
class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(nums[i])) map.remove(nums[i]);
            else if(!map.containsKey(nums[i])) map.put(nums[i], nums[i]);
        }
        Set set = map.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            singleNumber = (int) me.getValue();
        }
        return singleNumber;
    }
}
