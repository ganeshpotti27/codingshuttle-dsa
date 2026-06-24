import java.util.Scanner;

public class _13_LongestMountainInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements in array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into array: ");
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();

        System.out.println("Longest Mountain: "+ findLongest(nums));
    }

    private static int findLongest(int[] nums) {
        int longest = 0;

        int n = nums.length;

        if(n<3) return 0;

        for(int i=1;i<n-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                int left = i-1, right = i+1;
                while(left>0 && nums[left]>nums[left-1])
                    left--;

                while(right<n-1 && nums[right]>nums[right+1])
                    right++;

                longest = Math.max(longest, right-left+1);
            }
        }

        return longest;
    }
}
