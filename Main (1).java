

public class Main{

    public static String reverseString(String str) {
        
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        
  
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "Challenge";
        String reversed = reverseString(input);
        
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}

