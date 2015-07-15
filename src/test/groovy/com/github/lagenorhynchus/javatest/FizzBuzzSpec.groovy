package com.github.lagenorhynchus.javatest

import static com.github.lagenorhynchus.javatest.FizzBuzz.fizzBuzz

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzSpec extends Specification {
  @Unroll
  def "1以上の数に対してFizz Buzzの正しい答えが得られる"() {
    expect:
      fizzBuzz(n) == answer
    where:
      n  | answer
       1 | "1"
       2 | "2"
       3 | "Fizz"
       4 | "4"
       5 | "Buzz"
       6 | "Fizz"
       7 | "7"
       8 | "8"
       9 | "Fizz"
      10 | "Buzz"
      14 | "14"
      15 | "Fizz Buzz"
      16 | "16"
      20 | "Buzz"
      30 | "Fizz Buzz"
      45 | "Fizz Buzz"
  }

  @Unroll
  def "1未満の数に対して例外(IllegalArgumentException)が発生する"() {
    when:
      fizzBuzz(0)
    then:
      def ex = thrown(IllegalArgumentException)
      ex.getMessage() == "n cannot be less than 1"
  }
}
