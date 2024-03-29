package dominio;



import java.util.Date;

public class Transacao {
    private int id;
    private CartaoCredito cartaoCredito;
    private String descricao;
    private Double valor;
    private Date date;

    public Transacao(int id, CartaoCredito cartaoCredito, String descricao, Double valor, Date date) {
        this.id = id;
        this.cartaoCredito = cartaoCredito;
        this.descricao = descricao;
        this.valor = valor;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
