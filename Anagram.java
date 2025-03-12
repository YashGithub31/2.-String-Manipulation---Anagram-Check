import java.util.*;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        System.out.println("Output: " + areAnagrams(str1, str2));
        scanner.close();
    }
}
