package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Pablo Perez Paz
 */
public class Aro {

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public static final double LIMITERADIO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        setCoordenadaX(valorX);
    }

    public int obterX() {
        return getCoordenadaX();
    }

    public void establecerY(int valorY) {
        setCoordenadaY(valorY);
    }

    public int obterY() {
        return getCoordenadaY();
    }

    public void establecerRadio(double valorRadio) {

        setRadio(valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
    }

    public double obterRadio() {
        return getRadio();
    }

    public double obterDiametro() {
        return getRadio() * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    public void trasladarCentro(int trasladarX, int trasladarY){
        establecerX(obterX() + trasladarX);
        establecerY(obterY() + trasladarY);
    }
}