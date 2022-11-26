package org.example;

public class Main {
    public static void main(String[] args) {

        Products product1 = new Products("Shirt", "Freeland", 700);
        Products product2 = new Products("Pant", "Grameen-UNIQLO", 2500);
        Products product3 = new Products("T-shirt", "Heavy Metal T-shirt", 500);

        Admin admin1 = new Admin("Admin1");

        admin1.AddProducts(product1.Name, product1.Group, product1.Price);
        admin1.AddProducts(product2.Name, product2.Group, product2.Price);
        admin1.AddProducts(product3.Name, product3.Group, product3.Price);


        System.out.println("-Admin Dashboard-");
        admin1.ViewProducts();
        Customer customer1 = new Customer("Customer1");

//        Customer adds products in cart

        customer1.AddToCart(product1);
        customer1.AddToCart(product2);
        System.out.println("-Cart-");
        customer1.ViewCartProducts();
        System.out.println();
        System.out.println("Total Price: " + customer1.cart.SumTotalPrice());
        System.out.println("-Payment-");
        customer1.payment.MakePayment(customer1.cart.SumTotalPrice());
        System.out.println("-Guest View-");
        Guest guest1 = new Guest();
        guest1.ViewProducts(admin1);
        guest1.GetRegistered("guest-noor");
    }
}