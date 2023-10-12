import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate, useParams } from "react-router-dom"

const Articles = () => {
    const navigate = useNavigate()
    const param = useParams()
    const id = param.id
    const [articles, setArticles] = useState('');
   
   
    useEffect(() => {

        axios.get(`http://localhost:5000/article/${id}`)
          .then(response => {
            setArticles(response.data)
          })
          .catch(error => {
            console.error("Erreur : ", error)
          })
      }, [id])

      

      const addToCart = () => {
        localStorage.setItem('articles', JSON.stringify(articles))
        navigate('/')
      }


    
    console.log(articles)
    return (
        <>
            <div>{articles.title}</div>
            <div>{articles.prix}</div>
            <div>{articles.description}</div>
            <button onClick={addToCart}>Ajouter au panier</button>
        </>
    )


}

export default Articles