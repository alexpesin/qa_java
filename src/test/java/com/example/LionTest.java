package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class LionTest {
    @Mock
    private Feline feline;
    @Rule
    public ExpectedException thrown = ExpectedException.none();
   @Test
    public void getKittensDefaultCount() throws Exception {
       feline = new Feline();
       Lion lionMale = new Lion("Самец", feline);
       int expectedKittens = 1;
       int actualKittens = lionMale.getKittens();
       assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void getKittensCustomCount() throws Exception {
        Feline feline = new Feline();
        Lion lionMale = new Lion("Самец", feline);
        int expectedKittens = 1;
        int actualKittens = lionMale.getKittens();
        assertEquals(expectedKittens, actualKittens);
    }
    @Test
    public void getInvalidSexException() throws Exception {
        thrown.expectMessage("Используйте допустимые значения пола животного - самей или самка");
        Feline feline = new Feline();
        new Lion("NoSex", feline);
    }
   @Test
    public void doesHaveManeIfMale() throws Exception {
       Feline feline = new Feline();
       Lion lionMale = new Lion("Самец", feline);
       boolean expectedHasMane = true;
       boolean actualHasMane = lionMale.doesHaveMane();
       assertEquals(expectedHasMane, actualHasMane);
    }
    @Test
    public void doesHaveManeIfFemale() throws Exception {
       Feline feline = new Feline();
       Lion lionFemale = new Lion("Самка", feline);
        boolean expectedHasMane = false;
        boolean actualHasMane = lionFemale.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }

   @Test
    public void getFoodTest() throws Exception {
       Feline feline = new Feline();
       Lion lion = new Lion("Самка", feline);
       List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
       List<String> actualList = lion.getFood();

       assertEquals(expectedList, actualList);

    }
}