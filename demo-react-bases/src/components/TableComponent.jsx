

const TableComponent = (props) => {
    
    

    return (
        <>
         
         <ul>
            {props.user.map((elem, index) => (
            
            <li key={index}>  {elem.firstname} | {elem.lastname} </li>)
            
            
            )}
         </ul>
           
        </>
    )


}

export default TableComponent