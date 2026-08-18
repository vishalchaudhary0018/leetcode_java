/**
 * LC66_Plus_One
 */
public class LC66_Plus_One {

  
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
    public static void main(String[] args) {
      LC66_Plus_One s =new LC66_Plus_One();
      int [] arr =s.plusOne(new int []{1,2,3});
      for (int i : arr) {
         System.out.println(i);
      }
    }
}
