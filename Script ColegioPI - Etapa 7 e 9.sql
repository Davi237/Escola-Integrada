CREATE DATABASE colegioPI;
USE colegioPI;

-- Criação das tabelas
CREATE TABLE Usuario(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nomeUsuario VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL,
    tipoUsuario VARCHAR(40) NOT NULL
);

CREATE TABLE Alunos(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nomeAluno VARCHAR(100) NOT NULL,
    nomePai VARCHAR(100) NOT NULL,
    nomeMae VARCHAR(100) NOT NULL,
    cpfAluno VARCHAR(50),
    dataNasc DATE, 
    turma VARCHAR(50)
    );
    
CREATE TABLE Professores(
   id INT AUTO_INCREMENT PRIMARY KEY,
   nome VARCHAR(100) NOT NULL,
   cpf VARCHAR(50),
   especialidade VARCHAR(50)
   );
   
CREATE TABLE Coordenadores(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(50)
    );

