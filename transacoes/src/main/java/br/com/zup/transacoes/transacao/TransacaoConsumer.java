package br.com.zup.transacoes.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class TransacaoConsumer {

    private String id;
    private BigDecimal valor;
    private EstabelecimentoConsumer estabelecimentoConsumer;
    private CartaoConsumer cartaoConsumer;
    private LocalDateTime efetivadaEm;

    @Deprecated
    public TransacaoConsumer() {
    }

    public TransacaoConsumer(String id, BigDecimal valor, EstabelecimentoConsumer estabelecimentoConsumer,
                             CartaoConsumer cartaoConsumer, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimentoConsumer = estabelecimentoConsumer;
        this.cartaoConsumer = cartaoConsumer;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoConsumer getEstabelecimento() {
        return estabelecimentoConsumer;
    }

    public CartaoConsumer getCartaoConsumer() {
        return cartaoConsumer;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    @Override
    public String toString() {
        return "TransacaoConsumer{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimentoConsumer=" + estabelecimentoConsumer +
                ", cartaoConsumer=" + cartaoConsumer +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }
}
