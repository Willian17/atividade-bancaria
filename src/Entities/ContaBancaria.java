package Entities;

import java.math.BigDecimal;
import java.util.Objects;

public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private BigDecimal saldo;


    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que 0");
        }
        saldo = saldo.add(valor);
    }



    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que 0");
        }
        if (getSaldoDisponivel().subtract(valor).compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo = saldo.subtract(valor);
    }

}
