package br.edu.ifsp.orderflow.events;
/*
    * algo que ira consumir/reagir a um tipo especifico de evento
    * (uma class que implementa IDomainEvent).
    *
    * O parametro de tipo E garante, em TEMPO DE COMPILAÇÃO, que
    * um handler de PagamentoAprovado nunca receba um PagamentoRecusado.
 */
public interface IEventHandler<E extends IDomainEvent> {

    void handle(E event);


    /*
     * Qual tipo de evento esse handler trata/consume?
     *
     * necessário por causa do apagamento de tipo de Java (type erasure)
     * @return
     */

    Class<E> eventType();

}
