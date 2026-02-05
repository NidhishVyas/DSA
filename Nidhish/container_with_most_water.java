//brute
class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int n = height.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                result = Math.max(result, area);
            }
        }
        return result;
    }
}

//optimal
class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int n = height.length;
        int i = 0, j = n - 1;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            result = Math.max(result, area);
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return result;
    }
}