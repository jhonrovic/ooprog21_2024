import java.util.Scanner;

public class Triangle{

    public static void main(String[] args) {
        int rows = 7;

        for (int i = 1; i <= rows; i++) {
            
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("T ");
            }
            System.out.println();
        }
    }
}
