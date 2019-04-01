package com.thoughtworks.tdd;

public class FizzBuzz {

    public String fizzBuzz(int n) {
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        if (n % 7 == 0) {
            return "Whizz";
        }
        return "" + n;
    }
}
