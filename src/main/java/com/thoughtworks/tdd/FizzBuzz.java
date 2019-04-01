package com.thoughtworks.tdd;

public class FizzBuzz {

    public String fizzBuzz(int n) {
        String result = "";
        if (n % 3 == 0) {
            result += "Fizz";
        }
        if (n % 5 == 0) {
            result += "Buzz";
        }
        if (n % 7 == 0) {
            result += "Whizz";
        }
        return result==""?n+"":result;
    }
}
