package edu.cnm.deepdive;

/**
 * Includes a main method for demonstrating the {@link FizzBuzz} class.
 *
 * @author Asher Bearce &amp; Deep Dive Coding Java+Android Cohort 7.
 * @version 1.0.0
 */
public class Main {

  private Main(){}
  /**
   * Prints the FizzBuzz values from 1 to 100.
   * @param args This parameter is unused, as this application does not take command line arguments.
   */
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++){
      System.out.println(FizzBuzz.fizzBuzzValue(i));
    }
  }
}
