import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

        String result = (n % 2 != 0 || (n >= 6 && n <= 20)) ? "Weird" : "Not Weird";
        System.out.println(result);
        scanner.close();
    }
}
