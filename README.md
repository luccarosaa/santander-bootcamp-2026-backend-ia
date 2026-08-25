# Santander Bootcamp 2026 - Back-end Java com IA

Repositório de estudos e projetos do Santander Bootcamp 2026, com foco em
Java, back-end, Spring Boot, persistência de dados e fundamentos para uso de IA
em aplicações.

## Conteúdo

| Pasta | Descrição |
| --- | --- |
| `exercicios/` | Exercícios básicos de Java organizados por tema |
| `jdbc-sample/` | Exemplo de acesso a banco com JDBC |
| `warehouse/` | Projeto Java com Gradle |
| `annotation-processor/` | Estudo de annotation processors em Java |
| `lab-design-patterns-java/` | Exemplos clássicos de Design Patterns em Java puro |
| `lab-design-patterns-spring/` | Lab de Design Patterns com Spring Boot e integração ViaCEP |
| `lab-design-patterns-desafio/` | API REST de controle financeiro pessoal com Spring Boot |

## Projeto em destaque

### `lab-design-patterns-desafio`

API REST para controle financeiro pessoal. Permite cadastrar receitas e
despesas, listar transações, buscar por id, atualizar, remover e consultar o
saldo total.

Principais recursos:

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Swagger/OpenAPI
- Maven

Endpoints principais:

| Método | Rota | Descrição |
| --- | --- | --- |
| `GET` | `/transacoes` | Lista todas as transações |
| `GET` | `/transacoes/{id}` | Busca uma transação por id |
| `GET` | `/transacoes/saldo` | Calcula o saldo total |
| `POST` | `/transacoes` | Cria uma transação |
| `PUT` | `/transacoes/{id}` | Atualiza uma transação |
| `DELETE` | `/transacoes/{id}` | Remove uma transação |

## Como rodar o desafio

```bash
cd lab-design-patterns-desafio
./mvnw spring-boot:run
```

Swagger:

```text
http://localhost:8080/swagger-ui.html
```

Testes:

```bash
./mvnw test
```

## Tecnologias usadas

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Web
- Swagger/OpenAPI
- H2 Database
- Maven
- Gradle
- JUnit

## Objetivo

Registrar a evolução dos estudos do bootcamp por meio de exercícios pequenos,
labs guiados e projetos práticos de back-end Java.
