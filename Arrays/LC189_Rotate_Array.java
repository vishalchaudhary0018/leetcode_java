/**
 * LC189_Rotate_Array
 * not acceptde from java but c++ accept
 */
public class LC189_Rotate_Array {

   
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }

        for (int x : nums) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        LC189_Rotate_Array s = new LC189_Rotate_Array();

        s.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}

   
