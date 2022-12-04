# Desafio de Projeto sobre Design Patterns (Padrões de Projeto) em Java - DIO

## Introdução

Apresentamos, nesse repositório, os arquivos referentes ao Desafio de Projeto "Explorando Padrões de Projetos na Prática com Java", que é parte dos requisitos do Bootcamp "Potência Tech powered by iFood - Java Beginners" da DIO.

Nosso objetivo neste trabalho é explorar o assunto "Padrões de Projeto" de uma maneira prática, desenvolvendo exemplos ilustrativos acerca de alguns padrões de projeto encontrados com frequência no dia a dia do trabalho com tecnologia.

## Definições

Segundo a [página da Wikipedia em português](https://pt.wikipedia.org/wiki/Padr%C3%A3o_de_projeto_de_software), podemos afirmar que:

> "Em Engenharia de Software, um padrão de desenho (português europeu) ou padrão de projeto (português brasileiro) (do inglês *design pattern*) é uma solução geral para um problema que ocorre com frequência dentro de um determinado contexto no projeto de software. (...) Ele é uma descrição ou modelo (*template*) de como resolver um problema que pode ser usado em muitas situações diferentes."

Em outras palavras, estudar padrões de projetos é estudar aspectos metodológicos segundo os quais podemos implementar códigos com mais qualidade e mais velocidade, reproduzindo ideias já sabidamente eficientes no momento do desenho de um software (ou parte dele). Sendo assim, um padrão de projeto é antes um *modelo de desenvolvimento* do que uma classe ou um objeto computacional.

Os padrões de projeto "Gang of Four" (GoF), descritos por Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides no livro "Design Patterns: Elements of Reusable Object-Oriented Software", podem ser classificados em três tipos:

- **Padrões de Criação**: utilizados para abstrair ou adiar o processo de criação de objetos;
- **Padrões Estruturais**: referem-se à forma como classes e objetos se relacionam para a formação de estruturas mais robustas;
- **Padrões Comportamentais**: tratam de algoritmos e das atribuições de responsabilidade entre os objetos.

## Implementação

As implementações trazidas neste repositório cobrem seis dos 24 padrões de projeto GoF. Mais especificamente, temos exemplos dos seguintes padrões:

- **Singleton**: Garante que apenas um único objeto de uma determinada classe seja instanciado (Padrão de Criação);
- **Prototype**: Permite que objetos criados à partir de uma determinada classe sejam clonados, criando-se outros objetos da mesma classe com os exatos mesmos atributos (Padrão de Criação);
- **Facade**: Implementação de uma interface simplificada para unificar sistemas e/ou classes distintas e oferecer uma alternativa amigável ao cliente. O nome vem da ideia de fazer uma "fachada" no código, que esconde as complexidades envolvidas (Padrão Estrutural);
- **Proxy**: É uma classe utilizada como interface para o acesso a outro objeto no código. Permite oferecer a adição de lógica ao acesso, tratando de questões de acesso a dados ou manejo de recursos (Padrão Estrutural);
- **Strategy**: Permite que o comportamento de um algoritmo seja modificado durante a execução do código, alterando a estratégia de aplicação adotada (Padrão Comportalmental);
- **State**: Permite alterar o comportamento de um objeto alterando-se o seu "estado" atual (Padrão Comportalmental).

Não é o objetivo deste trabalho cobrir todos os padrões de projeto GoF existentes, mas apenas exemplificar de maneira simplificada a implementação em linguagem Java de alguns deles. Os interessados podem consultar, por exemplo, o repositório [design-patterns-for-humans](https://github.com/design-patterns-for-humans/brazilian-portuguese#-strategy) para obterem mais informações e exemplos de aplicação sobre os 24 padrões.

O repositório original utilizado como referência neste trabalho pode ser acessado [clicando aqui](https://github.com/digitalinnovationone/lab-padroes-projeto-java).
