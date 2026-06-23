import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
    Output: 2
    Explanation:
    The two tuples are:
    1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
    2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
 */

public class _06_4SumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements in each array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into array one by one: ");
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        int[] nums3 = new int[n];
        int[] nums4 = new int[n];

        for(int i=0;i<n;i++)
            nums1[i] = sc.nextInt();

        for(int i=0;i<n;i++)
            nums2[i] = sc.nextInt();

        for(int i=0;i<n;i++)
            nums3[i] = sc.nextInt();

        for(int i=0;i<n;i++)
            nums4[i] = sc.nextInt();

        System.out.println("No.of Pairs with sum equals to 0: "+ fourSumPairsCount(nums1, nums2, nums3, nums4));
    }

    private static int fourSumPairsCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int cnt = 0;
        Map<Integer, Integer> mp = new HashMap<>();

        for(int ele1 : nums1){
            for(int ele2 : nums2){
                int sum = ele1 + ele2;
                mp.put(sum, mp.getOrDefault(sum,0)+1);
            }
        }

        for(int ele3 : nums3){
            for(int ele4 : nums4){
                int sum = -(ele3 + ele4);
                cnt += mp.getOrDefault(sum,0);
            }
        }
        return cnt;
    }
}
