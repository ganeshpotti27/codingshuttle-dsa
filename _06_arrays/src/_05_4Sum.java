import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _05_4Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements in an array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into Array: ");
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();

        System.out.println("Enter target value: ");
        int target = sc.nextInt();

        List<List<Integer>> res = fourSum(nums, target);

        System.out.println("4 sum pairs: ");
        for(List<Integer> row : res){
            for(int ele : row)
                System.out.print(ele + " ");
            System.out.println();
        }
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4)
            return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n-3 ; i++){
            if(i>0 && nums[i] == nums[i-1])
                continue;

            for(int j = i+1 ; j < n-2 ; j++){
                if(j>i+1 && nums[j]==nums[j-1])
                    continue;

                int k = j+1, l = n-1;
                while(k<l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum==target){
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        k++;
                        l--;

                        while(k<l && nums[k]==nums[k-1])
                            k++;

                        while(k<l && nums[l]==nums[l+1])
                            l--;
                    }else if(sum < target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return res;
    }
}
