import java.util.Locale;
public class Revestimento {
        private double alturaPecaRev;
        private double largPecaRev;
        public void setterAlturaPecaRev(double alturaPecaRev) {
            this.alturaPecaRev = alturaPecaRev;
        }
        public void setterLarguraPecaRev(double largPecaRev) {
            this.largPecaRev = largPecaRev;
        }
        public double getAlturaPecaRev() {
            return alturaPecaRev;
        }
        public double getLarguraPecaRev() {
            return largPecaRev;
        }
        public double getAreaPecaRev() {
            return this.alturaPecaRev * this.largPecaRev;
        }
        public double calcularQtdPecas(double areaTotalLivre){
            double areaPeca = getAreaPecaRev();
            return areaTotalLivre /  areaPeca;
        }

    }

