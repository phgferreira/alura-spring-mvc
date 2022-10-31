package br.com.alura.mvc.aluramvc.controller;

import br.com.alura.mvc.aluramvc.dto.PedidoDto;
import br.com.alura.mvc.aluramvc.model.Pedido;
import br.com.alura.mvc.aluramvc.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario(PedidoDto pedidoDto) {
        return "pedido/formulario";
    }

    @PostMapping("novo")
    // O @Valid executa as validações de NotBlank que estão dentro do PedidoDto
    public String novo(@Valid PedidoDto pedidoDto, BindingResult result) {
        if (result.hasErrors())
            return "pedido/formulario";

        Pedido pedido = pedidoDto.toPedido();
        pedidoRepository.save(pedido);

        return "redirect:/home";
    }

}
