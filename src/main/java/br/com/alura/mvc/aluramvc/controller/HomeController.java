package br.com.alura.mvc.aluramvc.controller;

import br.com.alura.mvc.aluramvc.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Smart TV LG 55UQ801C0SB LCD 4K 55\" 100V/240V");
        pedido.setValorNegociado( new BigDecimal("3099.00"));
        pedido.setDataEntrega(LocalDate.parse("2022-12-30") );
        pedido.setUrlProduto("https://www.mercadolivre.com.br/smart-tv-lg-55uq801c0sb-lcd-4k-55-100v240v/p/MLB19641718?pdp_filters=item_id:MLB2900977372#searchVariation=MLB19641718&position=1&search_layout=grid&type=pad&tracking_id=7037e6a8-b613-41b5-90e5-e045f7f8a435&is_advertising=true&ad_domain=VQCATCORE_LST&ad_position=1&ad_click_id=ZmVlZjJhNzItOGJiMC00NTQ0LWJiNDAtNGY5ZjU3OGE5Njlh");
        pedido.setUrlImagem("https://http2.mlstatic.com/D_NQ_NP_680264-MLA51736863750_092022-O.webp");

        model.addAttribute("pedidos", Arrays.asList(pedido) );

        return "home";
    }
}
