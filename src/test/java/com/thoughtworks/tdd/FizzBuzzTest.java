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
        Assert.assertEquals("1", fizzBuzz.fizzBuzz(n));
    }

    @Test
    public void test_get_Fizz_when_n_is_divisible_by_3() {
        int n = 3;
        Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(n));
    }

    @Test
    public void test_get_Buzz_when_n_is_divisible_by_5() {
        int n = 5;
        Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(n));
    }


    @Test
    public void test_get_Whizz_when_n_is_divisible_by_7() {
        int n = 7;
        Assert.assertEquals("Whizz", fizzBuzz.fizzBuzz(n));
    }

    @Test
    public void test_get_FizzBuzz_when_n_is_divisible_by_3_and_5(){
        int n=15;
        Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(n));
    }
}
