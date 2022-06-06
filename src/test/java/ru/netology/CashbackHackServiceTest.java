package ru.netology;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainNull() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1000() {
        int actual = service.remain(2000);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }
}