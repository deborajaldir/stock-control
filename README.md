# 📦 Stock Control API

API REST para gerenciamento de produtos em estoque.

> REST API for stock management, built with Spring Boot, featuring validation, exception handling, PostgreSQL integration and interactive API documentation.

---

## 🚀 Funcionalidades

- Criar produto
- Listar todos os produtos
- Buscar produto por ID
- Buscar produto por nome e categoria
- Atualizar produto
- Deletar produto
- Validação de dados com Bean Validation
- Tratamento global de exceções
- Documentação interativa com Swagger/OpenAPI
- Integração com PostgreSQL
- Deploy em produção

---

## 🌐 Deploy

### 🔹 Frontend
https://stock-control-frontend.vercel.app

### 🔹 Backend API
https://stock-control-api-owvi.onrender.com

### 🔹 Swagger Documentation
https://stock-control-api-owvi.onrender.com/swagger-ui/index.html

---

## 🛠️ Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- Swagger (OpenAPI)
- Maven
- Render

---

## 🧠 Arquitetura

O projeto segue o padrão em camadas:

- Controller → recebe requisições HTTP
- Service → regras de negócio
- Repository → acesso ao banco de dados

---

## 📚 Documentação da API

A API possui documentação interativa via Swagger:

### Ambiente local
```txt
http://localhost:8080/swagger-ui/index.html
```

### Produção
```txt
https://stock-control-api-owvi.onrender.com/swagger-ui/index.html
```

---

## 📷 Preview

### 🔹 API Overview
![Swagger](./swagger.png)

### 🔹 Example request & response (error handling)
![Swagger Test](./swagger-test.png)

---

## ▶️ Como executar o projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/deborajaldir/stock-control.git
```

---

### 2. Entrar na pasta do projeto

```bash
cd stock-control
```

---

### 3. Configurar as variáveis de ambiente

No arquivo `application.yml`:

```yml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/seu_banco
    username: seu_usuario
    password: sua_senha
```

---

### 4. Rodar a aplicação

#### Windows
```bash
mvnw.cmd spring-boot:run
```

#### Linux/Mac
```bash
./mvnw spring-boot:run
```

---

## 🔍 Exemplo de requisição

### Criar produto

```json
{
  "name": "Laptop Dell",
  "quantity": 10,
  "price": 3500.00,
  "category": "Electronics"
}
```

---

## ⚠️ Tratamento de erros

A API retorna erros padronizados:

```json
{
  "status": 404,
  "error": "Resource Not Found",
  "message": "Product not found with id: 1",
  "path": "/products/1"
}
```

---

## 📌 Status do projeto

✅ Backend finalizado  
✅ Frontend integrado  
✅ Deploy realizado  
✅ Projeto em produção

---

## 👩‍💻 Autora

Débora Jaldir

- GitHub: https://github.com/deborajaldir
- LinkedIn: (adicione seu link aqui depois)

---

## 💡 Objetivo

Este projeto foi desenvolvido para consolidar conhecimentos em desenvolvimento full stack, focando na construção de APIs REST, integração com banco de dados PostgreSQL, deploy de aplicações e comunicação entre frontend e backend.
