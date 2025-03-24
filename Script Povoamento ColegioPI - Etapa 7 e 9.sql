-- Povoamento das tabelas
INSERT INTO Usuario (nomeUsuario, email, senha, tipoUsuario) VALUES
('joao.silva', 'joao.silva@example.com', 'senha123', 'Aluno'),
('maria.souza', 'maria.souza@example.com', 'senha123', 'Aluno'),
('pedro.alves', 'pedro.alves@example.com', 'senha123', 'Aluno'),
('ana.martins', 'ana.martins@example.com', 'senha123', 'Aluno'),
('luana.pereira', 'luana.pereira@example.com', 'senha123', 'Aluno'),
('carlos.meneses', 'carlos.meneses@example.com', 'senha123', 'Aluno'),
('fernanda.rodrigues', 'fernanda.rodrigues@example.com', 'senha123', 'Aluno'),
('tiago.oliveira', 'tiago.oliveira@example.com', 'senha123', 'Aluno'),
('beatriz.santos', 'beatriz.santos@example.com', 'senha123', 'Aluno'),
('gustavo.lima', 'gustavo.lima@example.com', 'senha123', 'Aluno');

-- Inserir coordenador
INSERT INTO Coordenadores (nome, cpf) VALUES
('Carlos Silva', '12345678901');

-- Inserir professores
INSERT INTO Professores (nome, cpf, especialidade) VALUES
('Roberta Almeida', '23456789012', 'Matemática'),
('Marcelo Costa', '34567890123', 'Português'),
('Juliana Santos', '45678901234', 'História'),
('Felipe Pereira', '56789012345', 'Geografia'),
('Laura Lima', '67890123456', 'Ciências');

-- Inserir alunos
INSERT INTO Alunos (nomeAluno, nomePai, nomeMae, cpfAluno, dataNasc, turma) VALUES
('João Silva', 'José Silva', 'Maria Silva', '12345678901', '2008-01-15', '8A'),
('Maria Souza', 'Carlos Souza', 'Fernanda Souza', '23456789012', '2008-02-20', '8B'),
('Pedro Alves', 'Antonio Alves', 'Ana Alves', '34567890123', '2008-03-10', '8A'),
('Ana Martins', 'Paulo Martins', 'Claudia Martins', '45678901234', '2008-04-05', '8C'),
('Luana Pereira', 'Roberto Pereira', 'Eliane Pereira', '56789012345', '2008-05-25', '8B'),
('Carlos Meneses', 'João Meneses', 'Marcia Meneses', '67890123456', '2008-06-30', '8A'),
('Fernanda Rodrigues', 'Gustavo Rodrigues', 'Patrícia Rodrigues', '78901234567', '2008-07-15', '8C'),
('Tiago Oliveira', 'Miguel Oliveira', 'Luciana Oliveira', '89012345678', '2008-08-10', '8B'),
('Beatriz Santos', 'Eduardo Santos', 'Juliana Santos', '90123456789', '2008-09-25', '8A'),
('Gustavo Lima', 'Roberto Lima', 'Elisa Lima', '01234567890', '2008-10-05', '8C');

INSERT INTO Usuario (nomeUsuario, email, senha, tipoUsuario) VALUES
('roberta.almeida', 'roberta.almeida@example.com', 'senha123', 'Professor'),
('marcelo.costa', 'marcelo.costa@example.com', 'senha123', 'Professor'),
('juliana.santos', 'juliana.santos@example.com', 'senha123', 'Professor'),
('felipe.pereira', 'felipe.pereira@example.com', 'senha123', 'Professor'),
('laura.lima', 'laura.lima@example.com', 'senha123', 'Professor');

INSERT INTO Usuario (nomeUsuario, email, senha, tipoUsuario) VALUES
('Carlos Silva', 'carlos.silva@example.com', 'senha123', 'Coordenador');
