package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, is(120));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, is(1));
    }
}