import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Que22 {
    public static void transform(int[] arr)
    {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int rank = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr[entry.getValue()] = rank++;
        }
    }
    public static void main(String[] args)
    {
        int[] A = { 9, 8, 1, 10, 6, 2, 16 };
        System.out.println("Elements are:\n"+java.util.Arrays.toString(A));
        transform(A);
        System.out.println("Rank of the elements:\n"+ Arrays.toString(A));
    }
}
