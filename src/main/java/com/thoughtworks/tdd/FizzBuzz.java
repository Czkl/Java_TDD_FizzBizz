package com.thoughtworks.tdd;

public class FizzBuzz {

    public String fizzBuzz(int n) {
        if (n % 3 == 0) {
            return "Fizz";
        }
        return "" + n;
    }
}
