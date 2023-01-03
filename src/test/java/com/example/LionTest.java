package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline feline;
   @Test
    public void getKittensDefaultCount() throws Exception {

       Lion lionMale = new Lion("Самец", feline);
       int expectedKittens = 1;
       Mockito.when(feline.getKittens()).thenReturn(1);
       int actualKittens = lionMale.getKittens();
       assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void getKittensCustomCount() throws Exception {

        Lion lionMale = new Lion("Самец", feline);
        int expectedKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittens = lionMale.getKittens();
        assertEquals(expectedKittens, actualKittens);
    }
    @Test
    public void getInvalidSexException() {

        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("NoSex", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка",
                exception.getMessage());

    }
   @Test
    public void doesHaveManeIfMale() throws Exception {

       Lion lionMale = new Lion("Самец", feline);
       boolean expectedHasMane = true;
       boolean actualHasMane = lionMale.doesHaveMane();
       assertEquals(expectedHasMane, actualHasMane);
    }
    @Test
    public void doesHaveManeIfFemale() throws Exception {

       Lion lionFemale = new Lion("Самка", feline);
        boolean expectedHasMane = false;
        boolean actualHasMane = lionFemale.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }

   @Test
    public void getFoodTest() throws Exception {
       feline = Mockito.spy(Feline.class);
       Lion lion = new Lion("Самка", feline);
       List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
       List<String> actualList = lion.getFood();

       assertEquals(expectedList, actualList);

    }
}