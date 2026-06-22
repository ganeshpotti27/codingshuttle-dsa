import java.util.Scanner;

public class _02_TwoSumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements in array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into array (sorted): ");
        int[] nums = new int[n];

        for(int i=0 ; i<n; i++)
            nums[i] = sc.nextInt();

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        int[] res = twoSumSorted(nums, target);
        System.out.println("Indexes: ["+res[0]+","+res[1]+"]");
    }

    private static int[] twoSumSorted(int[] nums, int target) {
        int i=0, j=nums.length-1;

        while (i<j){
            int sum = nums[i] + nums[j];
            if(sum==target){
                return new int[]{i,j};
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }

        return new int[]{-1,-1};
    }
}
