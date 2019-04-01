package com.thoughtworks.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.refEq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void test_the_number_when_n_is_not_divisible_by_neither_3_or_5() {

        int n = 1;
        Assert.assertEquals(1, fizzBuzz.fizzBuzz(n));
    }




}
