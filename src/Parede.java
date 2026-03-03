public class Parede {
    private float alturaParede;
    private float larguraParede;
    private float areaParede;
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
    public void getArea(double areaParede){
        this.areaParede = calcularArea();
    }

}
