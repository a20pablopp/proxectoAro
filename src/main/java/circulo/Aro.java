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
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        coordenadaX=valorX;
    }

    public int obterX() {
        return coordenadaX;
    }

    public void establecerY(int valorY) {
        coordenadaY=valorY;
    }

    public int obterY() {
        return coordenadaY;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
    }

    public double obterRadio() {
        return radio;
    }

    public double obterDiametro() {
        return radio * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    public void trasladarCentro(int trasladarx, int trasladary){
        coordenadaX=coordenadaX + trasladarx;
        coordenadaY=coordenadaY + trasladary;
    }
}