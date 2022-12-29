package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)

public class FelineKittensCountParametrizedTest {
    private final int actualKittensCount;
    private final int expectedKittensCount;

    public FelineKittensCountParametrizedTest(int actualKittensCount, int expectedKittensCount) {
        this.actualKittensCount = actualKittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCustomKittensData(){
        return new Object[][]{
                {1,1},
                {0,0},
                {10,10},
                {101,101},
                {-99,-99},
                {10000,10000},

        };
    }

    @Test
    // добавить параметризацию
    public void getKittensCustomKittensCountTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(actualKittensCount);
        assertEquals(expectedKittensCount, actual);
    }
}