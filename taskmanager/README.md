# Task Manager

API REST para gerenciamento de tarefas criada durante o Santander Bootcamp 2026.

## Recursos

- Criar tarefas
- Listar tarefas
- Buscar tarefa por ID
- Atualizar tarefa
- Remover tarefa
- Validar dados de entrada
- Gerar documentação com Spring REST Docs

## Tecnologias

- Java 25
- Spring Boot
- Spring Web
- Spring Validation
- Spring REST Docs
- Gradle
- JUnit

## Endpoints

| Método | Rota | Descrição |
| --- | --- | --- |
| `POST` | `/tasks` | Cria uma tarefa |
| `GET` | `/tasks` | Lista todas as tarefas |
| `GET` | `/tasks/{id}` | Busca uma tarefa por ID |
| `PATCH` | `/tasks/{id}` | Atualiza uma tarefa |
| `DELETE` | `/tasks/{id}` | Remove uma tarefa |

## Rodar a aplicação

```bash
./gradlew bootRun
```

A API fica disponível em:

```text
http://localhost:8080/tasks
```

## Testes

```bash
./gradlew test
```

## Documentação

Gerar a documentação:

```bash
./gradlew asciidoctor
```

Arquivo gerado:

```text
build/docs/asciidoc/index.html
```
