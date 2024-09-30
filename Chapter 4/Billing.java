public class Billing {

        public void computeBill(double price) {
        double total = price * 1.08; 
        System.out.println("The total price for the bill is: $" + total);
    }

        public void computeBill(double price, int quantity) {
        double subtotal = price * quantity; 
        double total = subtotal * 1.08;
        System.out.println("The total price for the bill is: $" + total);
    }

    
    public void computeBill(double price, int quantity, int discount) {
        double subtotal = price * quantity; 
        double total = subtotal * 1.08; 
        double discountAmount = (discount / 100.0) * total;
        total -= discountAmount; 
        System.out.println("The total price for the bill is: $" + total);
    }

    
    public static void main(String[] args) {
        Billing billing = new Billing();

        
        billing.computeBill(23.2);                  
        billing.computeBill(23.2, 2);                
        billing.computeBill(23.2, 3, 10);            
    }
}
