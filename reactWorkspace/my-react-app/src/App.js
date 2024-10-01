import React from 'react';
import Welcome from './components/Welcome';
import Clock from './components/Clock';
import Counter from './components/Counter';

function App() {
  return (
    <div>
      <h1>React 기본 예제</h1>
      <Welcome name="Sarah"/>
      <Welcome name="gildong"/>
      <Clock />
      <Counter />
    </div>
  );
}

export default App;