package Entities;

import java.math.BigDecimal;

public class ContaEspecial extends ContaBancaria{
    private BigDecimal valorLimite;

    public ContaEspecial(String nomeCliente, int numConta, BigDecimal saldo, BigDecimal valorLimite) {
       super(nomeCliente, numConta, saldo);
       this.valorLimite=valorLimite;
    }


    public BigDecimal getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(BigDecimal valorLimite) {
        this.valorLimite = valorLimite;
    }

    @Override
    public void sacar(BigDecimal valor){
        if(valor.compareTo(getValorLimite()) > 0) {
            throw new IllegalArgumentException("O valor deve ser menor do que o limite");
        }
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que 0");
        }
        if (getSaldo().subtract(valor).compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.setSaldo(this.getSaldo().subtract(valor));
    }
}