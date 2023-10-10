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
    let contactDefault = {
        firstname: '',
        lastname: '',
        email: '',
        tel: '',
    }
    if (param.get('mode')== 'edit') {
        contactDefault = contact.find(elem => elem.id == param.get('id'))
    }
   

    const AddContact = (e) => {
        e.preventDefault();
        if (param.get('mode') === 'edit') {
            let contactUpdate = contact.filter(elem => param.get('id') != elem.id)
            contactUpdate.push(
                {
                    firstname: firstname.current.value,
                    lastname: lastname.current.value,
                    email: email.current.value,
                    tel: tel.current.value,
                    id: parseInt(param.get('id'))
                }
            )
            setContact(contactUpdate)
        } else
            setContact([...contact,
            {
                firstname: firstname.current.value,
                lastname: lastname.current.value,
                email: email.current.value,
                tel: tel.current.value,
                id: Date.now()
            },

            ])

        navigate("/Contact")
    }

    return (
        <>
            <div className="container mt-5 border border-dark rounded-2 bg-dark text-white">
                <form className="m-5">
                    <div className="form-group row">
                        <label htmlFor="colFormLabelLg" className="col-sm-2 col-form-label col-form-label-lg">Nom</label>
                        <div className="col-sm-10">
                            <input type="text" className="form-control form-control-lg mt-3" ref={lastname} defaultValue={contactDefault.lastname } />
                        </div>
                    </div>
                    <div className="form-group row">
                        <label htmlFor="colFormLabelLg" className="col-sm-2 col-form-label col-form-label-lg">Prénom</label>
                        <div className="col-sm-10">
                            <input type="text" className="form-control form-control-lg mt-3" defaultValue={contactDefault.firstname } ref={firstname} />
                        </div>
                    </div>
                    <div className="form-group row">
                        <label htmlFor="colFormLabelLg" className="col-sm-2 col-form-label col-form-label-lg">Email</label>
                        <div className="col-sm-10">
                            <input type="email" className="form-control form-control-lg mt-3" ref={email} defaultValue={contactDefault.email } />
                        </div>
                    </div>
                    <div className="form-group row">
                        <label htmlFor="colFormLabelLg" className="col-sm-2 col-form-label col-form-label-lg">numéro de télephone</label>
                        <div className="col-sm-10">
                            <input type="number" className="form-control form-control-lg mt-3" ref={tel} defaultValue={contactDefault.tel} />
                        </div>
                    </div>
                    <div className="d-flex justify-content-end">
                        <button onClick={AddContact} className="btn btn-primary btn-lg btn-block mt-2"> Valider </button>
                    </div>

                </form>
            </div>


        </>
    )

}

export default FormContact