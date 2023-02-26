import logo from './logo.svg';
import './App.css';
import ProductContextProvider from './contexts/ProductContext';
import ProductList from './componentes/ProductList';
//theme
import "primereact/resources/themes/lara-light-indigo/theme.css";     
    
//core
import "primereact/resources/primereact.min.css";

//icons
import "primeicons/primeicons.css"; 

function App() {
  return (
    <div className="App">
     <ProductContextProvider>
      <ProductList/>
     </ProductContextProvider>
    </div>
  );
}

export default App;
