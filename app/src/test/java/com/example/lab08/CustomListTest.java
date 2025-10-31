package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void hasCity_returnsTrue_whenCityPresent() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary)); // should FAIL until hasCity is implemented
    }

    @Test
    public void hasCity_returnsFalse_whenCityAbsent() {
        CustomList list = new CustomList();
        assertFalse(list.hasCity(new City("Edmonton", "AB")));
    }
}
