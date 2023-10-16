

import './App.css'
import AddProduit from './components/AddProduct'
import ProductList from './components/ProductList'
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {


  return (
    <div className="container p-3 mb-2 bg-secondary text-white rounded">
    
      <AddProduit/>
      <ProductList/>
    </div>
  )
}

export default App
