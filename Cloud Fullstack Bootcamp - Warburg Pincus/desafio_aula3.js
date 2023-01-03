class Pessoa{
    nome;
    idade;
    constructor(nome, idade){
        this.nome = nome;
        this.idade = idade;
    }
}

function compararPessoas(p1,p2){
    if (p1.idade > p2.idade){
        console.log(p1.nome + ' é mais velho que ' + p2.nome);
    } else if (p2.idade > p1.idade){
        console.log(p2.nome + ' é mais velho que ' + p1.nome);
    } else {
        console.log(p1.nome + 'e' + p2.nome + 'são da mesma idade.')
    }
}

const p1 = new Pessoa('Rosana', 34);
const p2 = new Pessoa('Vander', 37);
compararPessoas(p1,p2)