public class LC1295_Find_Numbers_with_Even_Number_of_Digits {
    int findNumbers(int[] nums) {
        int count=0;
       
        for (int i=0; i<nums.length;i++){
             int lastNum=0;
            while(nums[i]>0){
         
          nums[i]=nums[i]/10;
          lastNum++;
          }
        
            if(lastNum%2==0){
                count++;
            }
            }
         return count;
        }
           

        public static void main(String[] args) {
            LC1295_Find_Numbers_with_Even_Number_of_Digits  s= new LC1295_Find_Numbers_with_Even_Number_of_Digits();

            int x=s.findNumbers(new int[] {11,2,3,4,5,6});
            System.out.println(x);
        }
        
    
}

