import { NavLink, Outlet } from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';

function Navbar () {
    return(

        <div>
        <header>
          <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
            <span className="navbar-brand text-light" >NomDuSite</span>
            <div className="collapse navbar-collapse" id="navbarNav">
              <ul className="navbar-nav">
                <li className="nav-item">
                  <NavLink className="nav-link" to="/">Home</NavLink>
                </li>
                <li className="nav-item">
                  <NavLink className="nav-link" to="/Contact">Contact</NavLink>
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