package Entities;

public class PessoaJuridica extends Contribuinte {


    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImpostoRenda() {

        return this.getRendaBruta() * 0.10;
    }
}
