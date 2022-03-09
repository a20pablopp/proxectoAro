package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Pablo Perez Paz
 */
public class Aro {
    public static final double LIMITERADIO = 0.0;
    public static final int LIM_INT_POSI = 2147483647;
    public static final int LIM_INT_NEGA = -2147483648;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        radio = estableceRadio(valorRadio);
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

        radio=estableceRadio(valorRadio);
    }

    public double getRadio() {
        return radio;
    }
    
    /*Se crean los dos metodos estáticos detallados a continuación, el 1º para
    *no invocar a un método set en el constructor. El segundo como resultado del
    *error que cabria esperarse si se utilizan parámetros muy grandes para 
    *trasladarX o Y valores que pueden superar el limite de los enteros
    *negativos y positivos, el método moverCoordenada evita esto.
    */
    public static double estableceRadio(double valorRadio) {
        if(valorRadio<0)
            valorRadio = LIMITERADIO;
        return valorRadio;
    }

    public static int moverCoordenada(int coordenada,int trasladar) {
        long suma = (long) coordenada + (long) trasladar;
        if(suma>LIM_INT_POSI){
            return LIM_INT_POSI;
        }else if(suma<LIM_INT_NEGA){
            return LIM_INT_NEGA;
        }else{
            return(coordenada + trasladar);
        }
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
        setCoordenadaX(getCoordenadaX() + moverCoordenada(getCoordenadaX(),trasladarX));
        setCoordenadaY(getCoordenadaY() + moverCoordenada(getCoordenadaY(),trasladarY));
    }
}