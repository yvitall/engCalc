public class Parede {
    private float alturaParede;
    private float larguraParede;

    public void setterAlturaParede(float alturaParede) {
        this.alturaParede = alturaParede;
    }
    public void setterLarguraParede(float larguraParede) {
        this.larguraParede = larguraParede;
    }
    public float getAlturaParede() {
        return alturaParede;
    }
    public float getLarguraParede() {
        return larguraParede;
    }
    public float calcularArea(){

        return this.alturaParede * this.larguraParede;
    }

}
