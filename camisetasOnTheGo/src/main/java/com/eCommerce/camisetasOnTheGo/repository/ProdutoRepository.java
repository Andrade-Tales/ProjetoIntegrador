package com.eCommerce.camisetasOnTheGo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eCommerce.camisetasOnTheGo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByInstituicaoContainingIgnoreCase (String instituicao);
	
	public List<Produto> findAllByCorContainingIgnoreCase (String cor);
	
	//SELECT * FROM tb_produto like %pedaço% -- nao fazendo distinção entre maiúsculas e minúsculas
}
