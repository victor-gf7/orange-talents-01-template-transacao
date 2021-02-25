package br.com.zup.transacoes.transacao;


public class CartaoConsumer {

    private String id;
    private String email;

    @Deprecated
    public CartaoConsumer() {
    }

    public CartaoConsumer(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CartaoConsumer{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
