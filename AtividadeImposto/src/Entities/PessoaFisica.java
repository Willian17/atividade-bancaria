package Entities;

public class PessoaFisica extends Contribuinte {

    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImpostoRenda() {
        if(this.getRendaBruta() <= 1400) {
            return 0;
        }
        if (this.getRendaBruta() <= 2100) {
           return this.getRendaBruta() * 0.10;
        }
        if(this.getRendaBruta() <= 2800) {
            return this.getRendaBruta() * 0.15;
        }
        if(this.getRendaBruta() <= 3600) {
            return this.getRendaBruta() * 0.25;
        }
        return this.getRendaBruta() * 0.30;

    }
}
