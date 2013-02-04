/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.benfante.experiments.libpqwrapper.swig;

public final class PGVerbosity {
  public final static PGVerbosity PQERRORS_TERSE = new PGVerbosity("PQERRORS_TERSE");
  public final static PGVerbosity PQERRORS_DEFAULT = new PGVerbosity("PQERRORS_DEFAULT");
  public final static PGVerbosity PQERRORS_VERBOSE = new PGVerbosity("PQERRORS_VERBOSE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static PGVerbosity swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + PGVerbosity.class + " with value " + swigValue);
  }

  private PGVerbosity(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private PGVerbosity(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private PGVerbosity(String swigName, PGVerbosity swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static PGVerbosity[] swigValues = { PQERRORS_TERSE, PQERRORS_DEFAULT, PQERRORS_VERBOSE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
