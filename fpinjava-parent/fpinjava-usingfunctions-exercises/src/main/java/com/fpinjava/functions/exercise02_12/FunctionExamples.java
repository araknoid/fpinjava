package com.fpinjava.functions.exercise02_12;

public class FunctionExamples {

  /*
   * Note: The same implementation may be used for all four cases.
   */

  public static final Function<Integer, Integer> factorial;
  static {
    factorial = x-> x <= 1 ? 1 : x * FunctionExamples.factorial.apply(x-1);
  }

  public static final Function<Integer, Integer> factorial0 = x -> factorial.apply(x); // To be implemented

  public static Function<Integer, Integer> factorial1;
  static {
    factorial1 =  x-> factorial.apply(x); // To be implemented
  }

  public final Function<Integer, Integer> factorial2 = x-> factorial.apply(x); // To be implemented

  public Function<Integer, Integer> factorial3;
  {
    factorial3 = x-> factorial.apply(x); // To be implemented
  }
}
