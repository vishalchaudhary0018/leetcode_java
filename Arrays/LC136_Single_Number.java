/**
 * LC136_Single_Number
 */
public class LC136_Single_Number {

  
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result = result ^ num;
        }

        return result;
    }
    public static void main(String[] args) {
      LC136_Single_Number s= new LC136_Single_Number();
int x=s.singleNumber(new int[]{1,2,2});
System.out.println(x);
    }
}
