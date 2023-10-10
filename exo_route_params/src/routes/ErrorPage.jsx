import 'bootstrap/dist/css/bootstrap.min.css';
import { useRouteError } from 'react-router-dom';
import Navbar from './Navbar';

const ErrorPage = () => {
    const error = useRouteError()
    return (
        
        <>
            <Navbar/>
            <div className='h-100 d-flex align-items-center justify-content-center'>
                <h1>Erreur - Page Introuvable {error.status}</h1>
               


            </div>
             <p className='h-100 d-flex align-items-center justify-content-center'>{error.data}</p>
        </>
    )

}

export default ErrorPage