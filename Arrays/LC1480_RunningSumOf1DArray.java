/*
 * LeetCode 1480: Running Sum of 1D Array
 * Difficulty: Easy
 * Pattern: Prefix Sum
 *
 * Approach:
 * Keep adding the previous running sum to the current element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Mistake:
 * Add your mistake here after solving.
 *
 */

class  LC1480_RunningSumOf1DArray{

     public int[] runningSum(int[] nums) {
        int  sum=0;
    for (int i=0 ;i<nums.length;i++){
      sum=sum+nums[i];
      nums[i]=sum;
      
    }
     return nums ;
    }
    public static void main(String[] args) {
        LC1480_RunningSumOf1DArray s =new  LC1480_RunningSumOf1DArray();
      int [] arr=s.runningSum(new int [] {1,2,3,4});
      for(int x: arr){
        System.out.println(x);
      }
        
       
    }
}  
