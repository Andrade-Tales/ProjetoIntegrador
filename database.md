# Explicação do Banco de Dados

## Grupo 7: 
- Bruno Stelzeneder, 
- Joilton Fraga, 
- Lucas Robert, 
- Tales Andrade, 
- Thiago Araujo

## Projeto: 
E-commerce para camisetas abordando causas socias e objetivos sustentáveis.

## Construção das 3 tabelas para base de dados do projeto integrador:

**Tabela Cliente**
- Nome: nome do cliente cadastrado na plataforma
- E-mail: e-mail do cliente que será usado para criar uma sessão dentro da plataforma
- Senha: senha do cliente que será usada para criar uma sessão dentro da plataforma

**Tabela Categoria**
- Id_categoria: identificação da categoria, chave primária
- Tema: tema que a camiseta irá abordar
- Genero: gênero especifico para determinado produto (masculino, feminino, unisex)
- Manga: o tipo de mangá que a camiseta irá ter

**Tabela Produto**
- Id: identificação do produto, chave primaria
- Tamanho: o tamanho da camiseta
- Preco: o preço pelo qual a camiseta será vendida
- Quantidade: a quantidade de camisetas disponíveis em estoque
- Instituicao: instituição que irá receber parte do valor da venda da camiseta
- Cor: as cores disponíveis para as camisetas em estoques
- Id_categoria: chave estrangeira, faz relação com a tabela de categoria
