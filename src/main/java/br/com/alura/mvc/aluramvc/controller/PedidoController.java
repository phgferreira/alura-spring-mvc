package br.com.alura.mvc.aluramvc.controller;

import br.com.alura.mvc.aluramvc.dto.PedidoDto;
import br.com.alura.mvc.aluramvc.model.Pedido;
import br.com.alura.mvc.aluramvc.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario() {
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(PedidoDto pedidoDto) {
        Pedido pedido = pedidoDto.toPedido();
        pedidoRepository.save(pedido);

        return "home";
    }

}
