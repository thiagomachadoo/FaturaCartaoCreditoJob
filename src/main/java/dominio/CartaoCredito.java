package dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class CartaoCredito {
    private int numeroCartaoCredito;
    private Cliente cliente;

    public CartaoCredito(int numeroCartaoCredito, Cliente cliente) {
        this.numeroCartaoCredito = numeroCartaoCredito;
        this.cliente = cliente;
    }

    public int getNumeroCartaoCredito() {
        return numeroCartaoCredito;
    }

    public void setNumeroCartaoCredito(int numeroCartaoCredito) {
        this.numeroCartaoCredito = numeroCartaoCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
