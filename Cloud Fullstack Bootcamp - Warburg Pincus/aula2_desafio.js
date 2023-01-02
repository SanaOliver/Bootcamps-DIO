/* */

function calcularIMC(peso, altura){
    return peso / Math.pow(altura,2);
}
const peso = 60;
const altura = 1.75;
const imc = (calcularIMC (peso, altura)).toFixed(2);
console.log(imc);
if ( imc < 18.5){
    console.log('Abaixo do Peso.');
} else if ( imc>=18.5 && imc <25){
    console.log('Peso ideal.');
} else if(imc >=25 && imc<30){
    console.log('Acima do peso.');
} else if (imc >= 30 && imc<40){
    console.log('Obeso');
} else{
    console.log('Obesidade grave.');
}