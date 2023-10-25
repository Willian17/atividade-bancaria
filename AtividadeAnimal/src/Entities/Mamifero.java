package Entities;

public class Mamifero extends Animal {
    private String alimento;


    public Mamifero(String nome, int comprimento, int patas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public Mamifero(String nome, int comprimento, int patas, String cor, double velocidade, String alimento) {
        super(nome, comprimento, patas, cor, "Terra", velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return String.format("--------------\n Animal: %s\n Comprimento: %d cm\n Patas: %d\n Cor: %s\n Ambiente: %s\n Velocidade: %.1f m/s\n Alimento: %s",
                this.getNome(), this.getComprimento(), this.getPatas(), this.getCor(), this.getAmbiente(), this.getVelocidade(), getAlimento());
    }
}
