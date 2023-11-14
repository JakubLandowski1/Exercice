
import React, { useEffect, useState } from 'react';
import { View, Text, Image, FlatList, StyleSheet } from 'react-native';
import axios from 'axios';

const PokemonDetailsPage = ({ route }) => {
  const { url } = route.params;
  const [pokemonDetails, setPokemonDetails] = useState(null);
  const [evolutionChain, setEvolutionChain] = useState([]);

  useEffect(() => {
    axios.get(url)
      .then(response => {
        setPokemonDetails(response.data);
        return axios.get(response.data.species.url);
      })
      .then(response => {
        return axios.get(response.data.evolution_chain.url);
      })
      .then(response => {
        setEvolutionChain(parseEvolutionChain(response.data.chain));
      })
      .catch(error => {
        console.error('Error:', error);
      });
  }, [url]);

  const parseEvolutionChain = (chain) => {
    const result = [];
    while (chain) {
      result.push(chain.species.name);
      chain = chain.evolves_to[0];
    }
    return result;
  };

  if (!pokemonDetails) {
    return null;
  }

  return (
    <View style={styles.container}>
      <Text style={styles.name}>Name: {pokemonDetails.name}</Text>
      <Image
        source={{ uri: `https://pokeapi.co/media/sprites/pokemon/${pokemonDetails.id}.png` }}
        style={styles.card}
      />
       <Image source={{uri : pokemonDetails.sprites.front_default }} style={styles.card}/> 
       {/* <Text>Description: {flavorText ? flavorText.flavor_text : 'N/A'}</Text> */}
      <Text>Height: {pokemonDetails.height}</Text>
      <Text>Weight: {pokemonDetails.weight}</Text>
      <Text>Evolution Chain:</Text>
      <Text>{evolutionChain.join(' -> ')}</Text>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    marginTop: 20,
  },
  card: {
    width: 100,
    height: 100,
    resizeMode: 'contain',
  },
  name: {
    fontSize: 20,
    color: 'black',
  },
});

export default PokemonDetailsPage;