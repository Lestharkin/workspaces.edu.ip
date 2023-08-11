package tdd.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialTest {

  @Test
  @DisplayName("Factorial")
  void testFactorialZero() {

    FactorialInterface fac = new Factorial();

    // Test cases 1: 0! = 1
    assertEquals(1, fac.getFactorial(0));

  }

  @Test
  @DisplayName("Factorial")
  void testFactorialOne() {

    FactorialInterface fac = new Factorial();

    // Test cases 1: 1 = 1
    assertEquals(1, fac.getFactorial(1));
  }

  @Test
  @DisplayName("Factorial")
  void testFactorialGone() {

    FactorialInterface fac = new Factorial();

    // Test cases 1: >1 => 2! = 1x2 = 2, 3! = 1x2x3 = 6, 4! = 1x2x3x4 = 24
    assertEquals(2, fac.getFactorial(2));
    assertEquals(6, fac.getFactorial(3));
    assertEquals(24, fac.getFactorial(4));
  }

   @Test
  @DisplayName("Factorial")
  void testFactorialInf() {

    FactorialInterface fac = new Factorial();

    // Test cases 1: >1234567891234567812345671234!
    // assertEquals(2, fac.getFactorial(1234567891234567812345671234));
  }
  
}
