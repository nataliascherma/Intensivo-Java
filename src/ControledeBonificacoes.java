public class ControledeBonificacoes {
        private double totalDeBonificacoes;

        public void registra(Funcionario funcionario) {
            this.totalDeBonificacoes += funcionario.getBonificacao();
        }

        public double getTotalDeBonificacoes() {
            return this.totalDeBonificacoes;
        }
    }
