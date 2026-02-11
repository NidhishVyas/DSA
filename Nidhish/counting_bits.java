//brute 
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i = 1; i <= n; i++){
            int count = 0;
            int temp = i;
            while(temp>0){
                if(temp%2 == 1) count++;
                temp /= 2;
            }
            ans[i] = count;
        }
        return ans;
    }
}

//optimal
class Solution {
    public int[] countBits(int n) {

        // Array to store number of 1s for all numbers from 0 to n
        int[] bits = new int[n + 1];

        // bits[0] is 0 by default since 0 has no set bits

        // Loop through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {

            /*
             i >> 1  : right shift divides i by 2 (drops the last binary bit)
             (i & 1) : checks if the last bit of i is 1 (i is odd)

             If i is even:
               last bit = 0 → (i & 1) = 0
             If i is odd:
               last bit = 1 → (i & 1) = 1

             Number of 1s in i =
             number of 1s in (i / 2) + last bit
            */
            bits[i] = bits[i >> 1] + (i & 1);
        }

        // Return the filled array
        return bits;
    }
}
