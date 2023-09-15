package ru.netology.service;
//junit
import org.junit.Test;
import org.junit.Assert;
//import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateBoundaryWithAnyAmount() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 900;

        int expected = 1000 - amount;
        int actual = hackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateBoundaryWithAmountZero() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 0;

        int expected = 1000 - amount;
        int actual = hackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateBoundaryWithAmountEqualToIt() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1000;

        int expected = 1000 - amount;
        int actual = hackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}
