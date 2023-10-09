// import logo from './logo.svg';
import './App.css';
// import { useState } from "react";
// import FormComponent from './components/FormComponent';
// import TableComponent from './components/TableComponent';
// import AlertDiv from './components/alert'
// import  DisplayTab  from "./components/alert";
// import  Add  from "./components/alert";
// import FirstHookComponent from './components/alert';
// import CompteurHookComponent from './components/alert';
// import ParentComponent from "./components/ParentComponent"
import FormLoginComponent from './components/FormLoginComponent';

// EXO 1
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



// EXO 2
// function App() {
//   return (
//     <>
//       <DisplayTab/>


//     </>
//   );
// }



// EXO 3
// function App() {
//   return (
//     <>
//       <Add/>

//     </>
//   )
// }



// EXO 4
// function App() {
//   const [compA, setCompA] = useState(true)
//   return (
//     <div className='App'>
//       <FirstHookComponent/>    
//     </div>
//   )
// }



// EXO 5
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


// EXO 6 (avec les fichiers FormComponent et TableComponent)
// function App() {
//     const [user, setUser] = useState([])
//     const addUser = (e, lastname, firstname) => {
//         e.preventDefault()
//         setUser( oldUser => [...oldUser,  
//             {
//                 lastname: lastname,
//                 firstname: firstname
//             }
//          ])
//     }
//     return (
//         <div className='App'>
//             <FormComponent addUser={addUser}  />
//             <TableComponent user={user} />
//         </div>
//     )
// }

// EXO 7 (avec le fichier FormLoginComponent)
// function App () {
//     const getValue = (e, username, password) => {
//         e.preventDefault()
//         console.log(username.current.value, password.current.value)
//     }
//     return (
//         <div className='App'>
//             <FormLoginComponent getValue={getValue} />
//         </div>
//     )
// }


function App() {

    return (
        <>


        </>
    )
}
export default App;


