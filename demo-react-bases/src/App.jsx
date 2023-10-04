// import logo from './logo.svg';
import './App.css';
import { useState } from "react";
import FormComponent from './components/FormComponent';
import TableComponent from './components/TableComponent';
// import AlertDiv from './components/alert'
// import  DisplayTab  from "./components/alert";
// import  Add  from "./components/alert";
// import FirstHookComponent from './components/alert';
// import CompteurHookComponent from './components/alert';
// import ParentComponent from "./components/ParentComponent"


// function App() {
//   return (
//     <>
//       <AlertDiv/>
//       <AlertDiv  text="test" color="success" icone="bi-x-square" place="m-2" place2="around"/>
//       <AlertDiv  text="test" color="dark" icone="bi-x-square" place="m-2" place2="end"/>
//       <AlertDiv  text="test" color="warning" icone="bi-x-square" place="m-2" place2="start"/>
//     </>
//   );
// }


// function App() {
//   return (
//     <>
//       <DisplayTab/>


//     </>
//   );
// }


// function App() {
//   return (
//     <>
//       <Add/>

//     </>
//   )
// }

// function App() {
//   const [compA, setCompA] = useState(true)


//   return (
//     <div className='App'>
//       <FirstHookComponent/>    

//     </div>
//   )
// }


// function App() {


//   return(
//     <div className='App'>
//       <CompteurHookComponent val={15} />

//       <CompteurHookComponent val={15} />
//       <CompteurHookComponent val={15} />
//       <CompteurHookComponent val={15} />
//       <CompteurHookComponent val={15} />

//     </div>
//   )
// }

function App() {
    
    const [user, setUser] = useState([])

    const addUser = (e, lastname, firstname) => {
        e.preventDefault()
        setUser( oldUser => [...oldUser,

       
            {
                lastname: lastname,
                firstname: firstname
            }
         ])
    
    }



    return (
        <div className='App'>
            <FormComponent addUser={addUser}  />
            <TableComponent user={user} />

        </div>

    )
}




export default App;


