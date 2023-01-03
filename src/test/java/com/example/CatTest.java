package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception {

        feline = Mockito.spy(Feline.class);
        Cat cat = new Cat(feline);
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = cat.getFood();

        assertEquals(expectedList, actualList);
    }
}