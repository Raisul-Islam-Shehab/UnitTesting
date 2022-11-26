package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    static Products product1;
    static Products product2;

    @BeforeAll
    static void init(){
        product1 = new Products("T-shirt", "Heavy Metal t-shirt", 500);
        product2 = new Products("Pant", "Freeland", 1500);
    }


    @Test
    void setId() {
        product1.setId(1);
        assertEquals(1, product1.Id);
    }

    @Test
    void setName() {
        product1.setName("shirt");
        assertEquals("shirt", product1.Name);
    }

    @Test
    void setGroup() {
        product2.setGroup("freeland");
        assertEquals("freeland", product2.Group);
    }

    @Test
    void setPrice() {
        product1.setPrice(1800);
        assertEquals(1800, product1.Price);
    }
}