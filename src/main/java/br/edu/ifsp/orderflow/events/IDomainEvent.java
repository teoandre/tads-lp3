package br.edu.ifsp.orderflow.events;

/*
    * Representa um fato, algo que aconteceu no dominio como
    * PedidoCriado. PagamentoAprovado e etc. Quem publica um
    * evento nao sabe, e nem precisa saber, quem vai consumir/reagir (a)
    * ele.
 */

import java.time.Instant;

public interface IDomainEvent {
    Instant ocorridoEm();
}
