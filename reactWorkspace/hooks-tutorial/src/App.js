import './App.css';
import Counter from './components/Counter';
import Info from './components/Info';
import Average from './components/Average';

function App() {
  return (
    <div className="App">
      <Average />
      <hr></hr>
        <Counter />
        <hr></hr>
        <Info />
    </div>
  );
}

export default App;
