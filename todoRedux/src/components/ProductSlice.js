import { createSlice } from '@reduxjs/toolkit'

const productSlice = createSlice({
    name: "product",
    initialState: {
        products: [
            {
                id: 1,
                nom: "Produit1",
                prix: 15
            }
        ]

    },
    reducers: {
        addProduct: (state, action) => {
            const newProduct = {
                id: Date.now(),
                nom: action.payload.nom,
                prix: action.payload.prix,
            }
            state.products.push(newProduct)

        },
        deleteProduct: (state, action) => {
            state.products = state.products.filter(product => product.id != action.payload)
        },
        updateProduct: (state, action) => {
            state.products.forEach(elem => {
                if (elem.id == action.payload.id) {
                    elem.nom= action.payload.nom;
                    elem.prix = action.payload.prix
                }
                
            })

        }
    }

})

export const {addProduct, deleteProduct, updateProduct} = productSlice.actions
export default productSlice.reducer