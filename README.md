# 🚀 Santander Bootcamp 2026 - Java Back-end com IA

[![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk)](https://openjdk.org/projects/jdk/21/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?logo=springboot)](https://spring.io/projects/spring-boot)
[![Spring Security](https://img.shields.io/badge/Spring%20Security-6.x-6DB33F?logo=springsecurity)](https://spring.io/projects/spring-security)
[![Gemini](https://img.shields.io/badge/Gemini-API-4285F4?logo=googlegemini)](https://ai.google.dev/gemini-api)
[![OpenAI Whisper](https://img.shields.io/badge/Whisper-OpenAI-412991?logo=openai)](https://openai.com/whisper/)
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE)

## 📌 Sobre o Bootcamp

Aprenda do zero como construir sistemas back-end robustos e seguros com **Java**, uma das linguagens mais utilizadas por grandes bancos e empresas no mundo há mais de duas décadas, e dê o próximo passo integrando **Inteligência Artificial** ao desenvolvimento.

**Domine:** fundamentos e sintaxe do Java 21 • APIs REST seguras com Spring Boot e Spring Security • Clean Architecture • integração com OpenFeign • IA generativa com Whisper (OpenAI) e Gemini (Google)

**Projeto final:** Assistente virtual inteligente por voz

---

## 📂 Estrutura do Repositório

A organização deste repositório segue o padrão de estudos do bootcamp, com exercícios numerados e projetos práticos.

📦 santander-bootcamp-2026-backend-ia/</br>
│</br>
├── 📁 exercicios/</br>
│ ├── exercicio-1.java</br>
│</br>
├── 📁 projetos/</br>
│ ├── projeto-1.java</br>
│</br>
├── 📁 images/</br>
│</br>
└── README.md</br>

---

## 🎯 Conteúdos por Módulo

### Fundamentos Java 21
| # | Tópico | Descrição |
|---|--------|------------|
| 1 | Fundamentos | Sintaxe, variáveis, operadores, entrada/saída |
| 2 | Estruturas de Controle | If/else, switch, loops (for, while, do-while) |
| 3 | POO | Classes, objetos, encapsulamento, construtores |
| 4 | Herança & Polimorfismo | Superclasses, sobrescrita, classes abstratas |
| 5 | Interfaces & Lambdas | Interfaces funcionais, expressões lambda, method reference |
| 6 | Collections & Streams | List, Set, Map, Stream API, Optionals |

### Spring Framework & Arquitetura
| # | Tópico | Descrição |
|---|--------|------------|
| 7 | Spring Boot | APIs REST, injeção de dependências, JPA/Hibernate |
| 8 | Spring Security | Autenticação, autorização, JWT, BCrypt |
| 9 | Clean Architecture | Separação em camadas, use cases, DTOs |
| 10 | OpenFeign | Consumo declarativo de APIs externas |

### Inteligência Artificial
| # | Tópico | Descrição |
|---|--------|------------|
| 11 | IA com Whisper & Gemini | Transcrição de áudio, geração de respostas contextuais |

---

## 🛠️ Tecnologias Utilizadas

| Categoria | Tecnologias |
|-----------|-------------|
| **Linguagem** | Java 21 |
| **Framework** | Spring Boot 3, Spring Data JPA, Spring Security |
| **Integração** | OpenFeign, Apache HTTP Client |
| **IA** | OpenAI Whisper API, Google Gemini API |
| **Build** | Maven / Gradle |
| **Banco de Dados** | H2 (dev), PostgreSQL (produção opcional) |
| **Documentação** | OpenAPI 3 (Swagger) |
| **Testes** | JUnit 5, Mockito |

---

## 📝 Como Estudar por Este Repositório

1. **Siga a ordem numérica** dos arquivos dentro da pasta `exercicios/`
2. Após dominar os exercícios de um módulo, parta para o **projeto correspondente** na pasta `projetos/`
3. As imagens em `images/` ajudam na visualização de arquitetura e fluxos

### Comandos úteis para rodar os códigos

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/santander-bootcamp-2026-backend-ia.git

# Exercícios simples de fundamentos
cd exercicios
javac NomeDoArquivo.java
java NomeDoArquivo

# Projetos Spring Boot
cd projetos/1-api-tarefas
./mvnw spring-boot:run   # ou ./gradlew bootRun
