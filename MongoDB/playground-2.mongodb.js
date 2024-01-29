// use('tp2');

// db.livre.find({type: "Book"});

// db.livre.find({year: {$gt: 2011}});

// db.livre.find({type: "Book", year: {$gt: 2014}});

// db.livre.find({ "authors": "Toru Ishida" });

// db.livre.distinct("publisher");

// db.livre.distinct("authors");



use('tp2');

// db.info.insertOne({nom: "Macbook Pro" , fabriquant: "Apple", prix: 11435.99, options: ["Intel Core i5", "Retina Display", "Long life battery"] });

// db.info.insertOne({nom: "Macbook Air" , fabriquant: "Apple", prix: 125974.73, options: ["Intel Core i7", "SSD", "Long life battery"] });

// db.info.insertOne({nom: "ThinkPad x230" , fabriquant: "Lenovo", prix: 114358.74, options: ["Intel Core i5", "SSD", "Long life battery"] });

// db.info.find();

// // db.info.findOne();

// let idThinkpad = db.info.findOne({nom: 'ThinkPad x230'});
// db.info.findOne({ _id: idThinkpad });

// db.info.find({ prix: { $gt: 13723 } });

// db.info.findOne({ ultrabook: true });

// db.info.createIndex({ nom: "text" });
// db.info.findOne({ $text: { $search: "Macbook" } });

// db.info.deleteMany({ fabriquant: "Apple" });

// let idProduit = db.info.findOne({nom: 'ThinkPad x230'}) ;
// db.info.deleteOne({ _id: idProduit });
