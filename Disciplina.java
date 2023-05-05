public class Disciplina {
        String matricula;
        String nome;
        private double prova1;
        private double prova2;
        private double notaTrabalho;
        private double media;

        void calculaMediaFinal (double prova1, double prova2, double notaTrabalho){
            this.prova1 = prova1 * 2.5;
            this.prova2 = prova2 * 2.5;
            this.notaTrabalho = notaTrabalho * 2;
            this.media = (this.prova1 + this.prova2 + this.notaTrabalho)/3;
            System.out.println(this.nome);
            System.out.println(this.matricula);
            System.out.println("Media é = " + this.media);
        }

        void calculaQtdeNotaFaltanteFinal(){
            if (this.media < 60){
                double notaFinal = 60 - this.media;
                System.out.println("Falta " + notaFinal + " pontos para prova final");
            } else {
                System.out.println("Falta 0 pontos");
            }
        }
    }