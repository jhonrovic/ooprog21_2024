import java.util.Scanner;

public class SammysRentalPrice {
   
    public static void main(String[] args) {
      
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
       System.out.println("S Sammy's makes it fun in the sun. S");
       System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
       System.out.println(" ");
             
         int costPerHour = 40; 
         int costPerMinute = 1; 
         

        System.out.print("Enter the number of minutes rented: ");
        int totalMinutes = scanner.nextInt();

      
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

       
        int totalCost = (hours * costPerHour) + (minutes * costPerMinute);

    
        System.out.println("Sammy's Seashore Supplies: Your beach adventure starts here!");
        System.out.println("Hours rented: " + hours);
        System.out.println("Minutes rented: " + minutes);
        System.out.println("Total cost: $" + totalCost);

       
       
    }
}
