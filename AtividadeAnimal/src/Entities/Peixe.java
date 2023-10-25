package Entities;

public class Peixe extends Animal {
    private String caracteristicas;


    public Peixe(String nome, int comprimento, String cor, String ambiente, double velocidade, String caracteristicas) {
        super(nome, comprimento, 0, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public Peixe(String nome, int comprimento, double velocidade) {
        super(nome, comprimento, 0, "Cinzenta", "Mar", velocidade);
        this.caracteristicas = "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return String.format("--------------\n Animal: %s\n Comprimento: %d cm\n Patas: %d\n Cor: %s\n Ambiente: %s\n Velocidade: %.1f m/s\n Caracteristica: %s",
                this.getNome(), this.getComprimento(), this.getPatas(), this.getCor(), this.getAmbiente(), this.getVelocidade(), getCaracteristicas());
    }
}
