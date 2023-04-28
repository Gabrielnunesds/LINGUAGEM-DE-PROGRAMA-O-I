public class Testadora {
        // psvm - Atalho Metodo Main
        public static void main(String[] args) {
            // sout - Atalho Metodo Print
            System.out.println("Olá Mundo!");

            int idade = 36;
            float altura = 1.77F;
            double peso = 92.5;
            String nome = "Messi";
            boolean fumante = false;

            Integer idade1 = 36;
            Float altura1 = 1.77F;
            Double peso1 = 92.5;
            Boolean fumante1 = false;

            boolean atividade = true;
            int atividadePorSemana = 4;
            boolean dor = true;
            int dorInt= 6;

            if (atividade == true) {
                System.out.println("Paciente realiza atividade fisica");
            }

                if (atividadePorSemana >=3){
                    System.out.println("Excelente voce pratica uma quantidade bacana!");
            }

                    else if (atividadePorSemana < 3){
                        System.out.println("Precisa aumentar a quantidade de dias");
            }

                    else {
                        System.out.println("Paciente Não realiza atividades fisica");
            }

            // Acaba atividade fisica- Inicia formulario de dor
            if (dor == true){
                System.out.println("Precisamos verificar essa dor");

                if (dorInt > 5)
                    System.out.println("Precisa procurar um médico");
            }
                    else{
                        System.out.println("Podemos tratar com o fisioterapeuta");
            }

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura + "mt");
        }
    }


