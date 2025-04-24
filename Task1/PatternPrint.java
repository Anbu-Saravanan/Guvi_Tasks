package AssignmentPurpose.Task1;

public class PatternPrint {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // First decreasing numbers from 5 to i+1
            for (int j = 5; j > i; j--) {
                System.out.print(j);
            }
            // Then repeat the last printed number for remaining places
            for (int k = 0; k < i; k++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
