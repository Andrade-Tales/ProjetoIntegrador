package com.eCommerce.camisetasOnTheGo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eCommerce.camisetasOnTheGo.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByTemaContainingIgnoreCase (String tema);
}
