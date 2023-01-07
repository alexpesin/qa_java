package com.example;

import org.junit.Test;


import java.util.List;
import static org.junit.Assert.*;


public class FelineTest {
    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = feline.eatMeat();

        assertEquals(expectedList, actualList);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Ожидается, что feline относятся к семейству 'Кошачьи'", expected, actual);
    }

    @Test
    public void getKittensDefaultKittensCountTest() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();

        assertEquals(expected, actual);

    }

    @Test
    // добавить параметризацию
    public void getKittensCustomKittensCountTest() {
        Feline feline = new Feline();
        int expected = 10;
        int actual = feline.getKittens(10);

        assertEquals(expected, actual);
    }
}