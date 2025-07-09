public class pyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1 ; row <= n ; row++){
            for(int space = 1 ; space <= n - row ; space++){
                System.out.print(" ");
            }
            for(int cols = 1 ; cols <= row ; cols ++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
