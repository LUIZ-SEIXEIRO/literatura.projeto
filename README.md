# LiterAlura

Este é um projeto de catálogo de livros interativo via console, desenvolvido como um desafio de programação. O LiterAlura busca informações de livros de uma API pública, as armazena em um banco de dados SQLite e permite que o usuário filtre e visualize os resultados através de um menu interativo.

## Funcionalidades

O projeto oferece as seguintes funcionalidades:

*   **Consulta à API Gutendex:** Busca informações de livros através da API pública Gutendex (https://gutendex.com/).
*   **Armazenamento em Banco de Dados:** Armazena informações de livros e autores em um banco de dados SQLite.
*   **Menu Interativo:** Permite que o usuário interaja com o catálogo via console, através de um menu com as seguintes opções:
    1.  Listar todos os livros.
    2.  Buscar livros por título.
    3.  Buscar livros por autor.
    4.  Listar todos os autores.
    5.  Sair.

## Como Executar o Projeto

1.  **Pré-requisitos:**
    *   Java Development Kit (JDK) 11 ou superior instalado.
    *   Maven instalado para gerenciamento de dependências.
    *   Uma IDE (IntelliJ IDEA, Eclipse, VS Code com extensões Java).

2.  **Clonar o Repositório:**
    ```bash
    git clone <URL do seu repositório>
    ```
    Substitua `<URL do seu repositório>` pela URL do seu repositório no GitHub.

3.  **Navegar até a Pasta do Projeto:**
    ```bash
    cd literalura
    ```

4.  **Compilar e Executar o Projeto:**
    *   Utilize sua IDE para compilar e executar o projeto.
    *   Ou, execute o projeto pelo terminal utilizando:
        ```bash
        mvn compile
        mvn exec:java -Dexec.mainClass="com.literalura.LiterAluraApp"
        ```

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

*   `src/main/java/com/literalura/api`: Contém a classe `ApiConnector` para realizar requisições HTTP à API.
*   `src/main/java/com/literalura/database`: Contém a classe `DatabaseManager` para gerenciar a conexão com o banco de dados SQLite.
*   `src/main/java/com/literalura/model`: Contém as classes `Book` e `Author` para representar os dados.
*   `src/main/java/com/literalura/Main.java`: Classe principal para testes iniciais.
*   `src/main/java/com/literalura/LiterAluraApp.java`: Classe principal que executa o menu e a lógica da aplicação.
*   `src/test/java/com/literalura/ApiConnectorTest.java`: Classe com testes unitários para `ApiConnector`.
*   `pom.xml`: Arquivo de configuração do Maven, onde estão definidas as dependências do projeto.
*   `.gitignore`: Define arquivos e pastas a serem ignorados pelo Git.

## Tecnologias Utilizadas

*   **Java 11+:** Linguagem de programação.
*   **Maven:** Gerenciador de dependências.
*   **java.net.http:** Para requisições HTTP.
*   **Jackson:** Biblioteca para manipulação de JSON.
*   **SQLite JDBC:** Driver para acesso ao banco de dados SQLite.
*   **JUnit 5:** Para testes unitários.
*   **Gutendex API:** API pública utilizada para obter informações de livros.

## Próximos Passos

*   Implementar o mapeamento completo do JSON para os objetos Java.
*   Implementar a inserção de dados no banco de dados SQLite.
*   Completar a lógica do menu interativo e as funcionalidades da aplicação.
*   Adicionar mais testes unitários.

## Contribuições

Contribuições são bem-vindas! Se você tiver alguma ideia ou encontrar algum bug, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Autor

[Seu Nome] - [Seu GitHub]
content_copy
download
Use code with caution.
Markdown

