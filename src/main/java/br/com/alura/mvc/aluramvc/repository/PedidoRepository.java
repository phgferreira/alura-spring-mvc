package br.com.alura.mvc.aluramvc.repository;

import br.com.alura.mvc.aluramvc.model.Pedido;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// Usando JPA precisa usar a anotação @Repository mas extendendos a CrudRepository não precisa
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

    List<Pedido> findByNomeProduto(String nomeProduto);

}
