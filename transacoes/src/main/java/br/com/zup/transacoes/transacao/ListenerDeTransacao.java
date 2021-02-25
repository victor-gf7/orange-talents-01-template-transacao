package br.com.zup.transacoes.transacao;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoConsumer eventoDeTransacao) {
        System.out.println(eventoDeTransacao.toString());
    }
}
