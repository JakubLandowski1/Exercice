import { NavLink, Outlet } from "react-router-dom"


function Navbar() {
    return (

        <div>
            <header>
                <h1> Navbar</h1>
                <NavLink to="/"> Home </NavLink>
                <NavLink to ="/Contact"> Contact </NavLink>
                <NavLink to ="/Apropos"> A propos </NavLink>
                <NavLink to="/Projet"> Projets </NavLink>
            </header>
            <Outlet />
        </div>
    )

    
}

export default Navbar