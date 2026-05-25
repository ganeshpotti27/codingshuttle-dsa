import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _00_SortPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        selectionSort(arr);
//        bubbleSort(arr);
//        insertionSort(arr);
        mergeSort(arr, 0, n-1);
        System.out.println("Sorted Array: ");
        for(int ele : arr)
            System.out.print(ele + " ");
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = n-1 ; i >= 0 ; i--){
            for(int j=0 ; j < i ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j = i-1, val = arr[i];
            while (j>=0 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low>=high)
            return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int left = low, right = mid+1;
        List<Integer> list = new ArrayList<>();
        while(left<=mid && right <= high){
            if(arr[left]<=arr[right])
                list.add(arr[left++]);
            else
                list.add(arr[right++]);
        }

        while (left<=mid)
            list.add(arr[left++]);

        while (right<=high)
            list.add(arr[right++]);

        for(int i=low; i<=high;i++)
            arr[i] = list.get(i-low);
    }
}
