package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AlexTest {

    @Test
    public void getFriendsTest() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);

        List<String> expected = List.of("Марти, Глория, Мелман");
        List<String> actual = alex.getFriends();

        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        String expected = "Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLiving();

        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        int expected = 0;
        int actual = alex.getKittens();

        assertEquals(expected, actual);
    }
}