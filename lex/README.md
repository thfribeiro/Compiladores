Aplicação simples do Lex/Flex
Aluno: Thiago Fernandes Ribeiro RA:120160 - 201711113030010

Recebe como entrada um arquivo de texto, contendo um código fonte da linguagem C e transforma algumas de suas palavras reservadas em
PORTUGOL para um melhor entendimento de iniciantes na programação.

Seus tokens com atributos, são os de Biblioteca, onde o atributo é o nome da biblioteca utilizada, o de Números, onde o atributo é o valor
e o de Tipos, onde o atributo é o nome do tipo de dado que foi utilizado.

Para execução deve-se ter o lex instalado (Ubuntu):

sudo apt-get update

sudo apt-get install flex

Após isso, na pasta dos arquivos, abra um terminal e execute:

lex lex.l

gcc lex.yy.c

./a.out

Caso queira alterar o codigo fonte, deve-se alterar o arquivo "teste.txt".
