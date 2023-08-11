package tdd.math;

public class Factorial implements FactorialInterface {

  @Override
  public Integer getFactorial(int i) {
    if (i == 0) {
      return 1;
    }
    return i * getFactorial(i - 1);
  }

}
