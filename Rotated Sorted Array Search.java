public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {
        int n = A.length;
        int lo=0;
        int hi = n-1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(A[mid] == B){
                return mid;
            }
            // else it is in either right or left half
            else if(A[lo] < A[mid]){
                //mens 1st half sorted lo to mid 
               if(B >= A[lo] && B <= A[mid-1]){
                   //ele in 1st part
                   hi = mid-1;
               }
               else{
                   lo= mid+1;
               }
            }
            else{
                //2nd half is sorted
                if(B >= A[mid+1] && B<= A[hi]){
                    lo = mid+1;
                }
                else{
                    hi = mid-1;
                }
            }
        }
        return -1;
    }
}
