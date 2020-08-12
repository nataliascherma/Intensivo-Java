public class Funcionario {
        private String nome;
        private String cpf;
        private double salario;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        // Os funcionários comuns recebem 10% do valor
        // do salário de bonificação
        public double getBonificacao() {
            return this.salario * 0.10;
        }
    }

