import Entities.ContaBancaria;
import Entities.ContaEspecial;
import Entities.ContaPoupanca;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContaEspecial contaEspecial = new ContaEspecial("Hygor", 125, BigDecimal.valueOf(250), BigDecimal.valueOf(200));
        ContaPoupanca contaPoupanca = new ContaPoupanca("Willian", 125, BigDecimal.valueOf(100), 19);


        contaEspecial.sacar(BigDecimal.valueOf(200));
        contaEspecial.depositar(BigDecimal.valueOf(100));

        contaPoupanca.sacar(BigDecimal.valueOf(100));
        contaPoupanca.depositar(BigDecimal.valueOf(150));

        System.out.println("Antes do rendimento  R$" + contaPoupanca.getSaldo());

        contaPoupanca.calcularNovoSaldo(BigDecimal.valueOf(0.10));

        System.out.println("Novo saldo apos rendimento R$" + contaPoupanca.getSaldo());

        System.out.println(contaEspecial.toString());
        System.out.println(contaPoupanca.toString());


    }
}