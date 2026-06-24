import java.util.Scanner;

public class _12_MergeSortedArrayWithoutExtraSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of elements in array 1: ");
        int m = sc.nextInt();
        System.out.println("Enter no.of elements in array 2: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into array 1: ");
        int[] nums1 = new int[m+n];

        for(int i=0;i<m;i++)
            nums1[i] = sc.nextInt();

        System.out.println("Enter elements into array 1: ");
        int[] nums2 = new int[n];

        for(int i=0;i<n;i++)
            nums2[i] = sc.nextInt();

        sort(m, n, nums1, nums2);

        System.out.println("Array after sort: ");
        for(int ele : nums1)
            System.out.print(ele + "");
    }

    private static void sort(int m, int n, int[] nums1, int[] nums2){
        int i=m-1, j=n-1, k=nums1.length-1;

        while(j>=0){
            if(i>=0 && nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
