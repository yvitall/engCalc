public class Esquadria {
    private double alturaEsquadria;
    private double larguraEsquadria;

    public void setterAlturaEsquadria(double alturaEsquadria) {

        this.alturaEsquadria = alturaEsquadria;
    }

    public void setterLarguraEsquadria(double larguraJanela) {

        this.larguraEsquadria = larguraJanela;
    }

    public double getAlturaEsquadria() {

        return alturaEsquadria;
    }

    public double getLarguraEsquadria() {

        return larguraEsquadria;
    }

    public double calcularArea() {
        return this.alturaEsquadria * this.larguraEsquadria;
    }
}
