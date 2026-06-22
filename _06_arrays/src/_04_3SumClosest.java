import java.util.Arrays;
import java.util.Scanner;

public class _04_3SumClosest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements in an array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into array: ");
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        System.out.println("Closest 3Sum: "+ threeSumClosest(nums, target));
    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int j = i+1, k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(target-sum) < Math.abs(target-res))
                    res = sum;
                if (sum == target)
                    return sum;
                else if(sum<target)
                    j++;
                else
                    k--;
            }
        }
        return res;
    }
}
