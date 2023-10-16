import { useSelector } from "react-redux";
import ProductItem from "./ProductItem";
import 'bootstrap/dist/css/bootstrap.min.css';

const ProductList = () => {
    const products = useSelector(state => state.products.products)
    if (products.length === 0) {

        return (
        <> 
        <h1 className=""><i>Pas de produit actuellement</i> </h1>
        </>
        )

    }
    return (
        <div className="m-2">
            


                {
                    products.map((product, key) => (

                        <ProductItem products={product} key={key} />



                    )

                    )
                }
            
        </div>
    )
}

export default ProductList