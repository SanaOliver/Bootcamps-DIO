/*1 - crie uma classe para representar carros.
os carros possuem uma marca, cor e um gasto medio de combustivel/km.
crie um metodo que dado a quantidade de km e valor de combustivel nos de o valor gasto em reais
 para realizar o percurso. */

 class Carro{
    marca;
    cor;
    gastoMedio;

    constructor(marca, cor, gastoMedio){
        this.marca = marca;
        this.cor = cor;
        this.gastoMedio = gastoMedio;
    }
    calcularGasto(qtdKm,valorCombustivel){
        console.log((qtdKm/this.gastoMedio)*valorCombustivel);
    }
 }
 const c1 = new Carro('uno', 'vermelho', 10);
 c1.calcularGasto(40, 5);