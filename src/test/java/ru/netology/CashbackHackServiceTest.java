package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainNull() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn400() {
        int actual = service.remain(2000);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }
}