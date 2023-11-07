const express = require("express");
const app = express();

app.use(express.json())

let id = 1 
const todos = [];

app.post('/todos', (req,res) => {
    req.body.id = id++;
    const {titre, contenu, statut} = req.body;
    const todo = {id, titre, contenu, statut}
    todos.push(todo)
    res.json(req.body)
})

app.put('/todos/:id', (req, res) => {
    const todo = todos.find(todo => todo.id === id);

    let todoId =  req.params.id
    let todotitre =  req.body.titre
    let todocontenu =  req.body.contenu
    let todostatut =  req.body.statut


}  )

app.get('/todos/:id', (req, res) => {

}  )

app.get('/todos', (req,res) => {

})

app.delete('/todos/:id', (req,res) => {
   
})

app.get('/todos/:titre', (req, res) => {

}  )


app.patch('/todos/:id' , (req, res) => {

    
})

app.listen("3000", () => {

  });
  