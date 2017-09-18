# How to use it

## Add package react-native-shortcut-badger to react-native project
```
$ npm i --save git+https://git@github.com/re7eal/react-native-shortcut-badger.git
$ react-native link react-native-shortcut-badger
```

## Import the module and use it in your react-native code
```js
import ShortcutBadgerAndroid from 'react-native-shortcut-badger'
...
ShortcutBadgerAndroid.setBadgesCount(5)
ShortcutBadgerAndroid.setBadgesCount(0) // Clear badge count
```

## Run the project on supported devices and check:
```
$ react-native run-android
```

<img src="https://raw.githubusercontent.com/re7eal/react-native-shortcut-badger/master/screenshot.png" alt="screenshot" width="50%">

You can see the list of supported devices at [leolin310148/ShortcutBadger](https://github.com/leolin310148/ShortcutBadger)
