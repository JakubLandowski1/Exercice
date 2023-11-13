import { useState } from "react";
import { Pressable, StyleSheet, Text, View } from "react-native";

export default function App() {

    const [affichage, setAffichage] = useState('0')
    const [operateur, setOperateur] = useState(null)
    const [premiereValeur, setPremiereValeur] = useState('')

    const inputNumber = (num) => {

        if (affichage === '0') {
            setAffichage(num.toString());
        } else {
            setAffichage(affichage + num)
        }
    }

    const egal = () => {
        const num1 = parseFloat(premiereValeur);
        const num2 = parseFloat(affichage);

        if (operateur === '+') {
            setAffichage((num1 + num2).toString());
        } else if (operateur === '-') {
            setAffichage((num1 - num2).toString());
        } else if (operateur === '*') {
            setAffichage((num1 * num2).toString());
        } else if (operateur === '/') {
            setAffichage((num1 / num2).toString());
        }

        setOperateur(null);
        setPremiereValeur('');
    }

    const operateurinput = (operateur) => { 
        setOperateur(operateur); 
        setPremiereValeur(affichage); 
        setAffichage('0'); 
    }; 

    const clear = () => {
        setAffichage('0');
        setOperateur(null);
        setPremiereValeur('');
    }

    return (

        <View style={styles.container}>

            <View>
                <Text style={[styles.ecran, styles.shadowProp]}> {affichage} </Text>
            </View>

            <View style={styles.ligne}>
                <Pressable onPress={() => clear()}>
                    <Text style={[styles.btn, styles.shadowProp]}> AC </Text>
                </Pressable>
                <Pressable onPress={operateurinput('^')}>
                    <Text style={[styles.btn, styles.shadowProp]}> ^ </Text>
                </Pressable>
                <Pressable onPress={operateurinput('%')}>
                    <Text style={[styles.btn, styles.shadowProp]}> % </Text>
                </Pressable>
                <Pressable onPress={operateurinput('/')}>
                    <Text style={[styles.btn, styles.shadowProp]}> / </Text>
                </Pressable>
            </View>

            <View style={styles.ligne}>
                <Pressable onPress={() => inputNumber(7)}>
                    <Text style={[styles.btnUn, styles.shadowProp]}> 7 </Text>
                </Pressable>
                <Pressable onPress={() => inputNumber(8)}>
                    <Text style={[styles.btnUn, styles.shadowProp]} > 8 </Text>
                </Pressable>
                <Pressable onPress={() => inputNumber(9)}>
                    <Text style={[styles.btnUn, styles.shadowProp]}> 9 </Text>
                </Pressable>
                <Pressable onPress={operateurinput('*')}>
                    <Text style={[styles.btn, styles.shadowProp]}> x </Text>
                </Pressable>
            </View>

            <View style={styles.ligne}>
                <Pressable onPress={() => inputNumber(4)}>
                    <Text style={[styles.btnUn, styles.shadowProp]}> 4 </Text>
                </Pressable>
                <Pressable onPress={() => inputNumber(5)}>
                    <Text style={[styles.btnUn, styles.shadowProp]}> 5 </Text>
                </Pressable>
                <Pressable onPress={() => inputNumber(6)}>
                    <Text style={[styles.btnUn, styles.shadowProp]}> 6 </Text>
                </Pressable>
                <Pressable onPress={operateurinput('-')}>
                    <Text style={[styles.btn, styles.shadowProp]}> - </Text>
                </Pressable>
            </View>

            <View style={styles.ligne}>
                <Pressable onPress={() => inputNumber(1)}>
                    <Text style={[styles.btnUn, styles.shadowProp]}> 1 </Text>
                </Pressable>
                <Pressable onPress={() => inputNumber(2)}>
                    <Text style={[styles.btnUn, styles.shadowProp]}> 2 </Text>
                </Pressable>
                <Pressable onPress={() => inputNumber(3)}>
                    <Text style={[styles.btnUn, styles.shadowProp]}> 3 </Text>
                </Pressable>
                <Pressable onPress={operateurinput('+')}>
                    <Text style={[styles.btn, styles.shadowProp]}> + </Text>
                </Pressable>
            </View>

            <View style={styles.ligne}>
                <Pressable onPress={() => inputNumber('.')}>
                    <Text style={[styles.btnUn, styles.shadowProp]}> . </Text>
                </Pressable>
                <Pressable onPress={() => inputNumber(0)}>
                    <Text style={[styles.btnUn, styles.shadowProp]}> 0 </Text>
                </Pressable>
                <Pressable>
                    <Text style={[styles.btnUn, styles.shadowProp]}> Del </Text>
                </Pressable>
                <Pressable onPress={egal()}>
                    <Text style={[styles.btn, styles.shadowProp]}> = </Text>
                </Pressable>
            </View>

        </View>
    )



}
const styles = StyleSheet.create({
    container: {
        flex: 1,


    },
    ligne: {
        flexDirection: 'row',
        flexWrap: 'wrap',
    },
    btnUn: {
        marginLeft: 10,
        marginBottom: 15,
        backgroundColor: 'white',
        color: 'black',
        width: 90,
        height: 90,
        textAlign: "center",
        borderRadius: 30,
        fontSize: 50,
        paddingTop: 9,
    },
    btn: {
        marginLeft: 10,
        marginBottom: 15,
        backgroundColor: 'grey',
        color: 'white',
        width: 90,
        height: 90,
        textAlign: "center",
        borderRadius: 5,
        fontSize: 50,
        shadowColor: "grey",
        paddingTop: 9,
    },
    ecran: {
        marginTop: 50,
        marginBottom: 20,
        marginLeft: 10,
        backgroundColor: 'white',
        color: 'black',
        width: 390,
        height: 250,
        textAlign: "center",
        borderRadius: 10,
        fontSize: 50
    },
    shadowProp: {
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 12,
        },
        shadowOpacity: 0.58,
        shadowRadius: 16.00,

        elevation: 24,
    }

})