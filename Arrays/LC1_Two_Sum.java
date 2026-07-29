public class LC1_Two_Sum {
   

    public int[] twoSum(int[] nums, int target) {
        int firstIndex=0;
        int secondIndex=0;
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){

                    firstIndex=i;
                    secondIndex=j;
               
                }
            }
        }
        return new int[] {firstIndex,secondIndex};
        
 }
    
       public static void main(String[] args){
        LC1_Two_Sum s=new LC1_Two_Sum();
        int [] arr=s. twoSum(new int[] {2,7,11,15}, 9);
        for (int x:arr){
            System.out.println(x);
        }

    }
}


