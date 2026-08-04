class LC27_Remove_Element {

    public int removeElement(int[] nums, int val) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {

       LC27_Remove_Element s = new LC27_Remove_Element();

        int[] nums = {3, 2, 2, 3};

        int k = s.removeElement(nums, 3);

        System.out.println("Remaining elements: " + k);

        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}