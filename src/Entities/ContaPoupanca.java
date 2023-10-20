package Entities;

import java.math.BigDecimal;
import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;


    public ContaPoupanca(String nomeCliente, int numConta, BigDecimal saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public boolean calcularNovoSaldo(BigDecimal taxaRendimento) {
        Calendar calendar = Calendar.getInstance();

        if(this.diaRendimento == calendar.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo().add(this.getSaldo().multiply(taxaRendimento)));
            return true;
        }

        return false;
    }
}
