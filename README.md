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
![img.png](img.png)> 
> **Banco de Dados:**
![img_2.png](img_2.png)
#### **Listar Professores (GET)**
> **Insomnia:**
![img_3.png](img_3.png)
#### **Atualizar Professor (PUT)**
> **Insomnia:**
>![img_4.png](img_4.png)
> **Banco de Dados:**
>![img_5.png](img_5.png)
#### **Deletar Professor (DELETE)**
> **Insomnia:**
> ![img_6.png](img_6.png)
> **Banco de Dados:**
> ![img_7.png](img_7.png)
---

### 2. 👨‍🎓 Controller: Aluno

#### **Criar Aluno (POST)**
> **Insomnia:**
> ![img_8.png](img_8.png)
>
> **Banco de Dados:**
> ![img_9.png](img_9.png)

#### **Listar Alunos (GET)**
> **Insomnia:**
> ![img_11.png](img_11.png)
> 
#### **Atualizar Aluno (PUT)**
> **Insomnia:**
> ![img_12.png](img_12.png)
>
> **Banco de Dados:**
> ![img_13.png](img_13.png)

#### **Deletar Aluno (DELETE)**
> **Insomnia:**
> ![img_14.png](img_14.png)
>
> **Banco de Dados:**
> ![img_15.png](img_15.png)

---

### 3. 📚 Controller: Disciplina

#### **Criar Disciplina (POST)**
> **Insomnia:**
> ![img_17.png](img_17.png)
>
> **Banco de Dados:**
> ![img_18.png](img_18.png)

#### **Listar Disciplinas (GET)**
> **Insomnia:**
> ![img_19.png](img_19.png)

#### **Atualizar Disciplina (PUT)**
> **Insomnia:**
> ![img_20.png](img_20.png)
>
> **Banco de Dados:**
> ![img_21.png](img_21.png)

#### **Deletar Disciplina (DELETE)**
> **Insomnia:**
> ![img_22.png](img_22.png)
>
> **Banco de Dados:**
> ![img_23.png](img_23.png)

---

### 4. 📝 Controller: Matrícula

#### **Realizar Matrícula (POST)**
> **Insomnia:**
> ![img_24.png](img_24.png)
>
> **Banco de Dados:**
> ![img_25.png](img_25.png)

#### **Atualizar Notas (PATCH)**
> **Insomnia:**
> ![img_26.png](img_26.png)
>
> **Banco de Dados:**
> ![img_27.png](img_27.png)

#### **Trancar Matrícula (PUT/PATCH)**
> **Insomnia:**
> ![img_28.png](img_28.png)
>
> **Banco de Dados:**
> ![img_29.png](img_29.png)