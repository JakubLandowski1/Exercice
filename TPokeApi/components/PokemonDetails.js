
import React, { useEffect, useState } from 'react';
import { View, Text, Image, FlatList, StyleSheet } from 'react-native';
import axios from 'axios';

const PokemonDetails = ({ url }) => {
  const [pokemonDetails, setPokemonDetails] = useState(null);

  useEffect(() => {
    axios.get(url)
      .then(response => {
        setPokemonDetails(response.data);
      })
      .catch(error => {
        console.error('Error:', error);
      });
  }, [url]);

  if (!pokemonDetails) {
    return null;
  }

  return (
    <View >
        
       <Image source={{uri : pokemonDetails.sprites.front_default }} style={styles.img}/> 
      <FlatList
        data={pokemonDetails.types}
        renderItem={({ item }) => (
          <Text> {item.type.name} </Text>
        )}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  img: {
    width: 150,
    height: 150,
  },
  card: {
    backgroundColor: 'white'
  }
});

export default PokemonDetails;