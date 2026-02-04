//brute force
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    }
}


//optimal 
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int ans[] = new int[nums.length];
        ans [0] = 1; 
        for (int i = 1; i < nums.length; i ++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int suffix = 1;
        for ( int i = nums.length-1; i >= 0; i -- ){
            ans[i] = ans[i] * suffix;
            suffix = suffix * nums[i];
        }
        return ans;
    } 
}
