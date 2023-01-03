/* Crie uma classe para representar pessoas.
Para cada pesso teremos os atributos: nome, peso e altura.
As pessoas devem ter a capacidade de dizer o valor do seu IMC (peso/altura*altura)
Instancie uma pessoa chamada Jose que tenho 70kg e 1,75 de altura e peça ao José para dizer o valor do IMC. */

class Pessoa {
    nome;
    peso;
    altura;
    constructor(nome, peso, altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    calcularIMC() {
        return this.peso/(this.altura*this.altura);
    }
    classificarIMC(){
        const imc = this.calcularIMC();
        if ( imc < 18.5){
            return ('Abaixo do Peso.');
        } else if ( imc>=18.5 && imc <25){
            return('Peso ideal.');
        } else if(imc >=25 && imc<30){
            return('Acima do peso.');
        } else if (imc >= 30 && imc<40){
            return ('Obeso');
        } else{
            return ('Obesidade grave.');
        }
    }
}
const p1 = new Pessoa ('Jose', 70, 1.75);
console.log(p1);
console.log((p1.calcularIMC()).toFixed(2));
console.log(p1.classificarIMC());