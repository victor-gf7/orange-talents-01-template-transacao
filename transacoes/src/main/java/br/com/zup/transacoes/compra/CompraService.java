package br.com.zup.transacoes.compra;

import br.com.zup.transacoes.transacao.TransacaoConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class CompraService {

    private final Logger logger = LoggerFactory.getLogger(CompraService.class);

    @PersistenceContext
    private EntityManager manager;

    @Transactional
    public void salvarCompra(TransacaoConsumer transacaoConsumer){
        Transacao transacao = transacaoConsumer.toTransacao();
        manager.persist(transacao);

        logger.info("Transação salva com sucesso!");
    }
}
