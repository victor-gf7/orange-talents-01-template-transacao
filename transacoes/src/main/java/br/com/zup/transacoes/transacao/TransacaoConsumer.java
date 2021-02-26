package br.com.zup.transacoes.transacao;

import br.com.zup.transacoes.compra.Cartao;
import br.com.zup.transacoes.compra.Estabelecimento;
import br.com.zup.transacoes.compra.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class TransacaoConsumer {

    private String id;
    private BigDecimal valor;
    private EstabelecimentoConsumer estabelecimento;
    private CartaoConsumer cartao;
    private LocalDateTime efetivadaEm;

    @Deprecated
    public TransacaoConsumer() {
    }

    public TransacaoConsumer(String id, BigDecimal valor, EstabelecimentoConsumer estabelecimento,
                             CartaoConsumer cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoConsumer getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoConsumer getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    @Override
    public String toString() {
        return "TransacaoConsumer{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimentoConsumer=" + estabelecimento +
                ", cartaoConsumer=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }

    public Transacao toTransacao() {
        return new Transacao(this.id, this.valor,
                new Estabelecimento(this.estabelecimento.getNome(), this.estabelecimento.getCidade(), this.estabelecimento.getEndereco()),
                new Cartao(this.cartao.getId(), this.cartao.getEmail()), this.efetivadaEm);
    }
}
