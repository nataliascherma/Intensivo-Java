public class main1 {
    public static void main(String[] args) {

        ControledeBonificacoes controle = new ControledeBonificacoes();

        Gerente gerente = new Gerente();
        gerente.setSalario(5000.0);
        controle.registra(gerente);

        Funcionario func = new Funcionario();
        func.setSalario(1000.0);
        controle.registra(func);

        System.out.println(controle.getTotalDeBonificacoes());
    }
}

