package ru.netology.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CashbackHackServiceTest {

    @Test
    void shouldReturn1IfAmountIs999() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 999;
        int actual = cashback.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}