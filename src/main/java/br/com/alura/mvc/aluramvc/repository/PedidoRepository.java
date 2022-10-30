package br.com.alura.mvc.aluramvc.repository;

import br.com.alura.mvc.aluramvc.model.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {
}
