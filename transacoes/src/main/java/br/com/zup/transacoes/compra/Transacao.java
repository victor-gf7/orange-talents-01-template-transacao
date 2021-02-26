package br.com.zup.transacoes.compra;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transacaoId;

    private BigDecimal valor;

    @Embedded
    private Estabelecimento estabelecimento;

    @Embedded
    private Cartao cartao;

    private LocalDateTime efetivadaEm;

    @Deprecated
    public Transacao() {
    }

    public Transacao(String transacaoId, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivadaEm) {
        this.transacaoId = transacaoId;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public Long getId() {
        return id;
    }

    public String getTransacaoId() {
        return transacaoId;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
