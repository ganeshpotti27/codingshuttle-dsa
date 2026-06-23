import java.util.Arrays;
import java.util.Scanner;

public class _10_ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements in an array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into an array: ");
        int[] nums = new int[n];

        for (int i=0;i<n;i++)
            nums[i] = sc.nextInt();

        System.out.println("Length of Unsorted continuous subarray: "+findLength(nums));
    }

    private static int findLength(int[] nums) {
        int n = nums.length;
        int[] arr = Arrays.copyOf(nums, n);
        Arrays.sort(arr);

        int left = 0, right = n-1;

        while(left<n && nums[left]==arr[left])
            left++;

        while(right>=0 && nums[right]==arr[right])
            right--;

        if(left== n)
            return 0;
        return right - left + 1;
    }
}
