import { createBrowserRouter } from "react-router-dom";
import Navbar from "./routes/Navbar";
import ErrorPage from "./routes/ErrorPage";
import App from "./App";
import Contact from "./routes/Contact";
import FormContact from "./routes/FormContact";

const router = createBrowserRouter([
    {
        path: "/",
        element: <Navbar />,
        errorElement: <ErrorPage />,
        children: [
            {
                path: "/",
                element: <App />
            },
            {
                path: "/Contact",
                element: <Contact />
            },
            {
                path: "/Contact/Form",
                element: <FormContact />
            }
        
        ]
    }])

    export default router