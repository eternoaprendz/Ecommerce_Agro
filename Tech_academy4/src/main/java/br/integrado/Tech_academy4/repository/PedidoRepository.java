package br.integrado.Tech_academy4.repository;

import br.integrado.Tech_academy4.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository <Pedido, Integer> {
}
