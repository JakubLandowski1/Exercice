import { View, Text, FlatList, Pressable, StyleSheet, Image, ScrollView } from "react-native";

import { MEALS } from "../data/data";


const styles = StyleSheet.create({
    img: {
        width: '100%',
        height: 200
    },
    title: {
        marginTop: 5,
        paddingVertical: 8,
        color: '#20232a',
        textAlign: 'center',
        fontSize: 25,
        fontWeight: 'bold',
    },
    prepare: {
        textAlign: 'center',
        margin: 10,
        color: 'black'
    },
    title2: {
        textAlign: 'center',
        marginTop: 5,
        paddingVertical: 8,
        color: 'orange',
        textAlign: 'center',
        fontSize: 20,
        fontWeight: 'bold',
    },
    description: {
        marginTop: 5,
        borderRadius: 6,
        backgroundColor: 'orange',
        color: '#20232a',
        textAlign: 'center',
        fontSize: 15,
        marginLeft :50,
        marginRight : 50
    },
    hr: {
        backgroundColor: 'orange',
        height : 3,
        marginLeft: 50,
        marginRight: 50
    }
})

export default function Details({ route }) {


    return (
        <ScrollView>
            <Image source={{ uri: route.params.imageUrl }} style={styles.img} />
            <Text style={styles.title}>{route.params.title}</Text>
            <Text style={styles.prepare}>{route.params.duration}m {route.params.complexity.toUpperCase()} {route.params.affordability.toUpperCase()}</Text>
            <Text style={styles.title2}>Ingredients</Text>
            <View style={styles.hr}></View>

            <FlatList data={route.params.ingredients} renderItem={({ item }) => {
                return (
                    <Text style={styles.description}>{item}</Text>
                )
            }}
            />

            <Text style={styles.title2}>Steps </Text>
            <View style={styles.hr}></View>
            <FlatList data={route.params.steps} renderItem={({ item }) => {
                return (
                    <Text style={styles.description}>{item}</Text>
                )
            }}

            />

        </ScrollView>
    )
}