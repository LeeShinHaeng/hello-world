import './App.css';
import Header from './components/Header';
import Sidebar from './components/Sidebar';
import FeaturedSection from './components/FeaturedSection';
import Footer from './components/Footer';

function App() {
  return (
    <div className="App">
      <Header />
      <div className="main-content">
        <Sidebar />
        <FeaturedSection />
      </div>
      <Footer/ >
    </div>
  );
}

export default App;
