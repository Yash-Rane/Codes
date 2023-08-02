public class CountOccurrences {

    public static int countOccurrences(int[] arr, int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            } else if (arr[i] > x) {
               
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] sortedArray = {0, 1, 1, 0, 2, 3, 4};
        int numberX = 2;
        int count = countOccurrences(sortedArray, numberX);
        System.out.println("Number of occurrences of " + numberX + " in the array: " + count);
    }
}