import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]}
 */

public class _03_3Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of elements in an array: ");
        int n= sc.nextInt();

        System.out.println("Enter elements into array: ");
        int[] nums = new int[n];

        for (int i=0;i<n;i++)
            nums[i] = sc.nextInt();

        List<List<Integer>> list = threeSum(nums);

        System.out.println("3 Sum Pairs: ");

        for(List<Integer> row : list){
            for (Integer ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;

            int j = i+1, k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==0){
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (j<k && nums[j]==nums[j-1])
                        j++;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return res;
    }
}
