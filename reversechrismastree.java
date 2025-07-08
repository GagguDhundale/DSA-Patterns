import java.util.Scanner;
public class reversechrismastree {
    public static void main(String[] args) {
        int n = 5 ;
        for(int row = n ; row >= 1 ; row--){
            for(int space = 1 ; space <= n - row ; space++){
                System.out.print(" ");
            }
            for(int cols = 1 ; cols <= 2 * row -1 ; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
