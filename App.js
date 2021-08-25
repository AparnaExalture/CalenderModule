/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';

import {
  View,
  requireNativeComponent,
  Text,
  StyleSheet,
  NativeModules,
  Button,
} from 'react-native';

//const Bulb = requireNativeComponent('Bulb');
const {CalenderModule} = NativeModules;

const App = () => {
  const onPress = () => {
    CalenderModule.createCalendarEvent('testName', 'testLocation');
  };
  return (
    <View style={styles.container}>
      <Text>I am Bold</Text>
      <View style={styles.top} />
      <Button onPress={onPress} title="click module" />
      {/* <Bulb styles={styles.bottom} /> */}
    </View>
  );
};

const styles = StyleSheet.create({
  bottom: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  container: {
    flex: 1,
    backgroundColor: '#F5FCFF',
  },
  top: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});

export default App;
