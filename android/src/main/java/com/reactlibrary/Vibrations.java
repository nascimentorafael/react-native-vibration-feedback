package com.reactlibrary;

import android.support.annotation.IntDef;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Vibrations {
  public static final int VIBRATION_PEEK = 1519;
  public static final int VIBRATION_POP = 1529;
  public static final int VIBRATION_NOPE = 1521;

  @Retention(RetentionPolicy.SOURCE)
  @IntDef({VIBRATION_PEEK, VIBRATION_POP, VIBRATION_NOPE})
  @interface VibrationInt {}

  public static long[] getPattern(@VibrationInt int patternId) {
    switch (patternId) {
      case VIBRATION_NOPE:
        return new long[] {100,100,100,100,100};
      case VIBRATION_PEEK:
        return new long[] {100};
      case VIBRATION_POP:
        return new long[] {200};
      default:
        return new long[] {200,100,200};
    }
  }
}
