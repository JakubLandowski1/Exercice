import { useRef } from "react"
import { useNavigate, useSearchParams } from "react-router-dom";
import axios from 'axios';

const Form = () => {
    const navigate = useNavigate()
    const title = useRef();
    const [param] = useSearchParams();


    const addTodo = (e) => {
        e.preventDefault();
        if (param.get('mode') === 'edit') {
            const id = param.get('id')
            axios.put(`http://localhost:5000/todo/${id}`, {title: title.current.value})
                .then(() => {
                    navigate("/")
                }
                )
        } else {
            axios.post(`http://localhost:5000/todo`, {title: title.current.value})
                .then(() => {
                    navigate("/")
                }
                )
        }





    }


return (
    <>
        <div className="container mt-5 border border-dark rounded-2 bg-dark text-white">
             <button onClick={() => navigate(`/`)} className="btn btn-outline-light mt-2" style={{border: "none"}}> <h1>{'<'}</h1> </button>
            <form className="m-2">
                <div className="form-group row">
                    <label htmlFor="colFormLabelLg" className="col-sm-2 col-form-label col-form-label-lg"> <h3>Titre</h3></label>
                    <div className="col-sm-10">
                        <input type="text" className="form-control form-control-lg mt-3" ref={title} />
                    </div>
                </div>

                <div className="d-flex justify-content-end">
                    <button onClick={addTodo} className="btn btn-primary btn-lg btn-block mt-3 mb-2"> Valider </button>
                </div>

            </form>
        </div>
    </>
)
}


export default Form