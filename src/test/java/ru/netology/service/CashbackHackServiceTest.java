package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testIfAmount900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testIfAmount1100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testIfNoAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testIfNegativeAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1000;

        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);

    }


    @Test
    public void testIfAmount1000() {///Bag
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);

    }
}

