public class LC283_Move_Zeroes {


    public void moveZeroes(int[] nums) {

        int index = 0;

       
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        LC283_Move_Zeroes s = new LC283_Move_Zeroes();

        int[] nums = {0, 1, 0, 3, 12};

        s.moveZeroes(nums);

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}

