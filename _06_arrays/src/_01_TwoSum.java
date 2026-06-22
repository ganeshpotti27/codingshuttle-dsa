import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements in array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into Array");
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        int[] res = twoSum(nums, target);
        System.out.println("Indexes: ["+ res[0] + "," + res[1]+"]");
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i= 0; i < nums.length ; i++){
            int diff = target - nums[i];
            if(mp.containsKey(diff)){
                return new int[]{mp.get(diff), i};
            }
            mp.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
