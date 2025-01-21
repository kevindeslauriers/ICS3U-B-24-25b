package day2;

public class ToxicNumbers {
    public static void main(String[] args) {
        // Test cases
        System.out.println(toxicSum(new int[]{1, 2, 6, 4}));  // Output: 1
        System.out.println(toxicSum(new int[]{1, 2, 3, 6, 4}));  // Output: 3
        System.out.println(toxicSum(new int[]{6, 1, 2, 3, 4}));  // Output: 9
        System.out.println(toxicSum(new int[]{6, 1, 2, 3, 6, 4}));  // Output: 2
        System.out.println(toxicSum(new int[]{1, 2, 3, 4, 5}));  // Output: 15
        System.out.println(toxicSum(new int[]{1, 2, 6, 7, 3}));  // Output: 4
    }

    // Method to calculate the sum excluding numbers adjacent to a 6
    public static int toxicSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // If the previous number was a 6, skip the current number
            if (!((i > 0 && nums[i - 1] == 6) || nums[i] == 6 || (i < nums.length - 1 && nums[i + 1] == 6))) {
                sum += nums[i];
            }
        }

        return sum;
    }
}

