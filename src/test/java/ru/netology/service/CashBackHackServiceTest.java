package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {
    CashBackHackService cashbackHackService = new CashBackHackService();

    @Test
    public void ShouldReturnResidue() {
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void AmountZero() {
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void AmountMoreThenBoundary() {
        int actual = cashbackHackService.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    public void Amount1000() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}