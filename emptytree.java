public class emptytree {
    public static void main(String[] args) {
        int n = 5;
        // for uppar trangle
        for(int row = 1 ; row <= n ; row++){
            for(int space = 1 ; space <= n - row ; space ++){
                System.out.print(" ");
            }
            for(int cols = 1 ; cols <= row ; cols++){
                System.out.print(" *");
            }
            System.out.println();
        }
        // lower traingle
        for(int row = n -1 ; row >= 1 ; row--){
            for(int space =1 ; space <= n - row ; space ++){
                System.out.print(" ");
            }
            for(int cols = 1 ; cols <= row ; cols++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
