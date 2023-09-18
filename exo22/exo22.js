let i,
    j,
    chapitre=0




for (let i = 1; i < 4; i++) {
    document.getElementById('result').innerHTML +=
    'Chapitre ' + i + '<br>'
    for (let j = 1; j < 4; j++) {
        document.getElementById('result').innerHTML +=
     '   -Partie ' + i + '.' + j +'<br>'
        
    }
    
}

