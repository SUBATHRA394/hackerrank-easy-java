import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        // Reverse the string
        String reversed = new StringBuilder(A).reverse().toString();
        
        // Check if original and reversed strings are equal
        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
