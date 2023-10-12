import { NavLink, Outlet } from "react-router-dom"


function Navbar() {

    return (
        <div>
            <header>
                <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                    <span className="navbar-brand text-light" >AdopteUnNain</span>
                    <div className="collapse navbar-collapse" id="navbarNav">
                        <ul className="navbar-nav">
                            <li className="nav-item">
                                <NavLink className="nav-link" to="/">Accueil</NavLink>
                            </li>
                            <li className="nav-item">
                                <NavLink className="nav-link" to="/Contact">Login</NavLink>
                            </li>
                            <li>
                                <NavLink className="nav-link" to="/Contact">Panier</NavLink>
                            </li>
                        </ul>
                    </div>
                </nav>
            </header>
            <Outlet />
        </div>
    )
}

export default Navbar