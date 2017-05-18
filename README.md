

# react-native-vibration-feedback

Vibration feedback for React Native applications.

## Getting started

`$ npm install react-native-vibration-feedback --save`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-vibration-feedback` and add `RNVibrationFeedback.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNVibrationFeedback.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNVibrationFeedbackPackage;` to the imports at the top of the file
  - Add `new RNVibrationFeedbackPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-vibration-feedback'
  	project(':react-native-vibration-feedback').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-vibration-feedback/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-vibration-feedback')
  	```


## Usage
```javascript
import RNVibrationFeedback from 'react-native-vibration-feedback';

RNVibrationFeedback.vibrateWith(1521);
```

### ID parameter

The ID parameter is used to define what vibration feedback you want to use. In iOS you can use any ID from AudioServices on [this list.](http://iphonedevwiki.net/index.php/AudioServices) For Android you can use the IDs from the table bellow.

|  ID  | Name |           Description           |
|:----:|:----:|:-------------------------------:|
| 1519 | Peek | Weak short vibration            |
| 1520 | Pop  | Strong short vibration          |
| 1521 | Nope | Three pops in a short interval  |
