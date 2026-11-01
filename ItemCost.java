public class ItemCost {
    public static void main(String[] args) {

        String itemName = "Notebook";
        double itemPrice = 500;
        int quantity = 4;

        double totalCost = itemPrice * quantity;

        System.out.println("Item name: " + itemName);
        System.out.println("Item price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: " + totalCost);
    }
}