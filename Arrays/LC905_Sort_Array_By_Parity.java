 /**
  * 905_Sort_Array_By_Parity
  */
 public class LC905_Sort_Array_By_Parity {
 
   
 
    public int[] sortArrayByParity(int[] nums) {
        int [] newArr=new int[nums.length];
        int index = 0;

for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
        newArr[index] = nums[i];
        index++;
    }
}
for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 != 0) {
        newArr[index] = nums[i];
        index++;
    }
}
return newArr;
        
    }

    public static void main(String [] args){
        LC905_Sort_Array_By_Parity s=new LC905_Sort_Array_By_Parity();
        int [] arr=s. sortArrayByParity(new int [] {3,1,2,4});
        for (int i : arr) {
         System.out.println(i);
        }
    }
}