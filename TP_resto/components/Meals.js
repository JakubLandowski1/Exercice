import { View, Text, FlatList, Pressable, Image, StyleSheet } from "react-native";
import { MEALS } from "../data/data";

const styles = StyleSheet.create({
    img: {
        width: '100%',
        height: 200
    }
})

export default function Details({ navigation }) {
    const meal = MEALS

    return (
        <View>

            <FlatList data={meal} renderItem={({ item }) => {
                return (
                    <Pressable onPress={() => navigation.navigate('Details', item)}>
                        <Image source={{ uri: item.imageUrl }} style={styles.img} />
                        <Text> {item.title} </Text>
                        <Text>{item.duration}m {item.complexity.toUpperCase()} {item.affordability.toUpperCase()}</Text>


                    </Pressable>
                )
            }

            }
            />
        </View>
    )
}