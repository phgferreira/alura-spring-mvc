package br.com.alura.mvc.aluramvc.repository;

import br.com.alura.mvc.aluramvc.model.Pedido;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

    List<Pedido> findByNomeProduto(String nomeProduto);

}
