//brute force
class Solution {
    public int[] twoSum(int[] nums, int target) {
      for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
[ 2,5,7,11,15 ] = 26

//better
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int cp = target - nums[i];
            if(map.containsKey(cp)){
                return new int[]{map.get(cp), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}

//two sum II - sorted array
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{left+1, right+1};
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
