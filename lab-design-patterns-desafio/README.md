# Lab Design Patterns Desafio

API REST de controle financeiro pessoal, criada como desafio de Design Patterns
com Spring Boot. A aplicação permite cadastrar receitas e despesas, consultar
transações e calcular o saldo total.

## Tecnologias

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Swagger/OpenAPI
- Maven

## Padrões usados

- **Facade**: `TransacaoService` concentra as operações da aplicação e simplifica
  o controller.
- **Repository**: `TransacaoRepository` usa Spring Data JPA para abstrair o acesso
  ao banco.
- **Singleton**: os beans do Spring são gerenciados pelo container e reutilizados
  pela aplicação.

## Funcionalidades

- Cadastrar receitas e despesas.
- Listar todas as transações.
- Buscar uma transação por id.
- Atualizar uma transação.
- Remover uma transação.
- Consultar o saldo total.

## Endpoints

### Consultas (R)

| Método | Rota | Descrição |
| --- | --- | --- |
| `GET` | `/transacoes` | Lista todas as transações |
| `GET` | `/transacoes/{id}` | Busca uma transação por id |
| `GET` | `/transacoes/saldo` | Calcula o saldo total |

### Escrita (CUD)

| Método | Rota | Descrição |
| --- | --- | --- |
| `POST` | `/transacoes` | Cria uma transação |
| `PUT` | `/transacoes/{id}` | Atualiza uma transação |
| `DELETE` | `/transacoes/{id}` | Remove uma transação |

## Exemplo de cadastro

O campo `id` não deve ser enviado. Ele é gerado automaticamente pelo banco.

```json
{
  "descricao": "Salario mensal",
  "valor": 2500.00,
  "tipo": "RECEITA",
  "categoria": "SALARIO",
  "data": "2026-08-25"
}
```

Valores aceitos para `tipo`:

- `RECEITA`
- `DESPESA`

Valores aceitos para `categoria`:

- `ALIMENTACAO`
- `TRANSPORTE`
- `MORADIA`
- `SAUDE`
- `EDUCACAO`
- `LAZER`
- `SALARIO`
- `OUTROS`

## Rodar o projeto

```bash
./mvnw spring-boot:run
```

Swagger:

```text
http://localhost:8080/swagger-ui.html
```

## Rodar os testes

```bash
./mvnw test
```
