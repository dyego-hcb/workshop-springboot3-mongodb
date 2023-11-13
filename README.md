# Projeto - Spring Boot com MongoDB

Este é um projeto de exemplo que demonstra a criação de uma aplicação Spring Boot que utiliza o MongoDB como banco de dados. O projeto foi desenvolvido em várias etapas e inclui funcionalidades como entidades de usuário, consultas, relacionamentos e operações básicas do CRUD.

## Configuração

Para executar este projeto em sua máquina local, siga as etapas a seguir:

1. Clone este repositório

2. Abra o projeto em sua IDE preferida. Certifique-se de que você tenha o Spring Boot e o MongoDB instalados em sua máquina.

3. Configure as propriedades do banco de dados no arquivo `application.properties`. Você pode alterar a porta do Spring Tool Suite (STS) e a URL do MongoDB de acordo com suas necessidades.

4. Execute a aplicação Spring Boot. Os controladores REST estarão disponíveis nos endpoints definidos.

## Funcionalidades do Projeto

Este projeto inclui as seguintes funcionalidades:

- Criação de entidades de usuário.
- Consultas para buscar, inserir, atualizar e excluir usuários.
- Consulta com vários critérios, incluindo pesquisa de texto em títulos, corpos e comentários de postagens.
- Relacionamento entre usuários e postagens.
- Operações de CRUD para postagens.
- Projeção de dados usando DTOs.
- Consultas com Query Methods e @Query.

## Estrutura do Projeto

O projeto é estruturado em várias camadas:

- **Domain**: Contém as entidades de domínio, como a classe `User` e a classe `Post`.

- **Repository**: Inclui os repositórios que interagem com o MongoDB para buscar e armazenar dados.

- **Service**: Contém os serviços que lidam com a lógica de negócios.

- **Resource**: Implementa os controladores REST que expõem os endpoints da API.

- **DTO**: Possui classes DTO (Data Transfer Object) para projeção de dados.

- **Util**: Contém classes utilitárias, como a classe `URL` para tratar URLs.