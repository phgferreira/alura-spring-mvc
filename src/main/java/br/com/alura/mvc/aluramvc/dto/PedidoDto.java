package br.com.alura.mvc.aluramvc.dto;

import br.com.alura.mvc.aluramvc.model.Pedido;

import javax.validation.constraints.NotBlank;

public class PedidoDto {

    @NotBlank
    private String nomeProduto;

    @NotBlank
    private String urlProduto;

    @NotBlank
    private String urlImagem;

    private String descricao;

    @Override
    public String toString() {
        return "RequisicaoNovoPedido{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", urlProduto='" + urlProduto + '\'' +
                ", urlImagem='" + urlImagem + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto(this.nomeProduto);
        pedido.setUrlProduto(this.urlProduto);
        pedido.setUrlImagem(this.urlImagem);
        pedido.setDescricao(this.descricao);
        return pedido;
    }
}
