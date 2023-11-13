import { View, Text, FlatList, Pressable } from "react-native";
import { CATEGORIES } from "../data/data";



export default function Categorie({navigation}) {
    const categorie = CATEGORIES

    return (
        <View>
            <FlatList data={categorie} renderItem={({ item }) => {
                return (
                    <Pressable onPress={()=> navigation.navigate('Meals')}>
                        <Text> {item.title} </Text>
                    </Pressable>
                )
            }

            }
            />
        </View>
    )
}