public class VeiculoDemo {

        public static void main(String[] args) {
            Veiculo carro = new Veiculo();
            carro.passageiros = 5;
            carro.combustivel = 50.0;
            carro.consumo = 10.0; // Km/L

            System.out.println("Autonomia do veículo: " + carro.autonomia());
            System.out.println("Combustível necessário: " + carro.calculaCombustivel(200.0));
        }
    }

