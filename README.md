1
Escola Politécnica
Fundamentos de Programação
Trabalho Final (10,0)
O foco do trabalho está voltado para uma aplicação real: vocês irão desenvolver uma solução
para organização de consultas de uma clínica médica.
Crie uma classe chamada Paciente para representar um paciente que faz parte do cadastro de
uma clínica.
Esta classe deve armazenar os seguintes dados: nome, cpf, telefone, convênio, diagnóstico e
número de consultas do mês. Nesta classe devem existir mecanismos que permitam registrar
as informações de um paciente, alterar o telefone, convênio, diagnóstico e número de
consultas do mês. Além disso, a consulta de suas informações.
Também deverá possuir um método que recebe o valor de uma consulta por parâmetro e
retorna o valor total a ser pago pelas consultas do mês para aquele paciente.
É necessário também ter um método chamado toString que retorne um String com um resumo
das informações do paciente.
Use como critério para cadastrar o diagnostico a seguinte relação:
1- Covid
2- Dengue
3- Influenza
4- Meningite
5- Outro
Crie uma classe chamada CadastroPacientes para representar o cadastro de um setor da
clínica.
Considere que este classe deve armazenar objetos do tipo Paciente.
Crie um construtor que cria o cadastro (vetor de objetos) que pode armazenar até 10
pacientes.
Crie os seguintes métodos:
• Adicionar no vetor
• Remover do vetor
• Escrever todo vetor
• Escrever os nomes dos pacientes em ordem alfabética crescente
• Média das consultas dos pacientes cadastrados
• Porcentagem de pacientes com: Covid; Dengue; Influenza; Meningite; Outro
** indique em que posição do vetor eles estão!
Faça uma classe Aplicação que execute todos os métodos criados na classe CadastroPacientes.
É necessário um menu de opções para que o usuário possa escolher opções mais de uma vez,
sem a necessidade de executar o programa novamente.
