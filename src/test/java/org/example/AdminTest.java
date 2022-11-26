package org.example;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class AdminTest {

    static Admin admin1;
    static Admin admin2;
    static Products product1;
    static Products product2;
    static Products product3;


    @BeforeAll
    static void init(){
        admin1 = new Admin("admin1");
        admin2 = new Admin("admin2");

        product1 = new Products("pant", "freeland", 1500);
        product2 = new Products("shirt", "freeland", 700);
        product3 = new Products("t-shirt", "heavy-metal", 500);

        admin1.AddProducts(product1.Name, product1.Group, product1.Price);
        admin1.AddProducts(product2.Name, product2.Group, product2.Price);
        admin1.AddProducts(product3.Name, product3.Group, product3.Price);
    }

    @Test
    void ProductsItemsSizeIsThree() {
        assertEquals(3, admin1.productItems.size());
    }

    @Test
    void viewProducts() {

        assertEquals(3, admin1.productItems.size());

        assertEquals("pant", admin1.productItems.get(0).Name);
        assertEquals("freeland", admin1.productItems.get(0).Group);
        assertEquals(15, admin1.productItems.get(0).Id);
        assertEquals(1500, admin1.productItems.get(0).Price);
    }

    @Test
    void addProducts() {
        admin2.AddProducts(product1.Name, product1.Group, product1.Price);
        assertEquals(1, admin2.productItems.size());

        admin2.AddProducts(product2.Name, product2.Group, product2.Price);
        assertEquals(2, admin2.productItems.size());

        admin2.AddProducts(product3.Name, product3.Group, product3.Price);
        assertEquals(3, admin2.productItems.size());
    }

    @Test
    void deleteProducts() {
        admin1.DeleteProducts(1);
        assertEquals(2, admin1.productItems.size());

        admin1.DeleteProducts(0);
        assertEquals(1, admin1.productItems.size());

    }

    @Test
    void modifyProducts() {
        admin2.AddProducts(product1.Name, product1.Group, product1.Price);
        admin2.AddProducts(product2.Name, product2.Group, product2.Price);
        admin2.AddProducts(product3.Name, product3.Group, product3.Price);


        admin2.ModifyProducts(0,"Pant", "freeland", 1500);
        assertEquals("Pant", admin2.productItems.get(0).Name);
        assertEquals("freeland", admin2.productItems.get(0).Group);
        assertEquals(1500, admin2.productItems.get(0).Price);
    }
}