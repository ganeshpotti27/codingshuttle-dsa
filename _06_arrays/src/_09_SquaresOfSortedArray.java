import java.util.Scanner;

public class _09_SquaresOfSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements in an array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into array: ");
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();

        int[] res = squares(nums);

        System.out.println("Squares: ");
        for (int ele : res)
            System.out.print(ele+ " ");
    }

    private static int[] squares(int[] nums) {
        int[] res = new int[nums.length];

        int left=0, right= nums.length-1;

        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[i] = nums[left] * nums[left];
                left++;
            }else{
                res[i] = nums[right] * nums[right];
                right--;
            }
        }

        return res;
    }
}
