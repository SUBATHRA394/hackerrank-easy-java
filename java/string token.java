import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Remove leading/trailing spaces and split by non-alphabetic characters
        String[] tokens = s.trim().split("[^A-Za-z]+");

        // Handle case where string is empty or has no alphabetic tokens
        if (tokens.length == 1 && tokens[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
