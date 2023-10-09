import { createBrowserRouter } from "react-router-dom";
import App from "./App";
import ErrorPage from "./routes/ErrorPage";
import Navbar from "./routes/Navbar";
import Contact from "./routes/Contact";
import Apropos from "./routes/Apropos";
import Projet from "./routes/Projet";

const router = createBrowserRouter([
    {
        path: "/",
        element: <Navbar/>,
        errorElement: <ErrorPage />,
        children: [
            {
                path: "/",
                element : <App/>
            },
            {
                path: "/Contact",
                element : <Contact/>
            },
            {
                path: "/Apropos",
                element : <Apropos/>
            },
            {
                path: "/Projet",
                element : <Projet/>
            }
        ]


    }])

export default router