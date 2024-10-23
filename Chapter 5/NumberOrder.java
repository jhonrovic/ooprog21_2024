import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        
        int first, second, third;

            if (num1 <= num2 && num1 <= num3) {
            first = num1;
            if (num2 <= num3) {
                second = num2;
                third = num3;
            } else {
                second = num3;
                third = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            first = num2;
            if (num1 <= num3) {
                second = num1;
                third = num3;
            } else {
                second = num3;
                third = num1;
            }
        } else {
            first = num3;
            if (num1 <= num2) {
                second = num1;
                third = num2;
            } else {
                second = num2;
                third = num1;
            }
        }

       
        System.out.println("Ascending order: " + first + " " + second + " " + third);

        
        System.out.println("Descending order: " + third + " " + second + " " + first);

    }
}
