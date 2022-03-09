package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Pablo Perez Paz
 */
public class Aro {
    public static final double LIMITERADIO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    public void setCoordenadaX(int valorX) {
        coordenadaX=valorX;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaY(int valorY) {
        coordenadaY=valorY;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setRadio(double valorRadio) {

        radio=(valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
    }

    public double getRadio() {
        return radio;
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
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}