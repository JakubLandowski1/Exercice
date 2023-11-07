import { useState } from "react"
import { Button, Image, StyleSheet, Text, TextInput, View } from "react-native"
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
            <Image
            style={styles.img}
                source={require('../image/ccaddie.png')}
            />
            <Text style={styles.tailleTexte}> Ajouter un article </Text>
            <TextInput onChangeText={RecupInput} style={styles.inpt} />
            <Button title="Ajouter" onPress={() => MessageConsole()} style={styles.button}/>
            <ModalAjout visible={modalVisible} closeModal={closeModal} textInput={tab} />

        </View>
    )


}



const styles = StyleSheet.create({
    tailleTexte: {
        fontSize: 32,
        marginLeft: 75,
        marginTop: 15,
    },
    button : {
        marginTop: 20
    },
    inpt : {
        backgroundColor: 'lightgrey',
        marginBottom:25,
        marginLeft: 10,
        marginRight: 10,
        borderRadius: 5
    },
    img :{
        alignSelf: 'center',
        width: 100,
        height: 100,
        margin: 30, 
    }

})