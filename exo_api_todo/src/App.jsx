
import './App.css';
import { useEffect, useRef, useState } from 'react';
import axios from 'axios';
import { useNavigate } from "react-router-dom"
import 'bootstrap/dist/css/bootstrap.min.css';


function App() {
  const navigate = useNavigate()
  const [responseData, setResponseData] = useState([]);




  useEffect(() => {
    axios.get("http://localhost:5000/todo")
      .then(response => {
        setResponseData(response.data)
      })
      .catch(error => {
        console.error("Erreur : ", error)
      })
  }, [])

  const deleteTodo = (id) => {

    axios.delete(`http://localhost:5000/todo/${id}`)
      .then(() => {
        setResponseData(responseData.filter(elem => id !== elem.id))

      })
      .catch(error => {
        console.error("Erreur : ", error)
      })

  }




  return (
    <>
      <div className='container mt-5 pb-5 bg-dark text-white rounded'>

        <div className='d-flex justify-content-between mt-5'>
          <h2 className='m-4'>TODO</h2>
          <button onClick={() => navigate(`/Form`)} className='btn btn-success m-4'>ajouter</button>

        </div>

        <div className='container'>

          {responseData.map((e) => (
            <div className='p-3 bg-secondary text-white rounded m-2'>
              <h4>{e.title} </h4>
              

              <hr />

              <div className='d-flex bg-secondary text-white rounded'>
      
                <button onClick={() => navigate(`/Form?mode=edit&id=${e.id}`)} className='btn btn-warning m-2'>editer</button>

                <button onClick={() => deleteTodo(e.id)} className='btn btn-danger m-2'>Supprimer</button>

              </div>

            </div>
          ))}

        </div>
      </div>


    </>
  );
}

export default App;
