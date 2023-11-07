import { Button, FlatList, Modal, StyleSheet, Text, TextInput, View } from "react-native";

export default function ModalAjout(props) {


    
    return (
        <Modal visible={props.visible}>
            <View > 
                <FlatList style={styles.modal} data={props.textInput} renderItem={(itemData) => {
                    return (
                        <View> 
                            <Text style={styles.text}> {itemData.item} </Text>
                        </View>
                    )
                }}>  
                
                </FlatList>
                <Button title="close Modal" onPress={props.closeModal} style={styles.button}/>
            </View>
        </Modal>
    )
}


const styles = StyleSheet.create({
    modal: { 
        backgroundColor: 'lightgrey',
        borderRadius: 5,
        margin: 15,
        padding: 5,
    },
    text : { 
        margin: 5
    ,
    backgroundColor: 'pink',
    borderRadius: 5,
    },
    button :{
        marginTop : 5
    }

})