
package com.reactlibrary;

import android.content.Context;
import android.os.Vibrator;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNVibrationFeedbackModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private final Vibrator vibrator;

  public RNVibrationFeedbackModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    vibrator = (Vibrator) reactContext.getSystemService(Context.VIBRATOR_SERVICE);
  }

  @Override
  public String getName() {
    return "RNVibrationFeedback";
  }

  @ReactMethod
  public void vibrateWith(int id) {
    vibrator.vibrate(Vibrations.getPattern(id), -1);
  }
}