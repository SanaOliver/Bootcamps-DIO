const alunos = ['Rosana', 'Vander', 'Luiz', 'Guilherme', 'Davi'];
console.log(alunos[0]);
console.log(alunos[1]);
console.log(alunos[2]);
console.log(alunos[6]);
alunos.push('Heloísa');
alunos[6] = 'Dani';
console.log(alunos);
alunos.pop(); //remove ultimo
console.log(alunos)
console.log(alunos.pop()); // exibi ultimo e o remove
console.log(alunos);
console.log(alunos.shift());// exibi o primeiro e o remove
console.log(alunos)

const notas = [];

notas.push(5);
notas.push(7);
notas.push(8);
notas.push(2);
notas.push(5);
console.log(notas.length);
let soma = 0;
for (let i =0; i < notas.length; i++){

    soma = soma + notas[i];
}
let media = soma / alunos.length;
console.log(media);

const nome = 'Rosana Souza Oliveira';
for (let i = 0; i< nome.length; i++){
    console.log(nome[i]);
}