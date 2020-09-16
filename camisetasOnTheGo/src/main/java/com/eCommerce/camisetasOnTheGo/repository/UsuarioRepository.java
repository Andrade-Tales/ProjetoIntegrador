package com.eCommerce.camisetasOnTheGo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eCommerce.camisetasOnTheGo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByEmail(String usuario);

}
