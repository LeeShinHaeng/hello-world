import './App.css';
import Subject from './components/Subject';
import Content from './components/Content';
import Nav from './components/Nav';
import JSXPractice from './components/JSXPractice';

function App() {
  return (
    <div className="App">
      <JSXPractice />
      <h1>안녕하세요</h1>
      {/* 컴포넌트 사용 */}
      <Subject></Subject>
      <hr></hr>
      <Nav></Nav>
      <hr></hr>
      <Content></Content>
    </div>
  );
}

export default App;
