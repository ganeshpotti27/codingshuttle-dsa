import java.util.Scanner;

/*
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */

public class _07_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements in an array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into an array: ");
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();

        int idx = removeDuplicates(nums);

        System.out.println("Array after removing duplicates: ");
        for(int i=0;i<idx;i++)
            System.out.print(nums[i]+ " ");
    }

    private static int removeDuplicates(int[] nums) {
        int i=0, j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                swap(nums, i, j);
            }
            j++;
        }
        return i+1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
