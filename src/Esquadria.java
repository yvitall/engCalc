public class Esquadria {
    private float alturaEsquadria;
    private float larguraEsquadria;

    public void setterAlturaEsquadria(float alturaEsquadria) {
        this.alturaEsquadria = alturaEsquadria;
    }
    public void setterLarguraEsquadria(float larguraJanela) {
        this.larguraEsquadria = larguraJanela;
    }
    public float getAlturaEsquadria() {
        return alturaEsquadria;
    }
    public float getLarguraEsquadria() {
        return larguraEsquadria;
    }
    public float calcularArea(){
        return this.alturaEsquadria *  this.larguraEsquadria;
    }
}
