package br.integrado.Tech_academy4.repository;

import br.integrado.Tech_academy4.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
