# 🎓 Sistema de Gerenciamento Acadêmico (API Aluno Online)

Este projeto consiste em uma API REST desenvolvida com **Java** e **Spring Boot** para o gerenciamento de uma instituição de ensino. O sistema permite o controle de Alunos, Professores, Disciplinas e o gerenciamento de Matrículas (lançamento de notas e trancamento).

## 🛠 Tecnologias Utilizadas

*   **Java 17+**
*   **Spring Boot** (Web, Data JPA)
*   **Banco de Dados:** (H2 ou PostgreSQL - *configure conforme seu application.properties*)
*   **Lombok**
*   **DBeaver** (Gerenciamento de Banco de Dados)
*   **Insomnia** (Testes de API)

---

## 📡 Endpoints e Testes (Insomnia & Banco de Dados)

Abaixo estão listadas as requisições para teste da API, acompanhadas dos prints de execução no **Insomnia** e da verificação dos dados no **DBeaver**.

### 1. 👨‍🏫 Controller: Professor

Gerenciamento dos docentes da instituição.

#### **1.1 Criar Professor**
*   **Método:** `POST`
*   **URL:** `/professor`
*   **JSON (Body):**
```json
{
  "nome": "Professor Girafales",
  "email": "girafales@escola.com",
  "cpf": "123.456.789-00"
}

Evidência Insomnia:

![alt text](./src/main/resources/images/Professor/criarProfessor.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Professor/criarProfessorDB.png)

1.2 Listar Professores

Método: GET

URL: /professor/all

Evidência Insomnia:

![alt text](./src/main/resources/images/Professor/listarProfessores.png)

1.3 Atualizar Professor

Método: PUT

URL: /professor/{id}

JSON (Body):

{
  "nome": "Professor Girafales (Editado)",
  "email": "girafales.edit@escola.com",
  "cpf": "123.456.789-00"
}

Evidência Insomnia:

![alt text](./src/main/resources/images/Professor/atualizarProfessor.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Professor/atualizarProfessorDB.png)

1.4 Deletar Professor

Método: DELETE

URL: /professor/{id}

Evidência Insomnia:

![alt text](./src/main/resources/images/Professor/deletarProfessor.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Professor/deletarProfessorDB.png)

2. 👨‍🎓 Controller: Aluno

Gerenciamento dos discentes.

2.1 Criar Aluno

Método: POST

URL: /aluno

JSON (Body):

{
  "nomeCompleto": "Chaves do Oito",
  "email": "chaves@vila.com",
  "cpf": "999.888.777-66"
}

Evidência Insomnia:

![alt text](./src/main/resources/images/Aluno/criarAluno.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Aluno/criarAlunoDB.png)

2.2 Listar Alunos

Método: GET

URL: /aluno/all

Evidência Insomnia:

![alt text](./src/main/resources/images/Aluno/listarAlunos.png)

2.3 Atualizar Aluno

Método: PUT

URL: /aluno/{id}

JSON (Body):

{
  "nomeCompleto": "Chaves da Silva",
  "email": "chaves.silva@vila.com",
  "cpf": "999.888.777-66"
}

Evidência Insomnia:

![alt text](./src/main/resources/images/Aluno/atualizarAluno.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Aluno/atualizarAlunoDB.png)

2.4 Deletar Aluno

Método: DELETE

URL: /aluno/{id}

Evidência Insomnia:

![alt text](./src/main/resources/images/Aluno/deletarAluno.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Aluno/deletarAlunoDB.png)

3. 📚 Controller: Disciplina

Gerenciamento das matérias e vinculação com professores.

3.1 Criar Disciplina

Método: POST

URL: /disciplinas

JSON (Body):

{
  "nome": "Matemática",
  "professor": {
    "id": 1
  }
}

Evidência Insomnia:

![alt text](./src/main/resources/images/Disciplina/criarDisciplina.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Disciplina/criarDisciplinaDB.png)

3.2 Listar Disciplinas

Método: GET

URL: /disciplinas/all

Evidência Insomnia:

![alt text](./src/main/resources/images/Disciplina/listarDisciplina.png)

3.3 Atualizar Disciplina

Método: PUT

URL: /disciplinas/{id}

JSON (Body):

{
  "nome": "Matemática Avançada",
  "professor": {
    "id": 1
  }
}

Evidência Insomnia:

![alt text](./src/main/resources/images/Disciplina/AtualizarDisciplina.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Disciplina/atualizarDisciplinaDB.png)

3.4 Deletar Disciplina

Método: DELETE

URL: /disciplinas/{id}

Evidência Insomnia:

![alt text](./src/main/resources/images/Disciplina/deletarDisciplina.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Disciplina/deletarDisciplinaDB.png)

4. 📝 Controller: Matrícula

Gerenciamento acadêmico, lançamento de notas e trancamentos.

4.1 Realizar Matrícula

Método: POST

URL: /matriculas

JSON (Body):

{
  "aluno": {
    "id": 1
  },
  "disciplina": {
    "id": 3
  }
}

Evidência Insomnia:

![alt text](./src/main/resources/images/Matricula/criarMatriculaAluno.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Matricula/criarMatriculaAlunoDB.png)

4.2 Atualizar Notas

Método: PUT (ou PATCH)

URL: /matriculas/atualizar-notas/{id}

JSON (Body):

{
	"nota1": 7.0,
	"nota2": 9.0
}

Evidência Insomnia:

![alt text](./src/main/resources/images/Matricula/atualizarNotas.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Matricula/atualizarNotasDB.png)

4.3 Trancar Matrícula

Método: PUT (ou PATCH)

URL: /matriculas/trancar/{id}

JSON (Body): (Vazio)

Evidência Insomnia:

![alt text](./src/main/resources/images/Matricula/trancarDisciplina.png)

Evidência Banco de Dados:

![alt text](./src/main/resources/images/Matricula/trancarDisciplinaDB.png)
