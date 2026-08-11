
public class LC169_Majority_Element {

   
    public int majorityElement(int[] nums) {
        int count=0;
        int element=0;
        for(int i=0; i<nums.length;i++){
          if(count==0){
            element=nums[i];
          }

            if(nums[i]==element){
                count++;
            }
            else {
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args){
       LC169_Majority_Element s = new LC169_Majority_Element();
        int x=s.majorityElement(new int [] {3,3,4});
        System.out. println(x);
    }
}
