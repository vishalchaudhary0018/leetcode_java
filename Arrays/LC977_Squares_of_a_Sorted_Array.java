import java.util.Arrays;

class LC977_Squares_of_a_Sorted_Array {

    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {

        LC977_Squares_of_a_Sorted_Array s = new LC977_Squares_of_a_Sorted_Array();

        int[] arr = s.sortedSquares(new int[]{-4, -1, 0, 3, 10});

        for (int x : arr) {
            System.out.println(x);
        }
    }
}