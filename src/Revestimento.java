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

    public double calcularAreaPecaRev() {
        return this.alturaPecaRev * this.largPecaRev;
    }

    public double calcularQtdPecas(double areaTotalLivre) {
        double areaPeca = calcularAreaPecaRev();
        return areaTotalLivre / areaPeca;
    }

}

