import Entities.PessoaFisica;
import Entities.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica("Willian", 1000);
        PessoaJuridica pj2 = new PessoaJuridica("Vanessa", 2000);
        PessoaJuridica pj3 = new PessoaJuridica("Carla", 3000);

        PessoaFisica pf = new PessoaFisica("Hygor", 1000);
        PessoaFisica pf2 = new PessoaFisica("Jackson", 2000);
        PessoaFisica pf3 = new PessoaFisica("Julia", 3000);

        System.out.println("----Pessoa juridica----");
        System.out.printf("Nome: %s; renda: R$%.2f; imposto: R$%.2f \n", pj.getNome(), pj.getRendaBruta(), pj.calcularImpostoRenda());
        System.out.printf("Nome: %s; renda: R$%.2f; imposto: R$%.2f \n", pj2.getNome(), pj2.getRendaBruta(), pj2.calcularImpostoRenda());
        System.out.printf("Nome: %s; renda: R$%.2f; imposto: R$%.2f \n", pj3.getNome(), pj3.getRendaBruta(), pj3.calcularImpostoRenda());

        System.out.println("\n----Pessoa física----");
        System.out.printf("Nome: %s; renda: R$%.2f; imposto: R$%.2f \n", pf.getNome(), pf.getRendaBruta(), pf.calcularImpostoRenda());
        System.out.printf("Nome: %s; renda: R$%.2f; imposto: R$%.2f \n", pf2.getNome(), pf2.getRendaBruta(), pf2.calcularImpostoRenda());
        System.out.printf("Nome: %s; renda: R$%.2f; imposto: R$%.2f \n", pf3.getNome(), pf3.getRendaBruta(), pf3.calcularImpostoRenda());
    }
}