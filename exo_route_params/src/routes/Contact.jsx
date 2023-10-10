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
                    <button onClick={clickHandler} type="button" className="btn btn-outline-success">Ajouter un contact</button>
                </div>

                <hr />
                <div>
                    {contact.map((e, index) => (
                        <div key={index}>
                            {e.firstname}
                            {e.lastname}
                            {e.tel}
                            {e.email}

                            <button onClick={() => suppContact(e.id)}> Supprimer</button>
                            <button onClick={() => navigate(`/Contact/Form?mode=edit&id=${e.id}`)}> Editer </button>
                        </div>
                    ))

                    }
                </div>
            </div>
        </>
    )
}

export default Contact