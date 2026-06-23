import java.util.Scanner;

public class _08_RemoveDuplicatesFromSortedArrayII {
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
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(j==1 || nums[i] != nums[j-2])
                nums[j++] = nums[i];
        }
        return j;
    }
}
