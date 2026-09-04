# Marketplace

Projeto de estudo do Santander Bootcamp 2026 para um marketplace com persistencia poliglota.

## Arquitetura proposta

O sistema sera dividido por necessidade de dados, usando a tecnologia mais simples para cada caso:

- MySQL: controle e gerenciamento de usuários.
- PostgreSQL: dados transacionais, pedidos, pagamentos e integridade referencial.
- MongoDB: catalogos e eventos com estrutura variavel.
- Redis: bloqueio temporario, cache e controle de concorrencia em fluxos de alta disputa.

## Estado atual

Implementado neste momento:

- Aplicacao Spring Boot.
- Spring Data JPA.
- MySQL via Docker Compose automatico para desenvolvimento.
- Modelo inicial de cadastro de clientes.

Planejado:

- Trocar ou expandir o banco relacional para PostgreSQL.
- Adicionar MongoDB para catalogos/eventos.
- Adicionar Redis para ticket locking e TTL.

## Executando

```bash
./gradlew bootRun
```

O Spring Boot usa o `compose.yml` automaticamente para subir o banco de desenvolvimento.

## Testes

```bash
./gradlew test
```
