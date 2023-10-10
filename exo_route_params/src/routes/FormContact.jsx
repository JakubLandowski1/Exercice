import { useContext, useRef } from "react";
import 'bootstrap/dist/css/bootstrap.min.css';
import ContactContext from "../context/ContextContact";
import { useNavigate, useSearchParams } from "react-router-dom";


const FormContact = () => {
    const [contact, setContact] = useContext(ContactContext)
    const firstname = useRef();
    const lastname = useRef();
    const email = useRef();
    const tel = useRef();
    const navigate = useNavigate();
    const [param] = useSearchParams();
    console.log(param)

    const AddContact = (e) => {
        e.preventDefault();
        if (param.get('mode')=== 'edit') {
            let contactUpdate =  contact.filter(elem => param.get('id') != elem.id)
            contactUpdate.push(
                {
                    firstname : firstname.current.value, 
                    lastname : lastname.current.value,
                    email : email.current.value,
                    tel : tel.current.value,
                    id : parseInt(param.get('id'))
                }
            )
            setContact(contactUpdate)
        } else
        setContact([...contact,
        {
            firstname : firstname.current.value, 
            lastname : lastname.current.value,
            email : email.current.value,
            tel : tel.current.value,
            id : Date.now()
        },
        
    ])
    
    navigate("/Contact")
    } 

    return (
        <>
            <form action="">
                <div className="form-group row">
                    <label htmlFor="colFormLabelLg" className="col-sm-2 col-form-label col-form-label-lg">Nom</label>
                    <div className="col-sm-10">
                        <input type="text" className="form-control form-control-lg" ref={lastname} />
                    </div>
                </div>
                <div className="form-group row">
                    <label htmlFor="colFormLabelLg" className="col-sm-2 col-form-label col-form-label-lg">Prénom</label>
                    <div className="col-sm-10">
                        <input type="text" className="form-control form-control-lg" ref={firstname} />
                    </div>
                </div>
                <div className="form-group row">
                    <label htmlFor="colFormLabelLg" className="col-sm-2 col-form-label col-form-label-lg">Email</label>
                    <div className="col-sm-10">
                        <input type="email" className="form-control form-control-lg"  ref={email}/>
                    </div>
                </div>
                <div className="form-group row">
                    <label htmlFor="colFormLabelLg" className="col-sm-2 col-form-label col-form-label-lg">numéro de télephone</label>
                    <div className="col-sm-10">
                        <input type="number" className="form-control form-control-lg"  ref={tel}/>
                    </div>
                </div>
            <button onClick={AddContact}> Valider </button>
            </form>



        </>
    )

}

export default FormContact