# Spring Boot API
<p align="center">
  <img src="https://github.com/viniciusalexandre2/arquitetura-web/blob/main/imgweb/Hello%20Word.png" alt="Hello Word" />
</p>

## Sobre o Projeto
Este projeto é uma API simples desenvolvida com Spring Boot, ideal para exemplificar a estrutura básica de uma aplicação Java e a criação de endpoints REST. A aplicação demonstra como retornar mensagens de teste através de dois endpoints.

## Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot**
- **Maven**

## Estrutura do Projeto
O projeto possui duas classes principais:

- **DemoApplication.java**  
  Classe principal que inicia a aplicação Spring Boot e define o endpoint:
  - **GET** `/api/vinicius` → Retorna "Hello Word!".

- **HelloController.java**  
  Classe que define o endpoint:
  - **GET** `/vinicius` → Retorna "hello world".

## Pré-requisitos
Antes de executar o projeto, certifique-se de ter instalado:
- **Java 17 ou superior**
- **Maven**
- Uma IDE de sua preferência (IntelliJ IDEA, VS Code, etc.)
- **Navegador** ou **Postman** para testar os endpoints

## Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone <URL_DO_REPOSITORIO>
