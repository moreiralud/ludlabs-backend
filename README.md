
# Ludlabs Backend

Este é o repositório do backend para o projeto Ludlabs. Ludlabs é uma aplicação de exemplo que demonstra um serviço de autenticação simples com Spring Boot.

Utilizo o banco de dados H2 para armazenar informações dos usuários. Para facilitar a configuração inicial, foi criado um arquivo data.sql que contém as informações necessárias de usuário e senha que foram solicitadas no technical challenge.

Usuário padrão: magalu
Senha: m@galu123

## Como Usar

Siga as instruções abaixo para configurar e executar o backend Ludlabs em sua máquina local.

### Pré-requisitos

Antes de começar, verifique se você possui as seguintes ferramentas instaladas em sua máquina:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [H2](https://www.h2database.com/html/main.html)

### Instalação

1. Clone este repositório para o seu ambiente de desenvolvimento:

   ```bash
   git clone https://github.com/moreiralud/ludlabs-backend.git

2. Navegue até o repositório clonado: 

     ``` bash 
     cd ludlabs-backend

3.	Compile o projeto com o seguinte comando:
```bash
    mvn clean install
```
4.	Inicie o servidor de desenvolvimento:
  ```bash
  mvn spring-boot:run
 ```

O servidor agora estará em execução em http://localhost:8080.

### Endpoint

**POST** /api/v1/auth/login: Efetua o login com um nome de usuário e senha fornecidos no corpo da solicitação.

**Exemplo de solicitação de login**

```
{
  "username": "seu_usuario",
  "password": "sua_senha"
}
```

**Exemplo de resposta de sucesso de login:**

```
{
  "username": "seu_usuario",
  "password": "sua_senha"
}
```

**Exemplo de resposta de erro de login:**
	
	Credenciais inválidas
	



   


  
