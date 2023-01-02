/*Faça um programa para calcular o valor de uma viagem.
Voce tera 3 variaveis:
Preco do combustivel; Gasto medio de combustivel do carro por km; distancia percorrida em Km; */

const precoCombustivel = 5.79;
const kmPorLitro = 12;
const distancia = 1580;

const litrosConsumidos = distancia / kmPorLitro;
const valorViagem = litrosConsumidos * precoCombustivel;

console.log(valorViagem.toFixed(2));