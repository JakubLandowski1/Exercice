import { View, Text, FlatList, Pressable, StyleSheet } from "react-native";
import { CATEGORIES } from "../data/data";

const styles = StyleSheet.create({
    textStyling: {
        fontSize: 20,
        fontStyle: 'italic',
        color: 'black'
},
innerContainer: {
        flex: 1,
        padding: 16,
        justifyContent: 'center',
        alignItems: 'center'
},
button: {
        flex: 1
},
gridItem: {
    flex: 1,
    margin: 5,
    height: 150,
    backgroundColor: 'white',
    borderRadius: 4,
    elevation: 4,
    shadowColor: 'black',
    shadowOpacity: 0.25,
    shadowOffset: { width: 0, height: 2 },
    shadowRadius: 8,
    overflow: Platform.OS === 'android' ? 'hidden' : 'visible'
},
viewConatiner: {
    flex: 1
},
})

export default function Categorie({navigation}) {
    const categorie = CATEGORIES

    return (
        <View style={[styles.viewConatiner]}>
            <FlatList numColumns={2} data={categorie} renderItem={({ item }) => {
                return (
                    <Pressable onPress={()=> navigation.navigate('Meals',item)} style={[styles.button , styles.gridItem ,{ backgroundColor: item.color }]}>
                        <View  style={styles.innerContainer}><Text style={styles.textStyling}> {item.title} </Text></View>
                     
                    </Pressable>
                )
            }

            }
            />
        </View>
    )
}