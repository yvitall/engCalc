public class Parede {
    private double alturaParede;
    private double larguraParede;
    private double areaParede;

    public void setterAlturaParede(double alturaParede) {
        this.alturaParede = alturaParede;
    }

    public void setterLarguraParede(double larguraParede) {
        this.larguraParede = larguraParede;
    }

    public double getAlturaParede() {
        return alturaParede;
    }

    public double getLarguraParede() {
        return larguraParede;
    }

    public double calcularArea() {
        return this.alturaParede * this.larguraParede;
    }
}
