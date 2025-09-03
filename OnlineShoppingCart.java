public class OnlineShoppingCart {

    public static void main(String[] args) {
        
        int[] productPrices = { 3500, 1800, 750 };   

        double totalCartValue = 0;

        System.out.println("--- Calculating Your Cart Total ---");
        System.out.print("Item prices: ");

        
        for (int price : productPrices) {
            System.out.print(price + " ");
            totalCartValue += price;
        }

        System.out.println("\nInitial Cart Total: " + totalCartValue);
        System.out.println("------------------------------------");

        if (totalCartValue > 5000) {
            double discount = totalCartValue * 0.10; 
            System.out.println("Congratulations! Your order exceeds 5000.");
            System.out.println("Applying a 10% discount: -" + String.format("%.2f", discount));
            totalCartValue -= discount;
            System.out.println("Total after discount: " + String.format("%.2f", totalCartValue));
        }

        if (totalCartValue < 2000) {
            System.out.println("\nYour order is less than 2000.");
            System.out.println("Adding a delivery charge: +100.00");
            totalCartValue += 100;
        }

        System.out.println("\n====================================");
        System.out.println("Final Payable Amount: " + String.format("%.2f", totalCartValue));
        System.out.println("====================================");
    }
}
