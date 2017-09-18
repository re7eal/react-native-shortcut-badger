import { NativeModules } from 'react-native';

const RNShortcutBadger = NativeModules.RNShortcutBadgerAndroid

export default class ShortcutBadgerAndroid {
  static setBadgesCount(badgeCount) {
    RNShortcutBadger.setBadgesCount(badgeCount);
  }
}