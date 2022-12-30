package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void getFoodPredatorsTest() throws Exception {
        Animal animal = new Animal();
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = animal.getFood("Хищник");
        assertEquals(expectedList, actualList);
    }
    @Test
    public void getFoodHerbivoresTest() throws Exception {
        Animal animal = new Animal();
        List<String> expectedList = List.of("Трава", "Различные растения");
        List<String> actualList = animal.getFood("Травоядное");
        assertEquals(expectedList, actualList);
    }
/*//для тренировки
    @Test(expected = Exception.class)
    public void constructorThrowsExceptionOnUnsupportedSexTest() throws Exception {
        new Animal().getFood("Всеядное");
    }*/
/*    //для тренировки
    @Test
    public void anotherThrowsExceptionOnUnsupportedSexTest() throws Exception {
        Exception exception = null;
        try {
            Animal animal = new Animal();
            animal.getFood("Всеядное");
        } catch (Exception ex) {
            exception = ex;
        }
        if (exception!=null) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                    exception.getMessage());
        }
    }*/
    //для тренировки
    @Test
    public void getUnknownAnimalKindExceptionTest() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Animal().getFood("Всеядное"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                exception.getMessage());
    }
    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        String expectedString = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualString = animal.getFamily();
        assertEquals(expectedString, actualString);
    }
}
