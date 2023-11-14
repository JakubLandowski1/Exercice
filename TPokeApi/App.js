import { NavigationContainer } from "@react-navigation/native";
import { View, Text, Button } from "react-native";
import Home from "./components/Home";
import { createNativeStackNavigator } from "@react-navigation/native-stack";
import Pokemon from "./components/Pokemon";
import PokemonDetailsPage from "./components/PokemonsDetailsPage";
 
export default function App () {

    const Stack = createNativeStackNavigator();

    return (
        <NavigationContainer>
        <Stack.Navigator>
            <Stack.Screen name="Home" component={Home} />
            <Stack.Screen name="Pokemon" component={Pokemon} />
            <Stack.Screen name="PokemonDetails" component={PokemonDetailsPage} />
        </Stack.Navigator>
    </NavigationContainer>
    )
}