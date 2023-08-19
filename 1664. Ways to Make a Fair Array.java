//brute force 0(n*n) space- 0(n)

class Solution {
    public int waysToMakeFair(int[] nums) {
        //tc = o(n*n) sc = 0(n)
        //brute force try to remove all element one by oone 
        int n = nums.length;
        int count =0;
        for(int i=0;i<n;i++){
           int[] copy = new int[n-1];
           int k =0;
           for(int j = 0;j<n;j++){
               if(j == i) continue;
               else{
                   copy[k] = nums[j];
                   k++;
               }
           }
           //copy complete find odd and even sum 
           int oddsum = 0;
           int evensum = 0;
           for(int j=0;j<copy.length;j++){
               if(j%2 == 0){
                   evensum += copy[j];
               }
               else{
                   oddsum += copy[j];
               }
           }
           if(oddsum == evensum){
               count++;
           }
        }
        return count;
    }
}
//optimize
//tc - 0(n) sc - 0(n)
class Solution {
    public int waysToMakeFair(int[] nums) {
        //tc = o(n*n) sc = 0(n)
        //brute force try to remove all element one by oone 
        int n = nums.length;
        int count =0;
        int[] even = new int[n];
        int[] odd = new int[n];

        int evensum = 0;
        int oddsum = 0;
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                evensum += nums[i];
            }
            else{
                oddsum += nums[i];
            }
           even[i] = evensum;
           odd[i] = oddsum; 
        }
      //remove each element one by one and calculate
      for(int i=0;i<n;i++){
          int evens =0;
          int odds =0;
          if(i == 0){
              odds = even[n-1]-even[0];
              evens = odd[n-1];
          }
          else{
             odds = odd[i-1] + even[n-1] - even[i];
             evens = even[i-1] + odd[n-1] - odd[i];
          }
          if(evens == odds) count++;
      }
      return count;

    }
}


//optimize
