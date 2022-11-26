package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static Admin admin;


    @BeforeAll
    static void init(){
        admin = new Admin("Admin");

        admin.AddProducts("paper", "stationery", 10);
        admin.AddProducts("pen", "stationery", 15);


    }


    @Test
    void main() {
        assertEquals(2, admin.productItems.size());

        assertEquals("paper", admin.productItems.get(0).Name);
        assertEquals("stationery", admin.productItems.get(0).Group);
        assertEquals(4, admin.productItems.get(0).Id);
        assertEquals(10, admin.productItems.get(0).Price);
    }
}