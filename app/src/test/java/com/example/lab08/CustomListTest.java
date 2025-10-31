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
    @Test
    public void deleteCity_removesExisting() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary","AB");
        City edmonton = new City("Edmonton","AB");
        list.addCity(calgary);
        list.addCity(edmonton);

        list.deleteCity(calgary);     // not implemented yet

        assertFalse(list.hasCity(calgary));
        assertTrue(list.hasCity(edmonton));
    }

    @Test
    public void deleteCity_missingDoesNothing() {
        CustomList list = new CustomList();
        list.addCity(new City("Calgary","AB"));

        list.deleteCity(new City("Vancouver","BC")); // not present

        assertTrue(list.hasCity(new City("Calgary","AB")));
    }

    @Test
    public void countCities_isZero_initially() {
        assertEquals(0, new CustomList().countCities());
    }

    @Test
    public void countCities_increases_afterAdds() {
        CustomList list = new CustomList();
        list.addCity(new City("Calgary","AB"));
        list.addCity(new City("Edmonton","AB"));
        assertEquals(2, list.countCities());
    }
}

