import { useDispatch } from "react-redux"
import { addProduct } from "./ProductSlice"
import { useRef } from "react"

const AddProduit = () => {
    const prodName = useRef()
    const prodPrix = useRef()
    const dispatch = useDispatch()

    const submit = (event) => {
        event.preventDefault()
        dispatch(addProduct({
            nom: prodName.current.value,
            prix: prodPrix.current.value
        }))

    }

    return (
        <>
            <form action="" className="container m-2">

                <span className="">
                    <label htmlFor=""> <strong> Nom:</strong></label>
                    <input type="text" ref={prodName} className="rounded" />
                </span>
                <span className="ms-2">
                    <label htmlFor=""> <strong>Prix: </strong></label>
                    <input type="number" step="0.01" ref={prodPrix} className="rounded" />
                </span>


                <button onClick={submit} className="btn btn-success ms-3 mb-2"> Envoyer </button>
            </form>

        </>
    )
}


export default AddProduit 