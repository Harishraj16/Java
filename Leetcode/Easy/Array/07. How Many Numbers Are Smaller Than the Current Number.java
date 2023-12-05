class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy =   nums.clone();
        Arrays.sort(copy);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(copy[i])){
                map.put(copy[i],i);
            }
        }   
        for(int i=0;i<nums.length;i++){
            nums[i]= map.get(nums[i]);
        }

        return nums;
    }
}
