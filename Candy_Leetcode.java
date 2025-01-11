class Solution {
    // TC - o(2N). SC - o(n)
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        left[0] = 1;

        for(int i=1;i<n;i++){                   // o(N)
            if(ratings[i] > ratings[i-1]){
                left[i] = left[i-1]+1;
            }
            else{
                left[i] = 1;
            }
        }

        int curr = 1;
        int right = 1;
          int sum = 0;  // Changed from Math.max(1,left[n-1]) to 0

        for(int i = n-1; i>=0; i--) {
            if(i < n-1 && ratings[i] > ratings[i+1]) {
                curr = right + 1;
                right = curr;
            } else {
                curr = 1;
                right = 1;
            }
            sum += Math.max(left[i], curr);
        }

        return sum;
    }
}
