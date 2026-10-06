import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================================");
        
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            
            // "%-15s" left-justifies the string within a 15-character width
            // "%03d" pads the integer with leading zeros to ensure exactly 3 digits
            // "%n" prints a platform-independent newline character
            System.out.printf("%-15s%03d%n", s1, x);
        }
        
        System.out.println("================================");
        sc.close();
    }
}




