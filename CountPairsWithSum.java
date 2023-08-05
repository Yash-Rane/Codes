import java.util.HashMap;
import java.util.Map;

public class CountPairsWithSum {
    public static int countPairsWithSum(int[] arr, int K) {
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : arr) {
            int complement = K - num;
            if (freq.containsKey(complement)) {
                count += freq.get(complement);
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int K = 7;
        int result = countPairsWithSum(array, K);
        System.out.println("Number of pairs with sum " + K + ": " + result);
    }
}







