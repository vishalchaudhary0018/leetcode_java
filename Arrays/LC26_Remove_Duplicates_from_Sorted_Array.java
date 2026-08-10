
public class LC26_Remove_Duplicates_from_Sorted_Array {

    public int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
               nums[index]=nums[i+1];
               index++;
            }
        
         }
         for (int i : nums) {
            System.out.println(i);
         }
        return index; 
    }
   public static void main(String [] args){
    LC26_Remove_Duplicates_from_Sorted_Array s= new LC26_Remove_Duplicates_from_Sorted_Array();
    int x=s.removeDuplicates(new int [] {1,1,2});
    
    System.out.println("total uniqe index "+ x);
   }
}
   
