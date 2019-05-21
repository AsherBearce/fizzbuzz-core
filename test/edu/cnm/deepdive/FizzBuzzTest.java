package edu.cnm.deepdive;

import static edu.cnm.deepdive.FizzBuzz.BUZZ;
import static edu.cnm.deepdive.FizzBuzz.FIZZ;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  static final String FIZZ_BUZZ = FIZZ + BUZZ;

  @Test
  void fizzBuzzValue() {
    String actual;

    //Inputs that expect Fizz
    actual = FizzBuzz.fizzBuzzValue(3);
    assertEquals(FIZZ, actual);
    actual = FizzBuzz.fizzBuzzValue(99);
    assertEquals(FIZZ, actual);

    //Inputs that expect Buzz
    actual = FizzBuzz.fizzBuzzValue(5);
    assertEquals(BUZZ, actual);
    actual = FizzBuzz.fizzBuzzValue(100);
    assertEquals(BUZZ, actual);

    //Inputs that expect FizzBuzz
    actual = FizzBuzz.fizzBuzzValue(15);
    assertEquals(FIZZ + BUZZ, actual);
    actual = FizzBuzz.fizzBuzzValue(120);
    assertEquals(FIZZ + BUZZ, actual);

    //Inputs that expect the same value back
    actual = FizzBuzz.fizzBuzzValue(2);
    assertEquals("2", actual);
    actual = FizzBuzz.fizzBuzzValue(11);
    assertEquals("11", actual);
    actual = FizzBuzz.fizzBuzzValue(101);
    assertEquals("101", actual);

    assertThrows(IllegalArgumentException.class, ()-> FizzBuzz.fizzBuzzValue(0));
    assertThrows(IllegalArgumentException.class, ()-> FizzBuzz.fizzBuzzValue(-15));
  }
}