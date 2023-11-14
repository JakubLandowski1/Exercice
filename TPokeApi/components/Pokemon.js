
import React, { useEffect, useState } from 'react';
import { View, Text, FlatList, StyleSheet, Pressable } from 'react-native';
import axios from 'axios';
import { useNavigation } from '@react-navigation/native';
import PokemonDetails from './PokemonDetails';

export default function Pokemon() {
    const [pokemonData, setPokemonData] = useState([]);
    const navigation = useNavigation();

    useEffect(() => {
        const apiUrl = 'https://pokeapi.co/api/v2/pokemon?limit=50';

        axios.get(apiUrl)
            .then(response => {
                setPokemonData(response.data.results);
            })
            .catch(error => {
                console.error('Error:', error);
            });

            
    }, []);

    const renderPokemonItem = ({ item }) => (

        <Pressable onPress={() => navigateToDetails(item.url)}>
            {() => (
                <View style={styles.container}>
                    <Text style={styles.name}>{item.name}</Text>
                    <PokemonDetails url={item.url} />
                </View>
            )}
        </Pressable>
    );

    const navigateToDetails = (url) => {
        navigation.navigate('PokemonDetails', { url });
    };

    return (

        <View style={styles.card}>
            <Text style={styles.title}>Pokemons</Text>
           
                <FlatList
                    data={pokemonData}
                    keyExtractor={(item) => item.name}
                    renderItem={renderPokemonItem}

                />
            
        </View>

    );
}

const styles = StyleSheet.create({
    body: {
        backgroundColor: 'lightgrey',

    },
    container: {
        alignItems: 'center',
        margin: 40,
        padding: 10,
        borderRadius: 10,
        backgroundColor : 'lightgrey'
    },
    pressedContainer: {
        backgroundColor: 'lightblue', // Change the color when pressed
    },
    name: {
        fontSize: 30,
        color: 'black',
    },
    title: {
        fontSize: 40,
        color: 'black',
        fontWeight: "bold",
        marginLeft: 15
    },
    card: {
        backgroundColor: 'white',
        borderRadius: 15,
        margin: 20
    },
    card1: {
        backgroundColor: 'grey',
        borderRadius: 15,
        margin: 20
    }
});