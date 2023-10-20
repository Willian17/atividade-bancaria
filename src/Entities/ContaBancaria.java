package Entities;

import java.math.BigDecimal;

public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private BigDecimal saldo;

    public ContaBancaria(String nomeCliente, int numConta, BigDecimal saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

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
        if (getSaldo().subtract(valor).compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo = saldo.subtract(valor);
    }

    public String toString() {
        return "\n ---------- Conta --------- \n nome cliente:  " + this.getNomeCliente() + "\n Numero conta: " + this.getNumConta() + "\n saldo R$" + this.getSaldo();
    }

}
