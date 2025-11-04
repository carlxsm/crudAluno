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

---

## Verificação no Banco de Dados (DBeaver)

Para visualizar os dados diretamente no banco, você pode se conectar ao H2 Database enquanto a aplicação está em execução.

1.  **Abra o DBeaver** e crie uma nova conexão.
2.  **Selecione "H2 Embedded"**.
3.  **Configure a conexão:**
    -   **Path:** Deixe em branco.
    -   **Database:** `jdbc:h2:mem:testdb` (Este é o nome padrão que o Spring Boot usa para o banco em memória. Verifique seu arquivo `application.properties` se for diferente).
    -   **User:** `sa`
    -   **Password:** (deixe em branco)
4.  **Teste e finalize a conexão.**

Após se conectar, você pode executar queries SQL para verificar os dados na tabela `PROFESSOR`.

**Exemplo de consulta:**
```sql
SELECT * FROM PROFESSOR;
```

**Resultado esperado após criar dois professores:**

| ID  | NOME        | EMAIL                   | CPF             |
|-----|-------------|-------------------------|-----------------|
| 1   | Luiz Carlos | luiz.carlos@escola.com  | 111.222.333-44  |
| 2   | Ana Maria   | ana.maria@escola.com    | 555.666.777-88  |

![Exemplo de Tabela no DBeaver](https://i.imgur.com/your-image-link.png) <!-- Troque este link por um print real da sua tela -->
