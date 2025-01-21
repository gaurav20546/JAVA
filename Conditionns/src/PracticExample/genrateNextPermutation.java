package PracticExample;

import java.util.Arrays;

public class genrateNextPermutation 
{
    public void nextPermutation(int[] nums) 
    {
        int n = nums.length;
      //  System.out.println("array length :"+n);
        int i = n - 2;
        //   System.out.println("i value :"+i);
        while (i >= 0 && nums[i] >= nums[i + 1]) 
        {
            i--;
            System.out.println(i);
        }

        if (i >= 0)
        {
            int j = n - 1;
            while (nums[j] <= nums[i]) 
            {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Original array: " + Arrays.toString(nums));

        genrateNextPermutation solution = new genrateNextPermutation();
        solution.nextPermutation(nums);

        System.out.println("Next permutation: " + Arrays.toString(nums));
    }
}
