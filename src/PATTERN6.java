public class PATTERN6 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int row = 0; row <2*n; row++) {
            int total = row>n?2*n-row:row;
            int totalSpace = n-total;
            for (int s = 0; s<totalSpace;s++){
                System.out.print(" ");
            }
            for (int col = 0; col <total ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
