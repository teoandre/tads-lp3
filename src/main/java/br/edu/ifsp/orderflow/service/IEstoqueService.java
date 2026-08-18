package br.edu.ifsp.orderflow.service;

import br.edu.ifsp.orderflow.domain.Pedido;
import br.edu.ifsp.orderflow.domain.Produto;

public interface IEstoqueService {

    /** barra asterisco asterisco enter
     *
     * Repoe unidades de um produto no estoque
     *
     * @param produto
     * @param quantidade
     * @return void
     */
    public void adcionarEstoque(Produto produto, int quantidade);

    /**
     * Quantidade disponivel para um produto
     * @param produto
     * @return int
     */
    public int quantidadeDisponivel(Produto produto);

    /**
     * tenta reservar o estoque de todos os itens do pedido.
     * @param pedido
     * @return true se conseguiu reservar, false do contrario
     */
    public boolean reservar(Pedido pedido);

    /**
     * devolve ao estoque os itens de um pedido (ex: pagamento recusado)
     * @param pedido
     */
    void liberar(Pedido pedido);
}
