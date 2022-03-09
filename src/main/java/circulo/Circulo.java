package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Circulo
 * @author Pablo Perez Paz
 */
public class Circulo {
    public static final double MINIMO = 0.0;

    private int x;
    private int y;
    private double radio;

    public Circulo() {
    }

    public Circulo(int valorX, int valorY, double valorRadio) {
        x = valorX;
        y = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        x=valorX;
    }

    public int obterX() {
        return x;
    }

    public void establecerY(int valorY) {
        y=valorY;
    }

    public int obterY() {
        return y;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < MINIMO ? MINIMO : valorRadio);
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

    public double obterArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }

    public void trasladarCentro(int trasladarx, int trasladary){
        x=x + trasladarx;
        y=y + trasladary;
    }
}