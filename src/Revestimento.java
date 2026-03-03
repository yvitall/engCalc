import java.util.Locale;
import java.util.Scanner;

public class Revestimento {
    Scanner sc = new Scanner(System.in);
        private float alturaPecaRev;
        private float largPecaRev;
        private float areaPecaRev;
        private float areaTotalRevestimento;
        private int qtdCaixa;
        public void setterAlturaPecaRev() {
            System.out.println("DIGITE A ALTURA DO REVESTIMENTO CERÂMICO: (ex: 0.75)");
            this.alturaPecaRev = (float) sc.nextDouble();
        }
        public void setterLarguraPecaRev() {
            Locale.setDefault(Locale.US);
            System.out.println("DIGITE A LARGURA DO REVESTIMENTO CERÂMICO: (ex: 0.75)");
            this.largPecaRev = (float) sc.nextDouble();
        }
        public void calcularAreaPecaRevestimento(){
            this.areaPecaRev = this.alturaPecaRev * this.largPecaRev;
        }
        public void calcularAreaTotalRevestimento(){
            Parede v1 = new Parede();
            Esquadria v2 = new Esquadria();
            this.areaTotalRevestimento = v1.calcularArea() * v2.get();
        }


    }

