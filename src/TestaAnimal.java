public class TestaAnimal {
    public static void main(String[] args) {

        Animal animal = new Cachorro();
        animal.setNome("Rex");
        animal.setIdade(2);
        ((Cachorro) animal).correr(); // downcasting
        animal.emitirSom();
    }
}

