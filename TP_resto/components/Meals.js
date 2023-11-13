import { View, Text, FlatList, Pressable, Image, StyleSheet } from "react-native";
import { MEALS } from "../data/data";

const styles = StyleSheet.create({
    img: {
        width: '100%',
        height: 240,
        borderTopLeftRadius: 10,
        borderTopRightRadius: 10
    },
    box: {
        margin: 20,
        backgroundColor: 'white',
        borderRadius: 20
    },
    ViewColor: {
        backgroundColor: "lightgrey"
    },
    text : {
        textAlign: "center",
        margin: 2,
        color: 'black'
        
    },
    textTitle : {
        textAlign: "center",
        fontSize: 20,
        margin: 5,
        fontWeight: 'bold',
        marginBottom: 15
    }
})

export default function Details({ navigation, route }) {
    const meal = MEALS.filter((elem) => elem.categoryIds.includes(route.params.id))


    return (
        <View style={styles.ViewColor}>

            <FlatList data={meal} renderItem={({ item }) => {
                return (
                    <Pressable onPress={() => navigation.navigate('Details', item)} style={styles.box}>
                        <Image source={{ uri: item.imageUrl }} style={styles.img} />
                        <Text style={styles.textTitle}> {item.title} </Text>
                        <Text style={styles.text}>{item.duration}m {item.complexity.toUpperCase()} {item.affordability.toUpperCase()}</Text>


                    </Pressable>
                )
            }

            }
            />
        </View>
    )
}