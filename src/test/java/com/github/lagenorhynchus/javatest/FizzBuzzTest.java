package com.github.lagenorhynchus.javatest;

import static com.github.lagenorhynchus.javatest.FizzBuzz.fizzBuzz;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzTest {
  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void 数が3の倍数のときFizz() {
    assertThat(fizzBuzz(3), is("Fizz"));
    assertThat(fizzBuzz(6), is("Fizz"));
    assertThat(fizzBuzz(9), is("Fizz"));
  }

  @Test
  public void 数が5の倍数のときBuzz() {
    assertThat(fizzBuzz(5), is("Buzz"));
    assertThat(fizzBuzz(10), is("Buzz"));
    assertThat(fizzBuzz(20), is("Buzz"));
  }

  @Test
  public void 数が3の倍数かつ5の倍数のときFizzBuzz() {
    assertThat(fizzBuzz(15), is("Fizz Buzz"));
    assertThat(fizzBuzz(30), is("Fizz Buzz"));
    assertThat(fizzBuzz(45), is("Fizz Buzz"));
  }

  @Test
  public void その他の数のときその数字() {
    assertThat(fizzBuzz(1), is("1"));
    assertThat(fizzBuzz(2), is("2"));
    assertThat(fizzBuzz(4), is("4"));
    assertThat(fizzBuzz(7), is("7"));
    assertThat(fizzBuzz(14), is("14"));
    assertThat(fizzBuzz(16), is("16"));
  }

  @Test
  public void 数が1未満のときIllegalArgumentException() {
    expectedException.expect(IllegalArgumentException.class);
    expectedException.expectMessage("n cannot be less than 1");
    fizzBuzz(0);
  }
}
