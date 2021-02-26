package br.com.zup.transacoes.transacao;

import br.com.zup.transacoes.compra.CompraService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @Autowired
    private CompraService compraService;

    private final Logger logger = LoggerFactory.getLogger(CompraService.class);

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoConsumer eventoDeTransacao) {
        logger.info("Salvando Transação " + eventoDeTransacao.getId());

        compraService.salvarCompra(eventoDeTransacao);
    }
}
