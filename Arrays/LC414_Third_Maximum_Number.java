
public class LC414_Third_Maximum_Number {

   
    public int thirdMax(int[] nums) {
       long firstNo = Long.MIN_VALUE;
       long secondNo = Long.MIN_VALUE;
       long thirdNo = Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==firstNo|| nums[i]==secondNo||nums[i]==thirdNo){
                continue;
            }
             if (nums[i] > firstNo) {
                thirdNo = secondNo;
                secondNo = firstNo;
                firstNo = nums[i];
            }

              else if (nums[i] > secondNo) {
                thirdNo = secondNo;
                secondNo = nums[i];
            }
             else if (nums[i] > thirdNo) {
                thirdNo = nums[i];
            }

        }
               // agar third maximum nahi mila
        if (thirdNo == Long.MIN_VALUE) {
            return (int) firstNo;
        }
        return (int) thirdNo;
    }

    public static void main(String[] args){
       LC414_Third_Maximum_Number s= new LC414_Third_Maximum_Number();
        int x= s.thirdMax(new int [] {3,2,1});
        System.out.println(x);
    }
}
