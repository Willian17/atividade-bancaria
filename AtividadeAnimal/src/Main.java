import Entities.Animal;
import Entities.Mamifero;
import Entities.Peixe;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Camelo", 150, "Amarelo", "Terra", 2);
        Peixe peixe = new Peixe("Tuburão", 300, 1.5);
        Mamifero mamifero = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", 0.5, "Mel");

        System.out.println("Zoo: ");
        System.out.println(animal.toString());
        System.out.println(peixe.toString());
        System.out.println(mamifero.toString());


    }
}