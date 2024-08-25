# <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="50"/> ATIVIDADES BACK-END
tecnologias e linguagens utilizadas: Java, Maven, IntelliJ IDEA

<br/>
<br/>

## Exercício 00: Gerador de Username 

### OBJETIVO
Criar um programa que gere nomes de usuário (usernames) baseados em dois nomes fornecidos pelo usuário e um número aleatório.

### INSTRUÇÕES
- Crie um programa que solicite ao usuário que insira dois nomes (nome e sobrenome).
- Gere um número aleatório entre 1 e 100.
- Concatene o nome, sobrenome e o número aleatório para formar um nome de usuário.
- Exiba o nome de usuário gerado.

### ESPECIFICAÇÕES

Entradas (inputs)
O usuário fornecerá um nome e um sobrenome pelo console. Ex.: (Ronaldo e Fenomeno)

Saídas (outputs)
O programa exibirá um nome de usuário gerado automaticamente, combinando o nome fornecido com um número aleatório. Ex.: (RonaldoFenomeno98)

<br/>
<br/>

## Exercício 01: Recomendador de Filmes 

### OBJETIVO
Criar um programa recomende uma série, livro ou filme com base nas respostas fornecidas pelo usuário.

### INSTRUÇÕES
- Crie um programa que imprima ao usuário duas perguntas;
- Cada pergunta deve ser respondida com um número inteiro 1 ou 2;
- Caso o número não seja 1 ou 2, o programa deve ser encerrado sem erros;
- Ao final, o programa deve exibir uma recomendação com base nas respostas fornecidas pelo usuário;
- O programa deverá fornecer pelo menos quatro recomendações diferentes com base nas respostas fornecidas pelo usuário.

### CONJUNTO DE DADOS [opcional]
- Homens de Preto, Arrival, Shrek, Gladiador

Pergunta 1: Que ambientação você prefere?
  1. Sci-fi
  2. Medieval

Pergunta 2: Que gênero você prefere?
  1. Comédia
  2. Drama

Entradas (inputs)
O usuário responderá a cada pergunta digitando os números 1 ou 2 pelo console. Caso o número não esteja entre 1 e 2, o programa deve ser encerrado sem erros. Ex.: (1 e 1)

Saídas (outputs)
O programa exibirá o nome de uma série, livro ou filme recomendado com base nas respostas. Ex.: (Homens de Preto)

<br/>
<br/>

## Exercício 02: Gerador de Personagem 

### OBJETIVO
Criar um programa que gere e manipule personagens de jogo usando classes.

### INSTRUÇÕES
- Crie uma classe chamada Personagem que implemente os atributos nome, vida e ataque, além de dos métodos receberDano e atacar;
- O método receberDano recebe um parâmetro do tipo int que subtrai da vida do objeto. Se o valor da vida for menor ou igual a zero, o método deve imprimir uma mensagem informando que o personagem foi derrotado;
- O método atacar recebe um parâmetro do tipo Personagem chamado alvo e chama o método receberDano, passando o ataque do personagem atacante como parâmetro. Caso a vida do alvo seja igual a zero, o método deve imprimir uma mensagem informando que o ataque falhou;

- No método main da classe principal, crie crie uma lista de Personagem chamada de inimigos e adicione pelo menos três personagens diferentes;
- Crie um Personagem chamado jogador e use o método atacar passando como parâmetro aleatoriamente um dos personagens da lista inimigos. O jogador não deve atacar inimigos com vida igual a 0;
- Após o ataque do jogador, crie um loop que percorre a lista de inimigos e chama o método atacar de cada um deles passando como parâmetro o jogador;
- Repita os dois últimos passos até que o jogador ou todos os inimigos tenham a vida zerada e imprima o resultado final.

### ESPECIFICAÇÕES

Entradas (inputs)
- Orc / Vida: 100 / Ataque: 10
- Goblin / Vida: 50 / Ataque: 5
- Lobo / Vida: 75 / Ataque: 15
- Cavaleiro / Vida: 200 / Ataque: 20
- Dragão / Vida: 500 / Ataque: 50
- Steve / Vida: 100 / Ataque: 20

Saídas (outputs)
- Orc foi derrotado!
- Goblin foi derrotado!
- Steve foi derrotado!

<br/>
<br/>

## Exercício 03: Barcos e Portos 

### OBJETIVO
Criar um programa que gere e manipule barcos e portos usando classes e herança.

### INSTRUÇÕES
- Crie uma classe chamada Barco contendo os atributos nome e tamanho;
- Crie uma classe chamada BasePorto contendo os atributos nome, um array de barcosAtracados e dois métodos método chamados atracarBarco e desatracarBarco;
- O método atracarBarco recebe um objeto Barco e adiciona o barco ao array de barcosAtracados;
- O método desatracarBarco recebe um objeto Barco e remove o barco do array de barcosAtracados;

- Crie uma classe  chamada PortoPequeno que herda da classe BasePorto. Sobreescreva o método atracarBarcos para que ele permita apenas a atracagem de barcos com tamanho menor ou igual a 10;
- Crie uma classe  chamada PortoGrande que herda da classe BasePorto. Sobreescreva o método atracarBarcos` para que ele permita apenas a atracagem de barcos com tamanho maior ou igual a 10;

No método main:
- Crie uma lista contendo 5 barcos com diferentes tamanhos e dois portos (um pequeno e um grande);
- Percorra a lista de barcos e use o método atracarBarco para atracar cada barco em um dos portos;
- Os barcos devem tentar ser atracados primeiramente no porto pequeno e, se não puderem, devem ser atracados no porto grande.

### ESPECIFICAÇÕES

Entradas (inputs)
- Barco 1: Tamanho 2
- Barco 2: Tamanho 5
- Barco 3: Tamanho 7
- Barco 4: Tamanho 12
- Barco 5: Tamanho 20

Saídas (outputs)
- Barco 1 atracado no porto pequeno
- Barco 2 atracado no porto pequeno
- Barco 3 atracado no porto pequeno
- Barco 4 atracado no porto grande
- Barco 5 atracado no porto grande

<br/>
<br/>
