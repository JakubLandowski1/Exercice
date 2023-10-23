import LineByLine from 'n-readlines'
import { mkdirSync} from 'fs'

let file = "./fichier.txt"


let line; 
let reader = new LineByLine(file)

while(line = reader.next()) {
    try {
        let fichier = line.toString().trim()
        mkdirSync(fichier)
    } catch (err) {
        console.error(`Erreur ${line.toString()}`)
   }
}