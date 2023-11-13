import { View, Text, FlatList, Pressable } from "react-native";

import { MEALS } from "../data/data";




export default function Details({route}) {
    
    
    return ( 
        <View>
            <Text>{route.params.title}</Text>
            <Text>{route.params.duration}m {route.params.complexity.toUpperCase()} {route.params.affordability.toUpperCase()}</Text>
            <Text>{route.params.ingredients}</Text>
            <Text>{route.params.steps}</Text>
        </View>
    )
}