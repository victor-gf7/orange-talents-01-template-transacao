package br.com.zup.transacoes.transacao;



public class EstabelecimentoConsumer {

    private String nome;
    private String cidade;
    private String endereco;

    @Deprecated
    public EstabelecimentoConsumer() {
    }

    public EstabelecimentoConsumer(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "EstabelecimentoConsumer{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
