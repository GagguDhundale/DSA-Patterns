import java.util.Scanner;
public class middilediamond {
    public static void main(String[] args) {
        int n = 5;
        // left side uppar traingle
        for (int row = n; row >= 1; row--) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // left lower
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for right uppar
        for (int row = n; row >= 1; row--) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= row; cols++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}