import { useState } from "react";
// function AlertDiv (element) {
//     const color = element.color ?? "danger";
//     const txt = element.text ?? "un probleme est survenu";
//     const icone = element.icone ?? "bi-exclamation-triangle"
//     const place = element.place ?? "m-5"
//     const place2 = element.place2 ?? "center"


//     return (
//         <div className={ "alert alert-" + color +" "+ place + " " + "d-flex justify-content-" + place2} >
//             <i className= {"bi " + icone }> </i>
//             <p> {txt} </p>
//         </div>
//      )
// }




// function DisplayTab() {

// const tab = [
//     {
//         id : 1,
//         nom : "tata",
//         prenom : "toto"
//     },
//     {
//         id : 2,
//         nom : "tata2",
//         prenom : "toto3"
//     }
// ]

//     return (
//         <>
//          <ul>
//                 {tab.map((elem) => <li key={elem.id}> {elem.id} {elem.prenom}  {elem.nom}</li>)}
//             </ul>
//         </>


//     )

// }


// const Add = () => {
//     const [listingP, setListingP] = useState([])
//     const [inputValue, setInputValue] = useState("")

//     const addPersonToList = () => {
//         setListingP([...listingP, inputValue])
//     }

//     const editInput = (event) =>  {
//         setInputValue(event.target.value)
//         console.log(inputValue)
//     }
//     return (
//         <>
//             <input type="text" value={inputValue} onInput={editInput} />
//             <hr />
//             <ul>
//                 {listingP.map((person, index) => <li key={index}>{person}</li>)}
//             </ul>
//             <hr />
//             <button onClick={addPersonToList}>Add a Person</button>
//         </>
//     )

// }


// const FirstHookComponent = (props) => {
//     const [valueInput, setValueInput] =useState("")
//     const [valueInput2, setValueInput2] =useState("")
//     const changeValueInput = (event) => {
//         setValueInput( event.target.value)

//     }
//     const changeValueInput2 = (event) => {
//         setValueInput2(event.target.value)
//     }
//     return (
//         <>
//             <t> Votre prénom : </t><input type="text" onInput={changeValueInput} />
//             <br />
//             <t> Votre nom : </t><input type="text" onInput={changeValueInput2} />
//             <p>Bonjour <b> {valueInput.charAt(0).toUpperCase()+ valueInput.slice(1) } {valueInput2.toUpperCase()}</b> bienvenue sur l'application! </p>

//         </>

//     )


// }


// const CompteurHookComponent = (props) => {

//     let [compteur, setCompteur] = useState(0)
//     let [text, setText] = useState("")


//     const incrementPlus = () => {
//         if (compteur < props.val) {
//             setCompteur(++compteur)
//         display()
//         }
        
//     }


//     const incrementMoins = () => {
//         if (compteur > 0 ) {
//              setCompteur(--compteur)
//              display()
//         } 
       
        
//     }


//     const display= () => {
//         if (compteur === 0) {
//             setText("")
//         } else if (compteur%5 === 0 && compteur%3 === 0) {
//             setText("Fizzbuzz")
//         } else if(compteur%5 === 0) {
//             setText("Buzz")
//         } else if (compteur%3 === 0 ) {
//             setText("Fizz")
//         } else {
//              setText("")
//         }

        
//     }


//     return (
//         <div>

//             <button onClick={() => incrementMoins()}> - </button>
//             <button onClick={() => incrementPlus()}> + </button>
//             <p> {compteur} </p>
//             <p> {text}  </p>
//         </div>
//     )

// }



// export default AlertDiv;
// export default DisplayTab;
// export default Add;
// export default FirstHookComponent
// export default CompteurHookComponent