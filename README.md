
# Projeto de Gerenciamento Bancário em Java

👋 Bem-vindo ao Projeto de Gerenciamento Bancário! Este é um projeto em Java que visa desenvolver uma aplicação de gerenciamento bancário utilizando os principais conceitos do paradigma de Orientação a Objetos. Neste relatório, forneceremos uma visão geral do projeto, métodos utilizados e como executar o código.

## Introdução

Neste tópico de introdução, vamos fornecer uma visão geral do que será abordado neste relatório. Primeiramente, iremos apresentar o objetivo deste projeto, que é desenvolver uma aplicação de gerenciamento bancário utilizando os principais conceitos do paradigma de Orientação a Objetos em Java. Em seguida, vamos explicar cada parte do código desenvolvido e como elas contribuem para o funcionamento da aplicação. Finalmente, abordaremos o processo de instalação e configuração do ambiente de desenvolvimento com a IDE NetBeans, bem como a execução do código tanto dentro da IDE quanto no terminal do Windows. Através deste relatório, esperamos proporcionar uma compreensão clara do projeto desenvolvido e das ferramentas utilizadas para sua construção.

## Métodos Utilizados 

Antes de começar a desenvolver um projeto em Java utilizando a IDE NetBeans, é necessário preparar a máquina e baixar as ferramentas necessárias. A seguir, descreveremos os passos necessários para isso:

1. Verificar se a máquina possui o Java Development Kit (JDK) instalado. Caso não tenha, é possível baixar a versão mais recente no seguinte link: [Baixar JDK](https://www.oracle.com/java/technologies/downloads/)
2. Baixar e instalar a IDE NetBeans. A versão mais recente pode ser encontrada no seguinte link: [Baixar NetBeans](https://netbeans.apache.org/download/index.html)

Com essas ferramentas instaladas, já é possível começar a desenvolver projetos em Java utilizando a IDE NetBeans.

## Desenvolvimento

O desenvolvimento desse projeto consistiu em criar uma aplicação de gerenciamento bancário que possibilitasse ao usuário informar seu nome, sobrenome e CPF, além de permitir consultas de saldo, realização de depósitos e saques. Tudo isso deveria ser feito utilizando os principais conceitos do paradigma de Orientação a Objetos. O problema proposto envolveu o desenvolvimento de um sistema bancário simples, mas que ao mesmo tempo envolveu diversas funcionalidades importantes para uma aplicação real, como a manipulação de dados pessoais do usuário e a realização de operações bancárias. Além disso, o uso dos conceitos de Orientação a Objetos permitiu criar um código mais organizado e de fácil manutenção, o que é fundamental para projetos maiores e mais complexos.

### Explicando o que cada parte do código faz

O código é dividido em três partes principais: Operações Bancárias, Dados Pessoais e Gerenciamento Bancário.

#### Gerenciamento Bancário

A classe principal "GerenciaBanco" é responsável por exibir o menu para o usuário e receber as entradas do usuário. Ela utiliza as instâncias da classe "OperacoesBancarias" e "DadosPessoais" para realizar as operações bancárias e armazenar as informações pessoais do usuário. O método "exibirMenu" simplesmente exibe as opções de operações bancárias para o usuário.

```java
import java.util.Scanner;

public class GerenciaBanco {
    // ...
}
```

#### Dados Pessoais

A classe "DadosPessoais" é responsável por armazenar as informações pessoais do usuário. Ela possui três atributos: "nome", "sobrenome" e "cpf". Cada um desses atributos possui um getter e um setter para que as informações possam ser lidas e atualizadas.

```java
public class DadosPessoais {
    // ...
}
```

#### Operações Bancárias

A classe "OperacoesBancarias" é responsável por realizar as operações bancárias. Ela possui três métodos: "realizarDeposito", "realizarSaque" e "consultarSaldo". O método "realizarDeposito" recebe como parâmetro o valor a ser depositado e adiciona esse valor ao saldo atual. O método "realizarSaque" recebe como parâmetro o valor a ser sacado e verifica se o saldo atual é suficiente para realizar o saque. Se for, o valor é subtraído do saldo atual. O método "consultarSaldo" simplesmente retorna o saldo atual.

```java
public class OperacoesBancarias {
    // ...
}
```

## Executando o Código no NetBeans

Para executar o código no NetBeans, siga os seguintes passos:

1. Abra o arquivo "GerenciaBanco.java" na IDE NetBeans.
2. Clique com o botão direito do mouse no arquivo "GerenciaBanco.java".
3. Selecione a opção "Run File".

A IDE irá compilar o código e executá-lo dentro de sua própria interface, permitindo ao usuário interagir com a aplicação através da janela de saída do console. Outra opção é pressionar a tecla F6 na área de edição do arquivo "GerenciaBanco.java", que também compila e executa o código dentro da IDE. Ao executar o código dentro do NetBeans, é possível utilizar as funcionalidades da IDE para depurar o código, identificar possíveis erros e obter um melhor entendimento sobre o funcionamento da aplicação. Isso torna o desenvolvimento e teste de projetos em Java mais simples e eficiente.

🚀 Divirta-se explorando o projeto de gerenciamento bancário em Java!


# Resultados

### imagem 1 - informe os dados
![image](https://github.com/mauriciomholiveira/gerenciabanco/assets/99220549/9a0cefc3-1eb1-44d2-93d2-d105ed7ef8c3)

### imagem 2 - Realize um depósito
![image](https://github.com/mauriciomholiveira/gerenciabanco/assets/99220549/a0f81235-186f-4066-bca7-9b578420ddaa)

### imagem 3 - Realize um saque
![image](https://github.com/mauriciomholiveira/gerenciabanco/assets/99220549/79b5d3d3-4191-4b02-a081-238080be88c6)

### imagem 4 - Consulte o saldo
![image](https://github.com/mauriciomholiveira/gerenciabanco/assets/99220549/e4f88099-a5cb-4cdb-9c20-198b9aafd922)

### imagem 5 - Encerrar operação
![image](https://github.com/mauriciomholiveira/gerenciabanco/assets/99220549/fce0d6a0-e6d3-420f-a8ab-b9df1e79d596)

<br><br><br>

# Conclusão

Neste projeto, aplicamos conceitos fundamentais da programação orientada a objetos, como a criação de classes, objetos, atributos e métodos. Além disso, utilizamos estruturas de controle de fluxo, como condicionais e laços de repetição, para permitir a interação do usuário com a aplicação e a realização de operações bancárias simples.

A implementação foi realizada em Java, uma linguagem de programação versátil, e com o auxílio da IDE NetBeans, que proporcionou facilidade no desenvolvimento do projeto, sendo uma ferramenta poderosa e completa para o desenvolvimento em Java. A criação do projeto foi simplificada com o assistente de criação de projetos da IDE, e a implementação do código se beneficiou das funcionalidades da própria IDE, como autocompletar e depuração de código.

Ao finalizar a implementação, pudemos compilar e executar o código em um terminal, o que demonstra que o projeto está funcionando corretamente e atingindo seus objetivos. O aprendizado adquirido neste projeto pode ser aplicado em diversas outras aplicações que utilizam a programação orientada a objetos e a linguagem Java.

🎉 Obrigado por explorar este projeto de gerenciamento bancário em Java! 🚀
