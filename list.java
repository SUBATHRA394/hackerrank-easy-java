import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read initial list size and elements
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Read number of queries
        int q = sc.nextInt();
        sc.nextLine(); // Consume the newline

        for (int i = 0; i < q; i++) {
            String command = sc.nextLine().trim();

            if (command.equals("Insert")) {
                // Next line contains index and value
                String[] parts = sc.nextLine().split(" ");
                int index = Integer.parseInt(parts[0]);
                int value = Integer.parseInt(parts[1]);
                list.add(index, value);
            } else if (command.equals("Delete")) {
                // Next line contains index to remove
                int index = Integer.parseInt(sc.nextLine().trim());
                list.remove(index);
            }
        }

        // Print the final list
        for (int num : list) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
