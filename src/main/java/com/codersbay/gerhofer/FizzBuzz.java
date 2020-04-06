package com.codersbay.gerhofer;

public class FizzBuzz {

    static String fizzBuzz(Integer n) {
        if (n == null) {
            throw new IllegalArgumentException("FizzBuzz can not handle nulls!");
        }

        if (n % 3 == 0) {
            return "Fizz";
        }

        return n.toString();
    }


}
