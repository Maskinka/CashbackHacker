package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void lessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int amount = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void equalBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void moreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int amount = 1001;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}