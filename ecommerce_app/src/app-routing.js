import { createBrowserRouter } from "react-router-dom";
import Navbar from "./routes/Navbar";
import App from "./App";
import Panier from "./routes/Panier";
import Login from "./routes/Login";
import ArticlesDetails from "./routes/ArticlesDetails";

const router = createBrowserRouter([
    {
        path: "/",
        element: <Navbar />,
        children: [
            {
                path: "/",
                element: <App />,
            },
            {
                path: "/Panier",
                element: <Panier />,
            },
            {
                path: "/Login",
                element: <Login />,
            },
            {
                path: "/details/:id",
                element: <ArticlesDetails />
            }


        ],

    },



])

export default router