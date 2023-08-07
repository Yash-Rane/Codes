import java.util.Scanner;

public class RotateArrayLeft {
    public static void rotateLeft(int[] arr, int positions) {
        int length = arr.length;
        positions = positions % length; // Handle cases where positions > length
        
        int[] rotatedArray = new int[length];
        
        for (int i = 0; i < length; i++) {
            int newIndex = (i + length - positions) % length;
            rotatedArray[newIndex] = arr[i];
        }
        
        System.arraycopy(rotatedArray, 0, arr, 0, length);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number of positions to rotate left: ");
        int N = scanner.nextInt();
        
        rotateLeft(array, N);
        
        System.out.println("Array after left rotation:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
