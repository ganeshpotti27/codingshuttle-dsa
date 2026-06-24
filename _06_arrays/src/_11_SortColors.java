import java.util.Scanner;

public class _11_SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements into array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into array: ");
        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        sortColors(nums);

        System.out.println("Array after sort based colors: ");
        for(int ele : nums)
            System.out.print(ele + " ");
    }

    private static void sortColors(int[] nums) {
        int i=0, j=0, k=nums.length-1;
        while(j<=k){
            if(nums[j]==0){
                swap(nums, i, j);
                i++;
                j++;
            }else if(nums[j]==1){
                j++;
            }else{
                swap(nums,j,k);
                k--;
            }
        }
    }

    private static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
