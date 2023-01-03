/* Objeto colecao de chaves e valores*/
const pessoa = {
    nome : 'Rosana',
    idade: 34,
    /*Função em um objeto é chamado método*/
    descrever: function(){
        // this assume o objeto ao qual esta assossicado
        console.log('Meu  nome é ' + this.nome + ' e minha idade é ' + pessoa.idade);
    }
};

console.log(pessoa.idade);
console.log(pessoa.nome);
console.log(pessoa);
pessoa.descrever();

// Sobrescrever a função
pessoa.descrever = function(){
    console.log('Meu nome é ' + this.nome);
}
pessoa.descrever();


/* Incrementação dinamica*/
pessoa.altura = 1.69;
console.log(pessoa);
delete pessoa.nome;
console.log(pessoa);

//acessar valores dinamicamente
const atributo = 'Idade';
console.log(pessoa[atributo]);
console.log(pessoa['nome']);
pessoa['nome'] = "teste";

//classe - definição
class Pessoa {
    nome;
    idade;
    anoDeNascimento;
    /*setando obrigatoriamente as variaveis atraves do construtor
    constructor(){
        this.nome = 'teste';
        this.idade = 0;
    }*/
    //recebendo nome e idade como parametros para craiação do objeto
    constructor(nome, idade){
        this.nome = nome;
        this.idade = idade;
        this.anoDeNascimento = 2023 - idade;
    }

    descrever(){
        console.log('Meu  nome é ' + this.nome + ' e minha idade é ' + this.idade + ' a pessoa nasceu em: ' + this.anoDeNascimento);
    }
}

//instancia - ocorrencia, objeto da classe

const vander = new Pessoa('vander', 37);
//console.log(vander);
//vander.nome = "Vander";
//vander.idade = 37;
console.log(vander);
vander.descrever();

const rosana = new Pessoa();
console.log(rosana);
rosana.nome = "Rosana";
rosana.idade = 34;
console.log(rosana);
rosana.descrever();
vander.descrever();

new Pessoa('Renan', 30).descrever();