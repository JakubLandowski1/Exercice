import { useEffect, useState } from 'react';
import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css';
import { useNavigate } from 'react-router-dom';



function App() {
  const [articles, setArticles] = useState([]);
  const navigate = useNavigate();


  useEffect(() => {
    axios.get("http://localhost:5000/article")
      .then(response => {
        setArticles(response.data)
      })
      .catch(error => {
        console.error("Erreur : ", error)
      })
  }, [])



  return (
    <>
      

      <main className='container d-flex flex-wrap'>
        {articles.map((e) => (

          <div className='p-2 rounded m-2' style={{ backgroundColor: 'lightgray' }}>
            <h4> {e.title} </h4>

            <hr className=' p-1  bg-light' />

            <div> image à venir </div>

            <div className='mt-5'>
              <p >  <strong>Montant :  </strong>  {e.prix}€ </p>
            </div>

            <div>
              <button className='btn btn-light mt-1'  onClick={() => navigate(`/details/${e.id}`)}> Détails</button>
            </div>

          </div>

        ))}
      </main>

    </>
  );
}

export default App;


// onClick={navigate(`/Details?id=${e.id}`)}