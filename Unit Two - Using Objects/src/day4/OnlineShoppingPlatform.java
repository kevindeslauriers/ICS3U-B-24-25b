package day4;

public class OnlineShoppingPlatform {
    public static void main(String[] args) {
        // 1. Create two products
        Product laptop = new Product("Laptop", 999.99, 5);
        Product headphones = new Product("Headphones", 199.99, 10);

        // 2. Make a customer called alice
        Customer alice = new Customer("Alice", 1200.00);

        // 3. Add the laptop to Alice's cart
        alice.addToCart(laptop);

        // 4. Add the headphones to Alice's cart
        alice.addToCart(headphones);

        // 5. Show what's in Alice's cart
        String cartContents = alice.getCart();
        System.out.println("Alice's Cart: " + cartContents);

        // 6. Calculate the total cost
        double totalCost = laptop.getPrice() + headphones.getPrice();

        // 7. Print the total cost
        System.out.println("Total Cost: " + totalCost);


        // 9. Create an order for the laptop
        Order orderForLaptop = new Order(alice, laptop);

        // 10. Confirm the order
        String orderConfirmation = orderForLaptop.confirmOrder();
        System.out.println("Order Confirmation: " + orderConfirmation);
    }
}
