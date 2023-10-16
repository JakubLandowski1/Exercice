import { useDispatch } from "react-redux";
import { useRef } from "react";
import { NavLink, useNavigate, useParams } from "react-router-dom"
import { updateProduct } from "./ProductSlice";
import 'bootstrap/dist/css/bootstrap.min.css';

const FormUpdate = () => {
    const nomP = useRef()
    const prixP = useRef()
    const dispatch = useDispatch()
    const navigate = useNavigate()
    const param = useParams()

    const updateProd = (e) => {
        e.preventDefault()

        dispatch(updateProduct(
            {
                id: param.id,
                nom: nomP.current.value,
                prix: prixP.current.value
            }))
        navigate("/")
    }


    return (
        <>
            <form action="" className="container p-3 mb-2 bg-secondary text-white rounded">
                <div>
                    <span className="mb-2 ">
                        <label htmlFor="" className=""> <strong> Nom : </strong></label>
                        <input type="text" ref={nomP} className="rounded" />
                    </span>
                    <span>
                        <label htmlFor=""> <strong>Prix : </strong></label>
                        <input type="number" step="0.01" ref={prixP} className="rounded" />
                    </span>
                </div>

                <button onClick={updateProd} class="btn btn-success mt-2">Envoyer</button>
            </form>
        </>
    )
}

export default FormUpdate