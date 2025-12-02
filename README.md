# 🎓 Sistema de Gerenciamento Acadêmico (API Aluno Online)

Este projeto consiste em uma API REST desenvolvida com **Java** e **Spring Boot** para o gerenciamento de uma instituição de ensino.

## 🛠 Tecnologias Utilizadas

*   **Java 17+**
*   **Spring Boot** (Web, Data JPA)
*   **Banco de Dados:** (H2 ou PostgreSQL)
*   **Lombok**
*   **DBeaver**
*   **Insomnia**

---

## 📡 Endpoints e Testes

### 1. 👨‍🏫 Controller: Professor

#### **Criar Professor (POST)**
> **Insomnia:**
> ![Criar Professor](./images/Professor/criarProfessor.png)
>
> **Banco de Dados:**
> ![DB Criar Professor](./images/Professor/criarProfessorDB.png)

#### **Listar Professores (GET)**
> **Insomnia:**
> ![Listar Professores](./images/Professor/listarProfessores.png)

#### **Atualizar Professor (PUT)**
> **Insomnia:**
> ![Atualizar Professor](./images/Professor/atualizarProfessor.png)
>
> **Banco de Dados:**
> ![DB Atualizar Professor](./images/Professor/atualizarProfessorDB.png)

#### **Deletar Professor (DELETE)**
> **Insomnia:**
> ![Deletar Professor](./images/Professor/deletarProfessor.png)
>
> **Banco de Dados:**
> ![DB Deletar Professor](./images/Professor/deletarProfessorDB.png)

---

### 2. 👨‍🎓 Controller: Aluno

#### **Criar Aluno (POST)**
> **Insomnia:**
> ![Criar Aluno](./images/Aluno/criarAluno.png)
>
> **Banco de Dados:**
> ![DB Criar Aluno](./images/Aluno/criarAlunoDB.png)

#### **Listar Alunos (GET)**
> **Insomnia:**
> ![Listar Alunos](./images/Aluno/listarAlunos.png)

#### **Atualizar Aluno (PUT)**
> **Insomnia:**
> ![Atualizar Aluno](./images/Aluno/atualizarAluno.png)
>
> **Banco de Dados:**
> ![DB Atualizar Aluno](./images/Aluno/atualizarAlunoDB.png)

#### **Deletar Aluno (DELETE)**
> **Insomnia:**
> ![Deletar Aluno](./images/Aluno/deletarAluno.png)
>
> **Banco de Dados:**
> ![DB Deletar Aluno](./images/Aluno/deletarAlunoDB.png)

---

### 3. 📚 Controller: Disciplina

#### **Criar Disciplina (POST)**
> **Insomnia:**
> ![Criar Disciplina](./images/Disciplina/criarDisciplina.png)
>
> **Banco de Dados:**
> ![DB Criar Disciplina](./images/Disciplina/criarDisciplinaDB.png)

#### **Listar Disciplinas (GET)**
> **Insomnia:**
> ![Listar Disciplina](./images/Disciplina/listarDisciplina.png)

#### **Atualizar Disciplina (PUT)**
> **Insomnia:**
> ![Atualizar Disciplina](./images/Disciplina/AtualizarDisciplina.png)
>
> **Banco de Dados:**
> ![DB Atualizar Disciplina](./images/Disciplina/atualizarDisciplinaDB.png)

#### **Deletar Disciplina (DELETE)**
> **Insomnia:**
> ![Deletar Disciplina](./images/Disciplina/deletarDisciplina.png)
>
> **Banco de Dados:**
> ![DB Deletar Disciplina](./images/Disciplina/deletarDisciplinaDB.png)

---

### 4. 📝 Controller: Matrícula

#### **Realizar Matrícula (POST)**
> **Insomnia:**
> ![Criar Matricula](./images/Matricula/criarMatriculaAluno.png)
>
> **Banco de Dados:**
> ![DB Criar Matricula](./images/Matricula/criarMatriculaAlunoDB.png)

#### **Atualizar Notas (PUT/PATCH)**
> **Insomnia:**
> ![Atualizar Notas](./images/Matricula/atualizarNotas.png)
>
> **Banco de Dados:**
> ![DB Atualizar Notas](./images/Matricula/atualizarNotasDB.png)

#### **Trancar Matrícula (PUT/PATCH)**
> **Insomnia:**
> ![Trancar Disciplina](./images/Matricula/trancarDisciplina.png)
>
> **Banco de Dados:**
> ![DB Trancar Disciplina](./images/Matricula/trancarDisciplinaDB.png)