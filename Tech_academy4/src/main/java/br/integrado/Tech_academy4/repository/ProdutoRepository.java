package br.integrado.Tech_academy4.repository;

import br.integrado.Tech_academy4.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
