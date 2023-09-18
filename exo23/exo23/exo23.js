

for (let i = 1; i <= 10; i++) {
    document.getElementById('result').innerHTML +=
    'Table de ' +i + '<br>'
    for (let j = 1; j <= 10; j++) {
        document.getElementById('result').innerHTML +=
        i + 'x' + j + '=' + i*j+'<br>' 
    }
}