import { useRouteError } from "react-router-dom";

const ErrorPage = () => {
    const error = useRouteError()
    return (
        <>
            <h1> Erreur - Page introuvable </h1>
            <p> {error.data} </p>
        </>
    )
}

export default ErrorPage 