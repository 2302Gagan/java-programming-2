import java.util.Arrays;

public class Que24 {
    public static int kthSmallest(Integer[] arr, int k)
    {
        Arrays.sort(arr);
        return arr[k - 1];
    }
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 10, 3, 5, 9, 14 };
        int k = 1;
        System.out.print("K'th smallest element is " + kthSmallest(arr, k));
    }
}
