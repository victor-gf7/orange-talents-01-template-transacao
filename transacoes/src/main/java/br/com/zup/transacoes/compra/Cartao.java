package br.com.zup.transacoes.compra;

import javax.persistence.Embeddable;

@Embeddable
public class Cartao {

    private String idCartao;

    private String email;

    @Deprecated
    Cartao() {
    }

    public Cartao(String idCartao, String email) {
        this.idCartao = idCartao;
        this.email = email;
    }

    public String getIdCartao() {
        return idCartao;
    }

    public String getEmail() {
        return email;
    }
}
