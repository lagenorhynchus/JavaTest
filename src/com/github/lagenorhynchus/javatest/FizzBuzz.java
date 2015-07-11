package com.github.lagenorhynchus.javatest;

public class FizzBuzz {
  public static String fizzBuzz(final int n) {
    if (n < 1) {
      throw new IllegalArgumentException("n cannot be less than 1");
    }

    final boolean isDivisibleBy3 = n % 3 == 0;
    final boolean isDivisibleBy5 = n % 5 == 0;
    if (isDivisibleBy3 && isDivisibleBy5) {
      return "Fizz Buzz";
    } else if (isDivisibleBy3) {
      return "Fizz";
    } else if (isDivisibleBy5) {
      return "Buzz";
    } else {
      return String.valueOf(n);
    }
  }

  public static void main(final String[] args) {
    for (int n = 1; n <= 30; n++) {
      System.out.println(FizzBuzz.fizzBuzz(n));
    }
  }
}
