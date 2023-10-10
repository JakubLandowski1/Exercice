import { useNavigate } from "react-router-dom"
import 'bootstrap/dist/css/bootstrap.min.css';
import ContactContext from "../context/ContextContact";
import { useContext } from "react";

function Contact() {
    const navigate = useNavigate();
    const [contact, setContact] = useContext(ContactContext)
    const clickHandler = () => {
        navigate("/Contact/Form")
    }


    const suppContact = (id) => {
        setContact(contact.filter(elem => id !== elem.id))
    }



    return (
        <>

            <div className="container p-3 mb-2 mt-3 bg-dark text-white rounded-2">
                <div className="d-flex justify-content-between">
                    <h2>Contact</h2>
                    <button onClick={clickHandler} type="button" className="btn btn-success">Ajouter un contact</button>
                </div>

                <hr />
                <div>
                    {contact.map((e, index) => (
                        <div key={index} className="rounded-2 border border-info p-2 m-2">
                            <div className="d-flex justify-content-between">
                                <h3>{e.firstname} {e.lastname}</h3>  
                                <div className="">
                                    <button onClick={() => suppContact(e.id)} className="btn btn-danger m-2"> Supprimer</button>
        
                                    <button onClick={() => navigate(`/Contact/Form?mode=edit&id=${e.id}`)} className="btn btn-warning"> Editer </button></div>
                            </div>
                            <hr />
                            <div>
                                <div> <strong>Numéro de tel : </strong>  {e.tel}</div>
                                <div> <strong>Email : </strong> {e.email}</div>
                                
                            </div>



                        </div>
                    ))

                    }
                </div>
            </div>
        </>
    )
}

export default Contact