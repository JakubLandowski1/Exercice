import { useDispatch } from "react-redux";
import { deleteProduct, updateProduct } from "./ProductSlice";
import FormUpdate from "./FormUpdate";
import { useNavigate } from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';


const ProductItem = (props) => {
    const produit = props.products
    const dispatch = useDispatch()
    const navigate = useNavigate()



    return (
        <>
            <div className="container bg-dark text-white p-2 rounded p-1 mb-3">
                <div> <h3> {produit.nom} </h3> <h5> Prix : {produit.prix}€</h5></div>
                <hr />
                <button className="btn btn-outline-danger me-2" onClick={() => dispatch(deleteProduct(produit.id))}>Supprimer </button>
                <button className="btn btn-outline-warning" onClick={() => navigate(`/edit/${produit.id}`)}> Update </button>
            </div>
        </>
    )

}

export default ProductItem
