import { useState } from "react"
import { Button, StyleSheet, Text, TextInput, View } from "react-native"
import ModalAjout from "./ModalAjout"

export default function FirstComponent() {

    const [textInput, setTextInput] = useState('')
    const [tab, setTab] = useState([])
    const [modalVisible, setModalVisible] = useState(false)
    

    function RecupInput(enterText) {
        setTextInput(enterText)
    }

    function RecupInput(enterText) {
        setTextInput(enterText)
    }

    function MessageConsole() {
        setModalVisible(true)
        setTab([...tab, textInput])
        console.log(textInput)
    }

    function closeModal() {
        setModalVisible(false)
    }




    return (
        <View>
            <Text style={styles.tailleTexte}> Ajouter un article </Text>
            <TextInput onChangeText={RecupInput}  />
            <Button title="Ajouter" onPress={()=>MessageConsole()} />
            <ModalAjout visible={modalVisible} closeModal={closeModal} textInput={tab}/>
            
        </View>
    )


}



const styles = StyleSheet.create({
    tailleTexte: {
        fontSize: 32,
    }

})