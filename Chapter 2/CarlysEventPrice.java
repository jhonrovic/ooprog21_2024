import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("* Carly's makes the food that makes  *");
        System.out.println("*           it a party.               *");
        System.out.println("***************************************");
        System.out.println(" ");
               
        int pricePerGuest = 35; 
        int largeEventThreshold = 50; 

  
        System.out.print("Enter the number of guests: ");
        int numberOfGuests = scanner.nextInt();

       
        int totalPrice = numberOfGuests * pricePerGuest;

        
        boolean isLargeEvent = numberOfGuests >= largeEventThreshold;

        
        System.out.println("Carly's Catering: Delicious meals for every occasion!");
        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + pricePerGuest);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Is this a large event? " + isLargeEvent);

       
            }
}
