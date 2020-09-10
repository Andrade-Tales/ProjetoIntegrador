package com.eCommerce.camisetasOnTheGo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Size(max = 1)
	private String tamanho;
	
	@NotNull
	private double preco;
	
	@NotNull
	@Size(min = 0, max = 1000)
	private int quantidade;
	
	@NotNull
	@Size(min = 2, max = 500)
	private String instituicao;
	
	@NotNull
	@Size(min = 2, max = 15)
	private String cor;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_categoria;
	
	

}
