# Projeto API de Gestão Acadêmica - Spring Boot

Este projeto consiste em uma API RESTful desenvolvida em Java com Spring Boot para gerenciar entidades de um sistema acadêmico, como Alunos e Professores. A API implementa as operações básicas de CRUD (Create, Read, Update, Delete) para cada entidade.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Maven**
- **Lombok**
- **H2 Database** (Banco de dados em memória para desenvolvimento)

## Como Executar o Projeto
1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd seu-repositorio
    ```
3.  **Execute a aplicação com o Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```
A aplicação estará disponível em `http://localhost:8080`.

---

## Testando a API com o Insomnia

A seguir estão os detalhes para testar os endpoints da entidade **Professor**.

### 1. Criar Professor



- **Método:** `POST`
- **URL:** `http://localhost:8080/professor`
- **Body (JSON):**
  ```json
  {
      "nome": "Luiz Carlos",
      "email": "luiz.carlos@escola.com",
      "cpf": "111.222.333-44"
  }
  ```
- **Resposta:** `201 Created`

### 2. Listar Todos os Professores
- **Método:** `GET`
- **URL:** `http://localhost:8080/professor/all`
- **Resposta:** `200 OK` com a lista de professores.

### 3. Listar Professor por ID
- **Método:** `GET`
- **URL:** `http://localhost:8080/professor/{id}`
- **Exemplo:** `http://localhost:8080/professor/1`
- **Resposta:** `200 OK` com os dados do professor.

### 4. Atualizar Professor
- **Método:** `PUT`
- **URL:** `http://localhost:8080/professor/{id}`
- **Exemplo:** `http://localhost:8080/professor/1`
- **Body (JSON):**
  ```json
  {
      "nome": "Luiz Carlos da Silva",
      "email": "luiz.silva@escola.com",
      "cpf": "111.222.333-44"
  }
  ```
- **Resposta:** `204 No Content`

### 5. Deletar Professor
- **Método:** `DELETE`
- **URL:** `http://localhost:8080/professor/{id}`
- **Exemplo:** `http://localhost:8080/professor/2`
- **Resposta:** `204 No Content`
