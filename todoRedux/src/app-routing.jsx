import { createBrowserRouter } from "react-router-dom";
import ProductList from "./components/ProductList";
import App from "./App";
import FormUpdate from "./components/FormUpdate";



const router = createBrowserRouter([
    {
        path: "/",
        element: <App/>,
    },  
    {
        path: "/edit/:id",
        element: <FormUpdate/>,
    }

])

export default router