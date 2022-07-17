package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

    @Test
    public void lessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int amount = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void equalBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void moreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int amount = 1001;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void lessBoundaryApi() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int amount = 999;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equalBoundaryApi() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreBoundaryApi() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int amount = 1001;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }
}