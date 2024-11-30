package br.integrado.Tech_academy4.repository;

import br.integrado.Tech_academy4.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
