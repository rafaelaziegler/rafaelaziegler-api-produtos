🛒 API Produtos

Uma API RESTful desenvolvida em Java com Spring Boot para gerenciar um catálogo de produtos. Inclui endpoints para cadastro, listagem, atualização e exclusão de produtos, com persistência em banco de dados PostgreSQL.

---

🔧 Tecnologias Utilizadas

- Java 17  
- Spring Boot 3.5.0  
- Spring Data JPA  
- PostgreSQL  
- Maven  
- Lombok  
- Postman (para testes)

---

⚙️ Requisitos

- Java 17 instalado
- PostgreSQL instalado e rodando
- Git instalado
- Maven configurado
- IDE recomendada: IntelliJ IDEA

---

📦 Configurações do Banco de Dados

Crie um banco de dados PostgreSQL com o nome `produtos_db`.

Exemplo de `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/produtos_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

---

▶️ Como Rodar Localmente

1. Clone o projeto:

```bash
git clone https://github.com/rafaelaziegler/api-produtos.git
cd api-produtos
```

2. Execute o projeto com Maven:

```bash
./mvnw spring-boot:run
```

A API será iniciada em:  
📍 `http://localhost:8081`

---

## 📌 Endpoints

### ➕ Criar Produto
- **Método:** `POST`
- **URL:** `/produtos`
- **Body:**
```json
{
  "nome": "Notebook",
  "descricao": "Notebook Dell",
  "preco": 3500.00
}
```
- **Resposta:** `201 Created`

---

### 📃 Listar Produtos
- **Método:** `GET`
- **URL:** `/produtos`
- **Resposta:**
```json
[
  {
    "id": 1,
    "nome": "Notebook",
    "descricao": "Notebook Dell",
    "preco": 3500.00
  }
]
```

---

### 🔁 Atualizar Produto
- **Método:** `PUT`
- **URL:** `/produtos/{id}`
- **Body:**
```json
{
  "nome": "Notebook Atualizado",
  "descricao": "Novo modelo",
  "preco": 4000.00
}
```

---

### ❌ Deletar Produto
- **Método:** `DELETE`
- **URL:** `/produtos/{id}`

