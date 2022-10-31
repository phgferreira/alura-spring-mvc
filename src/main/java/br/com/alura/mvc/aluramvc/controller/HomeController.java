package br.com.alura.mvc.aluramvc.controller;

import br.com.alura.mvc.aluramvc.model.Pedido;
import br.com.alura.mvc.aluramvc.model.StatusPedido;
import br.com.alura.mvc.aluramvc.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public String home(Model model) {
        Iterable<Pedido> pedidos = pedidoRepository.findAll();

        model.addAttribute("pedidos", pedidos );
        return "home";
    }

    @GetMapping("{status}")
    public String aguardando(@PathVariable("status") String status, Model model) {
        Iterable<Pedido> pedidos = pedidoRepository.findByStatusPedido( StatusPedido.valueOf(status.toUpperCase()) );

        model.addAttribute("pedidos", pedidos );
        return "home";
    }
}
