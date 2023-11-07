import { Button, FlatList, Modal, Text, TextInput, View } from "react-native";

export default function ModalAjout(props) {


    
    return (
        <Modal visible={props.visible}>
            <View>
                <FlatList data={props.textInput} renderItem={(itemData) => {
                    return (
                        <View> 
                            <Text> {itemData.item} </Text>
                        </View>
                    )
                }}>  
                
                </FlatList>
                <Button title="close Modal" onPress={props.closeModal}/>
            </View>
        </Modal>
    )
}