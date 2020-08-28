CREATE TABLE `Produto` (
	`id` bigint(5) NOT NULL AUTO_INCREMENT,
	`tamanho` varchar(5) NOT NULL,
	`preco` DECIMAL(10,2) NOT NULL,
	`quantidade` bigint(5) NOT NULL,
	`instituicao` varchar(255) NOT NULL,
	`id_categoria` bigint(5) NOT NULL,
	`cor` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Categoria` (
	`id_categoria` bigint(5) NOT NULL AUTO_INCREMENT,
	`tema` varchar(255) NOT NULL,
	`genero` varchar(255) NOT NULL,
	`manga` varchar(255) NOT NULL,
	PRIMARY KEY (`id_categoria`)
);

CREATE TABLE `cliente` (
	`nome` varchar(255) NOT NULL,
	`email` varchar(255) NOT NULL,
	`senha` varchar(255) NOT NULL
);

ALTER TABLE `Produto` ADD CONSTRAINT `Produto_fk0` FOREIGN KEY (`id_categoria`) REFERENCES `Categoria`(`id_categoria`);

