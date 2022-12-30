package com.example;

import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundTest() {
        feline = new Feline();
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();

        assertEquals(expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = cat.getFood();

        assertEquals(expectedList, actualList);
    }
}