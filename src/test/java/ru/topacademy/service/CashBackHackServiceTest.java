package ru.topacademy.service;

import org.junit.Assert;

public class CashBackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashBack() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }
}
