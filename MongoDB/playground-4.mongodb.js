use("hopital");


// db.patient.insertOne({firstname: "Jakub", lastname: "Landowski", age: 25, history: [
//     {desease : "rhume",
// treatment: "sirop"},
// {desease: "grippe", 
// treatment: "anti-biotique"}
// ]})

// db.patient.insertOne({firstname: "Ja", lastname: "Lan", age: 25, history: [
//     {desease : "toux",
// treatment: "dafalgan"},
// ]})

// db.patient.insertOne({firstname: "Jakb", lastname: "Landows", age: 25, history: [
//     {desease : "covid",
// treatment: "medicament"},
// ]})



// db.patient.findOneAndUpdate(
//     { "_id": ObjectId("65a668a7ec0e7b9aca2b924e") },
//     {
//         $set: {
//             lastname: "test", age: 18,
//             history: [{ disease: "new", treatment: "test" }]
//         }
//     },
// )

// db.patient.find({ age: { $gt: 18 } })

// db.patient.deleteMany({ "history.desease": "toux" })