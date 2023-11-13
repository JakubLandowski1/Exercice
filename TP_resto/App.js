import { NavigationContainer } from '@react-navigation/native';
import { FlatList, View } from "react-native";
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import Categorie from './components/Categorie';
import Meals from './components/Meals';
import Details from './components/Details';



export default function App() {

    const Stack = createNativeStackNavigator();

    return (
        <NavigationContainer>
            <Stack.Navigator>
                <Stack.Screen name="All Categories" component={Categorie} />
                <Stack.Screen name="Meals" component={Meals} />
                <Stack.Screen name="Details" component={Details} />
            </Stack.Navigator>
        </NavigationContainer>

    )


}