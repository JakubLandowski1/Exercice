import { createBrowserRouter } from "react-router-dom";
import App from "./App";
import Form from "./components/Form";

const router = createBrowserRouter([
    {
        path: "/",
        element: <App />,
    }, 
    {
        path: "/Form",
        element: <Form />,

    }
]
)

    export default router