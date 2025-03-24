## Nome do Projeto 🏢  
**Escola Integrada**

## Status do Projeto 📌  
🚧 Em desenvolvimento 🚧

## Objetivo do Projeto 🎯  
O sistema de gestão escolar tem como objetivo facilitar o controle acadêmico e administrativo de uma instituição de ensino. Ele permite o cadastro e autenticação de usuários (alunos, professores e coordenadores), o gerenciamento de notas e o acompanhamento do desempenho dos alunos, promovendo uma administração mais eficiente.

## Tecnologias Utilizadas 💻  
Versão Desktop

    Java: Linguagem de programação principal.
    MySQL: Banco de dados relacional.
    Swing: Biblioteca para criação de interfaces gráficas (GUI).
    JDBC: Conector para integração entre Java e MySQL.

Versão Web

    Java: Linguagem de programação utilizada no backend (com Spring Boot, por exemplo).
    MySQL: Banco de dados relacional.
    HTML5: Linguagem de marcação para estruturar o conteúdo das páginas.
    CSS3: Estilização e design moderno das páginas.
    JavaScript: Interatividade e dinamismo na interface do usuário.
    Thymeleaf: Motor de templates para integração do backend Java com o frontend HTML.

## Descrição 📋  
Este projeto foi desenvolvido em Java com interface gráfica em Swing e utiliza o MySQL como sistema de persistência de dados. O sistema oferece diversas funcionalidades que abrangem desde a autenticação de usuários até o cadastro e consulta de informações acadêmicas.

### Funcionalidades Principais ✨

- **Login e Autenticação:**  
  Permite o login de usuários com perfis distintos (Aluno, Professor e Coordenador), redirecionando cada um para a tela correspondente após a validação das credenciais.

- **Cadastro de Usuários:**  
  Possibilita o cadastro de novos alunos e professores, armazenando informações pessoais e acadêmicas, além dos dados para login.

- **Gerenciamento de Notas:**  
  Permite que professores cadastrem as notas dos alunos em diferentes disciplinas (Ciências, Geografia, História, Matemática e Português), bem como a consulta do histórico de notas pelos alunos.

- **Interface Amigável:**  
  Desenvolvido com Java Swing, o sistema possui uma interface intuitiva que facilita a navegação e o uso das funcionalidades por todos os perfis de usuário.

## Estrutura do Banco de Dados 🗄️  
O projeto utiliza um banco de dados MySQL denominado `colegioPI`, composto por tabelas que armazenam informações essenciais, tais como:

- **Usuários:**  
  Dados para autenticação, incluindo nome de usuário, senha e tipo de usuário.

- **Alunos:**  
  Informações pessoais e acadêmicas dos alunos, como nome, CPF, dados dos responsáveis, data de nascimento e turma.

- **Professores:**  
  Dados de cadastro dos professores, como nome, CPF e especialidade.

- **Disciplinas:**  
  Tabelas específicas para cada disciplina (Ciências, Geografia, História, Matemática e Português) que armazenam as notas dos alunos por período.

#### Exemplo de criação de tabela para Usuários:

```sql
-- Criação das tabelas
CREATE TABLE Usuario(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nomeUsuario VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL,
    tipoUsuario VARCHAR(40) NOT NULL
);
```
## Como Executar 🚀

### Configuração do Banco de Dados:
- Instale e configure o MySQL.
- Crie o banco de dados `colegioPI` e as tabelas necessárias conforme a estrutura do projeto.
- Atualize as credenciais de conexão no arquivo `conexao_db.java` (URL, USER e PASSWORD).

### Compilação e Execução:
- Importe o projeto em uma IDE como o NetBeans.
- Compile todas as classes do pacote `escola`.
- Execute a classe `Tela_inicial.java` para iniciar a aplicação.

### Utilização:
- Na tela inicial, escolha a opção desejada (Aluno, Professor ou Coordenador).
- Realize o login com as credenciais cadastradas ou efetue novos cadastros utilizando as telas específicas.
- Navegue pelas funcionalidades do sistema de acordo com o seu perfil.

## Créditos 👥

Desenvolvido por: DAVI CEZAR
