package br.com.alura.mvc.aluramvc;

import br.com.alura.mvc.aluramvc.model.Pedido;
import br.com.alura.mvc.aluramvc.repository.PedidoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class AluramvcApplication implements CommandLineRunner {

	private PedidoRepository pedidoRepository;

	public AluramvcApplication(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AluramvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Smart TV LG 55UQ801C0SB LCD 4K 55\" 100V/240V");
		pedido.setValorNegociado( new BigDecimal("3099.00"));
		pedido.setDataEntrega(LocalDate.parse("2022-12-30") );
		pedido.setUrlProduto("https://www.mercadolivre.com.br/smart-tv-lg-55uq801c0sb-lcd-4k-55-100v240v/p/MLB19641718?pdp_filters=item_id:MLB2900977372#searchVariation=MLB19641718&position=1&search_layout=grid&type=pad&tracking_id=7037e6a8-b613-41b5-90e5-e045f7f8a435&is_advertising=true&ad_domain=VQCATCORE_LST&ad_position=1&ad_click_id=ZmVlZjJhNzItOGJiMC00NTQ0LWJiNDAtNGY5ZjU3OGE5Njlh");
		pedido.setUrlImagem("https://http2.mlstatic.com/D_NQ_NP_680264-MLA51736863750_092022-O.webp");
		pedido.setDescricao("""
                A LG é inovação e isso pode ser visto em cada um dos seus produtos tecnológicos, especialmente pensados \u200B\u200Bpara que toda a família aproveite mais a vida. Ter uma televisão LG é tirar proveito da mais alta qualidade do mercado.
                Com Smart TV 55UQ801 você poderá acessar os aplicativos onde seu conteúdo favorito está localizado. Além disso, você pode navegar na web, interagir em redes sociais e se divertir com jogos de vídeo."""
		);

		pedidoRepository.save(pedido);
	}
}
