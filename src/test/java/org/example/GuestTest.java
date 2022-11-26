package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    static Admin admin;
    static Guest guest;


    @BeforeAll
    static void init(){
        admin = new Admin("Admin");
        guest = new Guest();

        admin.AddProducts("paper", "stationery", 10);
        admin.AddProducts("pen", "stationery", 15);

    }

    @Test
    void viewProducts() {

        assertEquals(2, guest.ViewProducts(admin).size());
        assertEquals("paper", guest.ViewProducts(admin).get(0).Name);
    }

    @Test
    void getRegistered() {
        guest.GetRegistered("noor");
        assertEquals("noor", guest.GetRegistered("noor").Name);
    }
}