import axios from 'axios'
import { useState } from 'react';
import { FlatList, View, Pressable, Button, StyleSheet, Text } from "react-native";

export default function Home({ navigation }) {



    return (

        <View>

            <View><Text style={styles.title}>Attrapez les tous, Pokemon !! </Text></View>

            <View style={styles.btnInLine}>
                <Pressable onPress={() => navigation.navigate('Pokemon')} style={styles.btn1}>
                    <Text style={styles.title2}>Pokemons</Text>
                </Pressable>

                <Pressable style={styles.btn2}>
                    <Text style={styles.title2}>Pokedex</Text>
                </Pressable>
            </View>

        </View>
    )
}

const styles = StyleSheet.create({
    btnInLine: {
        justifyContent: 'space-evenly',
        flexDirection: 'row'

    },
    title: {
        fontSize: 35,
        fontWeight: "bold",
        color: "black",
        marginBottom: 10,
        marginStart: 15
    },
    name: {
        fontSize: 20,
        color: 'white'
    },
    btn1: {
        backgroundColor: '#51C0A9',
        width: 150,
        height: 70,
        borderRadius: 20,
        alignItems: '#51C0A9',
        padding: 20,
    },
    btn2: {
        backgroundColor: '#78C4FE',
        width: 150,
        height: 70,
        borderRadius: 20,
        alignItems: 'center',
        padding: 20

    },
    title2: {
        fontSize: 20,
        fontWeight: "bold",
        color: "white"
    },

})